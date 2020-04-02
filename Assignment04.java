/* This program takes user input from a window
and gives a bar graph made of asterisks
and the values they entered
in another window */

// import the JOptionPane
import javax.swing.JOptionPane;

public class Assignment04{
    public static void main(String[] args){
        
        // Initialize variables for number storage
        int i, r, salesDivided, sales;
        // Variable for later string concatination
        String combineOutput = ("Today's Sales\n" + "============\n");
        // Create array for store names
        String[] storeNumber = {"Store 1: ", "Store 2: ", "Store 3: ",
         "Store 4: ", "Store 5: ", "Store 6: "};
         
         // For loop to iterate through the array
         for(i = 0; i < storeNumber.length; i++){
             // Window to get sales numbers
             sales = Integer.parseInt(JOptionPane.showInputDialog("Enter the sales in ($)" +
             " in multiples of 100 for " + storeNumber[i]));
             // Change user input to translate into number of asterisks
             salesDivided = sales / 100;
             // Concatinate output message and add store name from array
             combineOutput += storeNumber[i];
             /* For loop to iterate through sales numbers and 
             give asterisks to represent each $100 sales */
             for(r = 1; r <= salesDivided; r++){
                 // Concatinate output message and add asterisks (if $0 it will not give an asterisk)
                 combineOutput += "*";
             }
             /* Concatinate output message and add total $ amount of sales the user enterd
             (Counting tiny asterisks is kindaa difficult) :P */
             combineOutput += (" ($" + sales + ")");
             combineOutput += "\n";
         }
         /* Display fully concatinated message
         with all store names, asterisk bars
         and sales numbers entered by the user */
         JOptionPane.showMessageDialog(null, combineOutput);
    }
}