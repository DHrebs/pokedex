// Name: Daniel Hrebenar
// Class: CS361 - Software Engineering I
// Description: This is the number generator class. Because the microservice uses a text file to recieve and output information, this class handles reading and writing to the text file.
// It is used in the SelectionGUI class.

package dhrebs.pokedex;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Thread;
import java.nio.file.Paths;
import java.nio.file.Files;

public class NumberGenerator {

    public static void requestNumber() throws IOException{
        // Accept a string  
        String str = "request"; 

        // attach a file to FileWriter  
        FileWriter fw=new FileWriter("/Users/dhrebs/Desktop/rng_output.txt"); 

        // read character wise from string and write  
        // into FileWriter  
        for (int i = 0; i < str.length(); i++) 
        fw.write(str.charAt(i)); 

        System.out.println("Writing successful"); 
        //close the file  
        fw.close();
    }
    
    public static String getNumber() throws IOException{
        // check if File exists or not 
        FileReader fr=null; 
        try
        { 
            fr = new FileReader("/Users/dhrebs/Desktop/rng_output.txt"); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        } 
  
        // read from FileReader till the end of file

        String result = new String(Files.readAllBytes(Paths.get("/Users/dhrebs/Desktop/rng_output.txt")));
        System.out.println("The result is: " + result);
  
        // close the file
        fr.close();
        return result; 
    }

    public static void generateNumber() throws IOException {
    requestNumber();
    try{
        Thread.sleep(5000);
    }
    catch (Exception e) {
        System.out.println(e);
    }
    getNumber();
}
    
}
