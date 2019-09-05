/*Calculates circle stuff
Area = Pi * r^2
Circumfrence = 2 * Pi * r
*/

import java.util.Scanner;

public class Circles{
    public static void main(String[] args){

System.out.println("This program calculates the Area and Circumference of a"
+ " circle with your desired radius!");
System.out.println("Enter the radius: ");
Scanner userInput = new Scanner(System.in);
double r = userInput.nextDouble();
System.out.println("The Area of the circle is: " + (3.14 * r * r));
System.out.println("The Circumference of the circle is: " + (2 * 3.14 * r));
    }    
}
