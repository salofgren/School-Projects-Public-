//Program to calculate bank account balance with monthly interest and deposits/withdrawals

//import JOptionPane and other javax
import javax.swing.*;
public class Assignment10{
    public static void main(String[] args){
        //initialize variables
        double balance = 0.0;
        double annualInterestRate = 0.0;
        double depositAmount; 
        double withdrawAmount;
        String choice;
        boolean endProgram = false;
        BankAccount ba = new BankAccount(balance, annualInterestRate);

        //Switch statement for entering options
        do{
            choice = JOptionPane.showInputDialog("Welcome to your Bank Account!\n" +
            "1. Enter balance\n" +
            "2. Set interest rate\n" +
            "3. Make a deposit\n" +
            "4. Make a withdrawal\n" +
            "5. Pay interest\n" +
            "6. Display information\n" +
            "7. Quit");
            
        switch(choice){
            case "1":
            balance = Double.parseDouble(JOptionPane.showInputDialog("Enter starting balance: "));
            ba.getBalance();
            break;
            case "2":
            annualInterestRate = Double.parseDouble(JOptionPane.showInputDialog("Enter annual interest rate: "));
            ba.setAnnualInterestRate(annualInterestRate);
            break;
            case "3":
            depositAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to deposit: "));
            ba.deposit(depositAmount);
            break;
            case "4":
            withdrawAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to withdraw: "));
            ba.withdraw(withdrawAmount);
            break;
            case "5":
            ba.payMonthlyInterest();
            break;
            case "6":
            JOptionPane.showMessageDialog(null, String.format("Total deposits: %d\n Total withdrawals: %d\n Balance: $%.2f", ba.getTotalDeposits(), ba.getTotalWithdraws(), ba.getBalance()));
            break;
            case "7":
            JOptionPane.showMessageDialog(null, "Thanks for using the program.");
            endProgram = true;
            break;
            default:
            JOptionPane.showMessageDialog(null, "Enter an option from the menu.");
        }
        }while(endProgram != true);

    }
}