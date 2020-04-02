/*
Profit = ((ns * sp) - sc) - ((ns * pp) - pc)
Where ns is the number of shares, sp is the sale price, sc is the sale commission,
pp is the purchase price, and pc is the purchase commission
This program will calculate the potential profit and tell the user if they got a loss or gain
and display the amount they lost or gained
*/

import javax.swing.JOptionPane;

public class Assignment06{
    //method to calculate the stock profit or loss
    public static double calcProfit(double ns, double sp, double sc, double pp, double pc){
        double profit = 0.0;
        profit = ((ns * sp) - sc) - ((ns * pp) - pc);
        return profit;    
    }

    public static void main(String[] args){
        //Initialize variables with strings for displaying formatted output
        boolean endProgram = false;
        double profit = 0.0;
        String last = "";
        String choice;
        String lossGain = "";
        double ns = 0;
        String shares = "";
        double sp = 0.0;
        String sale = "";
        double sc = 0.0;
        String saleCom = "";
        double pp = 0.0;
        String purchase = "";
        double pc = 0.0;
        String purchaseCom = "";

        //do loop so the user can play around with entering multiple values
        do{
            choice = JOptionPane.showInputDialog("Stock Profit Calculator\n" +
            "1. Enter the number of shares\n" + 
            "2. Enter the amount you sold the shares for\n" + 
            "3. Enter the cost of the sales commission\n" +
            "4. Enter the amount you purchased the shares for\n" + 
            "5. Enter the cost of the purchase commission\n" + 
            "6. Calculate profit\n" + "7. End program" + 
            shares + sale + saleCom + purchase + purchaseCom + last + lossGain);
            //Switch statement
            switch(choice){
                case "1":
                ns = Double.parseDouble(JOptionPane.showInputDialog("Number of shares: "));
                //Formats the shares variable to 0 decimals and allows it to be passed into the JOptionPane for viewing
                shares = String.format("\n\nCurrent number of shares: %.0f\n", ns);
                break;
                case "2":
                sp = Double.parseDouble(JOptionPane.showInputDialog("Sale price: "));
                //Formats the sale price to 2 decimal places and allows it to be passed into the JOptionPane for viewing
                sale = String.format("Current sale price : $%.2f\n", sp);
                break;
                case "3":
                sc = Double.parseDouble(JOptionPane.showInputDialog("Sales commission price: "));
                //Same as sale from case 2
                saleCom = String.format("Current sales commission price: $%.2f\n", sc);
                break;
                case "4":
                pp = Double.parseDouble(JOptionPane.showInputDialog("Purchase price: "));
                //Same as sale from case 2
                purchase = String.format("Current purchase price: $%.2f\n", pp);
                break;
                case "5":
                pc = Double.parseDouble(JOptionPane.showInputDialog("Purchase commission price: "));
                //Same as sale from case 2
                purchaseCom = String.format("Current purchase commission price: $%.2f\n", pc);
                break;
                case "6":
                //Call the calcProfit method to run the calculation on the variables
                profit = calcProfit(ns, sp, sc, pp, pc);
                /*Clears the lossGain variable to avoid doubling up the results (I was getting "a gain!" and when running again getting "a gain! a loss")
                or whatever depending on the first result                */
                lossGain = "";
                //Same as sale from case 2
                last = String.format("Last result: $%.2f for%s", profit, lossGain);
                if(profit < 0){
                    //If the profits are negative, display the user took a loss
                    lossGain = " a loss!\n";
                }else if(profit == 0){
                    //If the profits are 0, display the user didn't lose or gain
                    lossGain = " no loss or gain!\n";
                }else{
                    //If the profits are positive, display the user got a gain
                    lossGain = " a gain!!\n";
                }
                break;
                case "7":
                //Exit message for when the user quits the program and sets the quit value to true
                JOptionPane.showMessageDialog(null, "Thanks for stopping by!");
                endProgram = true;
                break;
                default:
                //If the user doesn't enter a number 1-7
                JOptionPane.showMessageDialog(null, "Enter a value from the menu!");
            }
        }
        //Continues the program until the user enters 7 to quit the program
        while(endProgram != true);
    }
}