/*Program to simulate 100 dice rolls at a time and display the values in a text window
Program will continue to run unless the user enters the letter q or Q
*/

//import JOptionPane and Random
import javax.swing.JOptionPane;
import java.util.Random;

public class Assignment05{
    public static void main(String[] args){
        //Create random number generator
        Random gen = new Random();
        //Initialize variables
        int i, r;
        //Array for holding output dialogs
        String[] resultsDialog = {"1s: ", "2s: ", "3s: ", "4s: ", "5s: ", "6s: "};
        String choice;
        //Array for holding generated values
        int[] results = new int[6];
        //String to concantinate output dialogue
        String combineOutput = ("Dice roll results\n" + "=============\n");
        //Boolean to break out of the program when true
        boolean stopPlaying = false;

        //Do/while loop
        do{
        //Dialogue box to request user input
        choice = JOptionPane.showInputDialog("DICE ROLLING SIMULATION\n" + "========================\n" + "s. Roll 100 dice\n" + "h. Display histogram\n" +
        "q. Quit\n" + '\n' + "Enter a choice:");

        //Switch to keep the main dialogue box up until the user quits the program
        switch(choice){
            case "s": case "S":
            //Generate random values 1-6, 100 times and place them into the results array
            for(i = 1; i <= 100; i++){
                results[gen.nextInt(6)]++;
                //Clears any previous results from being displayed after subsequent rolls
                combineOutput = ("Dice roll results\n" + "=============\n");
            //Combine outputs for display
            }for(r = 0; r < results.length; r++){
                combineOutput += (resultsDialog[r] + results[r] + "\n");
            }
            break;
            //End of Roll dice case
            case "h": case "H":
            //Display roll results
            JOptionPane.showMessageDialog(null, combineOutput);
            break;
            //End of Display results case
            case "q": case "Q":
            JOptionPane.showMessageDialog(null, "Thanks for playing!\n" + "Goodbye!");
            //Set boolean to true to quit program
            stopPlaying = true;
            break;
            //End of Quit case
            default:
            //Display if user enters something not in the options
            JOptionPane.showMessageDialog(null, "Invalid input!");
            }
        //Program will continue as long as user does not enter q/Q
        }while(stopPlaying != true);
    }
}