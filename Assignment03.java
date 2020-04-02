/*This program gets user input
to determine their monthly cost of data
and let's them know if they went over
and how much their monthly cost is
with the additional data charges
String.format() to keep the double to 2 decimal places
*/

//Import JOptionPane for use
import javax.swing.JOptionPane;

public class Assignment03{
    public static void main(String[] args){
//Initialize variables for monthly costs
    double silverCost = 11.99;
    double goldCost = 25.99;
    double platCost = 35.99;
//Initialize a variable to store the value if the user exceeds maximum data usage
    double monthlyTotal;
//Initialize a variable to store the value of how many GB the user went over their limit
    int overData;

      String userPlan = JOptionPane.showInputDialog("Which plan are you enrolled in?\n" + 
      "Silver\n" + "Gold\n" + "Platinum");

//If statement for silver
      if(userPlan.equalsIgnoreCase("Silver")){
          int monthly1 = Integer.parseInt(JOptionPane.showInputDialog("How many GB of data " +
           "did you use this month?"));

           if(monthly1 > 3){
//Calculates additional cost if the user went over their data usage
               overData = monthly1 - 3;
               monthly1 = (monthly1 - 3) * 5;
               monthlyTotal = monthly1 + silverCost;
               JOptionPane.showMessageDialog(null, String.format("You went over your monthly data" + 
               " allowance by " + overData + " GB.\n" + overData + " GB * $5\n" +
               "Your total for the month is: $%.2f", monthlyTotal));         
           }else{
//Gives the user the monthly cost if they didn't go over the maximum data
               JOptionPane.showMessageDialog(null, String.format("Your total for the month is: $%.2f",
               silverCost));
           }
//If statement if the user doesn't have the silver plan
        }else if(userPlan.equalsIgnoreCase("Gold")){
            int monthly2 = Integer.parseInt(JOptionPane.showInputDialog("How many GB of data " + 
            "did you use this month?"));
//Same function as the silver calculation
            if(monthly2 > 6){
                overData = monthly2 - 6;
                monthly2 = (monthly2 - 6) * 3;
                monthlyTotal = monthly2 + goldCost;
                JOptionPane.showMessageDialog(null, String.format("You went over your monthly data" + 
                " allowance by " + overData + " GB.\n" + overData + " GB * $3.\n" +
                "Your total for the month is: $%.2f", monthlyTotal));
            }else{
//Same as if the user didn't go over in silver plan
                JOptionPane.showMessageDialog(null, String.format("Your total for the month is: $%.2f", 
                goldCost));
            }
//If statement if the user doesn't have silver or gold plans
        }else if(userPlan.equalsIgnoreCase("Platinum")){
            JOptionPane.showMessageDialog(null, String.format("Thank you for enrolling in unlimited data.\n" + 
            "Your total for the month is: $%.2f", platCost));
        }else{
//Exception in case the user doesn't enter the correct plan name
            JOptionPane.showMessageDialog(null, "I'm not sure what you entered.");
        }
    }
}