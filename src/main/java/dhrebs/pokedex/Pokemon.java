package dhrebs.pokedex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;

public class Pokemon {
    private String name;
    private Integer number;
    private String height;
    private String weight;
    private String shortDescription;
    private String longDescription;
    private String type1;
    private String type2;

    private Pokemon(Integer pokemonNumber){
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/dhrebs/Desktop/pokedex/src/main/resources/pokemon.csv"))) {
            List<String> lines = new ArrayList<>();
            String line = null;
            while ((line = reader.readLine()) != null){
                lines.add(line);
            }
            reader.close();
            String result = lines.get(pokemonNumber);
            List<String> resultList = Arrays.asList(result.split(","));
            name = resultList.get(31);
            number = pokemonNumber;
            height = resultList.get(28) + " m";
            weight = resultList.get(39) + " kg";
            shortDescription = resultList.get(25);
            type1 = resultList.get(37);
            type1 = type1.substring(0,1).toUpperCase() + type1.substring(1);
            type2 = resultList.get(38);
            type2 = type2.substring(0,1).toUpperCase() + type2.substring(1);

            BufferedReader reader2 = new BufferedReader(new FileReader("/Users/dhrebs/Desktop/pokedex/src/main/resources/longDescription.csv"));
            List<String> lines2 = new ArrayList<>();
            String line2 = null;
            while ((line2 = reader2.readLine()) != null){
                lines2.add(line2);
            }
            reader2.close();
            String result2 = lines2.get(pokemonNumber);
            System.out.println(result2);
            List<String> resultList2 = Arrays.asList(result2.split(","));
            longDescription = resultList2.get(3);
        }

        catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nNumber: " + number + "\nHeight: " + height + "\nWeight: " + weight + "\nShort Description: " + shortDescription + "\nLong Description: " + longDescription + "\nType 1: " + type1 + "\nType 2: " + type2;
    }

    public String getName(){
        return name;
    }

    public String getHeight(){
        return height;
    }

    public String getWeight(){
        return weight;
    }

    public String getShortDescription(){
        return shortDescription;
    }

    public String getLongDescription(){
        return longDescription;
    }

    public String getType1(){
        return type1;
    }

    public String getType2(){
        return type2;
    }

    public static void main(String args[]) {
        Pokemon testPokemon = new Pokemon(144);
        System.out.println(testPokemon.toString());
    }
}
