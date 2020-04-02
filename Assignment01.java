import java.util.Scanner;

public class Assignment01{
    public static void main(String[] args){
        Scanner number1 = new Scanner(System.in);
        int x;
        System.out.println("Enter first number: ");//Prompts user for a number
        //Checks if the user inputs a non-integer value
        while(!number1.hasNextInt()){
            System.out.println("That is not a number! Enter a valid number: ");
            number1.next();//Forces user to input values until they enter a valid integer
        }x = number1.nextInt();
        Scanner number2 = new Scanner(System.in);
        int y;
        System.out.println("Enter second number: ");
        while(!number2.hasNextInt()){
            System.out.println("That is not a number! Enter a valid number: ");
            number2.next();
        }y = number2.nextInt();
        Scanner number3 = new Scanner(System.in);
        int z;
        System.out.println("Enter third number: ");
        while(!number3.hasNextInt()){
            System.out.println("That is not a number! Enter a valid number: ");
            number3.next();
        }z = number3.nextInt();
// Close Scanners
        number1.close();
        number2.close();
        number3.close();
      
int sumXYZ = x + y + z;
double averageXYZ = (x + y + z) / 3.0;//Changed 3=>3.0 to get double value
System.out.println("Sum = " + sumXYZ + '\n' + "Average = " + averageXYZ);
//Displays the Sum and Average of the users input
    }
}