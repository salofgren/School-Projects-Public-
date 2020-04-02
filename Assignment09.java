//Program uses the Employee class to set data and print formatted text to the console

public class Assignment09{
    public static void main(String[] args){

        //Empty constructor for john and needs all set methods to complete
        Employee john = new Employee();
        john.setId(891252);
        john.setName("Johnathon Rogers");
        john.setDepartment("Customer Service");
        john.setPosition("System Analyst");

        //Mark takes two arguments and needs set methods to complete
        Employee mark = new Employee(850656, "Mark Adams");
        mark.setDepartment("Human Resources");
        mark.setPosition("Benefits Manager");

        //Susan accepts all arguments and needs no set methods
        Employee susan = new Employee(864358, "Susan Jones", "Admission Office", "Record Clerk");

        //Print results to the console
        System.out.printf("%s %30s %30s %30s\n\n", "ID", "Name", "Department", "Position");
        System.out.println(john.toString() + mark.toString() + susan.toString());
    }
}