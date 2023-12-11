package dhrebs.pokedex;

/**
 *
 * @author dhrebs
 */
public class Results extends javax.swing.JFrame {

    /**
     * Creates new form Results
     */
    public Results(Pokemon pokemonSelection) {
        Pokemon pokemon = pokemonSelection;
        initComponents(pokemon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(Pokemon pokemon) {

        helpButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        nameNumber = new javax.swing.JLabel();
        shortDescription = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        heightValue = new javax.swing.JLabel();
        weightValue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        longDescription = new javax.swing.JTextPane();
        weakness2 = new javax.swing.JLabel();
        strengthLabel = new javax.swing.JLabel();
        weaknessLabel = new javax.swing.JLabel();
        pokeType1 = new javax.swing.JLabel();
        pokeType2 = new javax.swing.JLabel();
        weakness1 = new javax.swing.JLabel();
        strength2 = new javax.swing.JLabel();
        strength1 = new javax.swing.JLabel();
        strength3 = new javax.swing.JLabel();
        returnToSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        helpButton.setIcon(new javax.swing.ImageIcon("/Users/dhrebs/Desktop/pokedex/src/main/resources/help_icon.png")); // NOI18N
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        backButton.setIcon(new javax.swing.ImageIcon("/Users/dhrebs/Desktop/pokedex/src/main/resources/back_button.jpeg")); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        image.setIcon(new javax.swing.ImageIcon("/Users/dhrebs/Desktop/pokedex/src/main/resources/pokemon_images/" + pokemon.getNumber().toString() + ".jpg")); // NOI18N

        nameNumber.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
        nameNumber.setText("#" + pokemon.getNumber() + " - " + pokemon.getName());

        shortDescription.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        shortDescription.setText(pokemon.getShortDescription());

        heightLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        heightLabel.setText("Height:");

        weightLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        weightLabel.setText("Weight:");

        heightValue.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        heightValue.setText(pokemon.getHeight());

        weightValue.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        weightValue.setText(pokemon.getWeight());

        longDescription.setEditable(false);
        longDescription.setBorder(null);
        longDescription.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        longDescription.setText(pokemon.getLongDescription());
        jScrollPane1.setViewportView(longDescription);

        weakness2.setIcon(new javax.swing.ImageIcon("/Users/dhrebs/Desktop/pokedex/src/main/resources/grass_small.png")); // NOI18N

        strengthLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        strengthLabel.setText("0.5x Damage to " + pokemon.getName());

        weaknessLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        weaknessLabel.setText("2x Damage to " + pokemon.getName());

        pokeType1.setIcon(new javax.swing.ImageIcon("/Users/dhrebs/Desktop/pokedex/src/main/resources/" + pokemon.getType1() + "_small.png")); // NOI18N
        if (pokemon.getType2() != "") {
            pokeType2.setIcon(new javax.swing.ImageIcon("/Users/dhrebs/Desktop/pokedex/src/main/resources/" + pokemon.getType2() + "_small.png"));
        }

        returnToSearch.setText("Return to Search");
        returnToSearch.setAlignmentY(0.0F);
        returnToSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addGap(18, 18, 18)
                                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(returnToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nameNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(shortDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(164, 164, 164))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(heightLabel)
                                                                .addComponent(weightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(weightValue)
                                                                .addComponent(heightValue))
                                                            .addGap(171, 171, 171))))
                                                .addGap(148, 148, 148)
                                                .addComponent(helpButton)))
                                        .addGap(16, 16, 16))))
                            ))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(660, Short.MAX_VALUE)
                    .addComponent(pokeType1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(65, 65, 65)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(backButton)
                        .addComponent(helpButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(nameNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shortDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heightValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(returnToSearch)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(pokeType1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(306, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setVisible(false);
        new HelpMenu().setVisible(true);
    }                                          

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setVisible(false);
        new SelectionGUI().setVisible(true);
    }                                          

    private void returnToSearchActionPerformed(java.awt.event.ActionEvent evt) {                                               
        this.setVisible(false);
        new SelectionGUI().setVisible(true);
    }                                              

    // Variables declaration - do not modify                     
    private javax.swing.JButton backButton;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JLabel heightValue;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel image;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane longDescription;
    private javax.swing.JLabel nameNumber;
    private javax.swing.JLabel pokeType1;
    private javax.swing.JLabel pokeType2;
    private javax.swing.JButton returnToSearch;
    private javax.swing.JLabel shortDescription;
    private javax.swing.JLabel strength1;
    private javax.swing.JLabel strength2;
    private javax.swing.JLabel strength3;
    private javax.swing.JLabel strengthLabel;
    private javax.swing.JLabel weakness1;
    private javax.swing.JLabel weakness2;
    private javax.swing.JLabel weaknessLabel;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JLabel weightValue;
    // End of variables declaration                   
}
