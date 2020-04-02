import javax.swing.JOptionPane;//get the JOptionPane for use

public class Assignment02{
    public static void main(String[] args){
//Ask users for input in a window
        String userName = JOptionPane.showInputDialog("Enter your name:");
        String userEmail = JOptionPane.showInputDialog("Enter your email address:");
        String zipCode = JOptionPane.showInputDialog("Enter your Zip Code:");
        String phoneNumber = JOptionPane.showInputDialog("Enter your phone number:");
//print the user's inputs to the console
        System.out.println(
        "        Name: " + userName + "\n" +
        "       Email: " + userEmail + "\n" +
        "    Zip Code: " + zipCode + "\n" +
        "Phone Number: " + phoneNumber);
    }
}