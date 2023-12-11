// Name: Daniel Hrebenar
// Class: CS361 - Software Engineering I
// Description: This method generates a help menu that users can use to see information about the application.

package dhrebs.pokedex;

public class HelpMenu extends javax.swing.JFrame {

    /**
     * Creates new form HelpMenu
     */
    public HelpMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        helpHeader = new javax.swing.JLabel();
        searchPageLabel = new javax.swing.JLabel();
        resultPageLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultHelp = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        searchHelp = new javax.swing.JTextPane();
        returnToSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        helpHeader.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
        helpHeader.setText("Pokédex Help");

        searchPageLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        searchPageLabel.setText("Search Page:");

        resultPageLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        resultPageLabel.setText("Result Page:");

        resultHelp.setEditable(false);
        resultHelp.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        resultHelp.setText("Back button: \n- Select the back button in the top left corner to go back to the search page\n\nHelp Button:\n- Select the help button in the top right corner to see the help menu and get additional information.\n\nReturn to Search:\n- Select the Return to Search button in the bottom right corner to return to the search page.");
        resultHelp.setToolTipText("");
        jScrollPane2.setViewportView(resultHelp);

        searchHelp.setEditable(false);
        searchHelp.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        searchHelp.setText("Search Function: \n- Type a name or number in the search bar up top to filter the table and find your desired Pokémon\n\nPokémon Table: \n- Click on a column header to sort that column by ascending or descending values.\n- Double click on a pokémon name to see data about that pokémon\n- Single click on a row of the table to highlight it. Then press the search button in the bottom right corner to see data about that pokemon\n\nHelp Button:\n- Select this button to see the help menu and get additional information.\n");
        searchHelp.setToolTipText("");
        jScrollPane3.setViewportView(searchHelp);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(helpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(283, 283, 283))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(returnToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(helpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(returnToSearch)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>                        

    private void returnToSearchActionPerformed(java.awt.event.ActionEvent evt) {                                               
        this.setVisible(false);
        new SelectionGUI().setVisible(true);
    }                                              

    // Variables declaration - do not modify                     
    private javax.swing.JLabel helpHeader;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane resultHelp;
    private javax.swing.JLabel resultPageLabel;
    private javax.swing.JButton returnToSearch;
    private javax.swing.JTextPane searchHelp;
    private javax.swing.JLabel searchPageLabel;
    // End of variables declaration                   
}
