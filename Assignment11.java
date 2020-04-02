//Program reads file and formats output to a .txt file

import java.io.*;
import java.util.*;

public class Assignment11{
    public static void main(String[] args){
        Scanner in = null;
        ArrayList<Employee> employees = new ArrayList<>();
        PrintWriter out = null;
        
        try{
            //scanner for reading .csv file
            in = new Scanner(new File("employee.csv"));
            String line = in.nextLine();

            //while loop for adding .csv info to the arraylist
            while(in.hasNextLine()){
                line = in.nextLine();
                String[] info = line.split(",");
                int id = Integer.parseInt(info[0]);
                String name = info[1];
                int age = Integer.parseInt(info[2]);
                String hiredAt = info[3];
                boolean exempt = Boolean.parseBoolean(info[4]);
                String jobTitle = info[5];
                employees.add(new Employee(id, name, age, hiredAt, exempt, jobTitle));
            }in.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                //print output to .txt file
                out = new PrintWriter("employee.txt");
                for(Employee employee: employees){
                    out.println(employee.toString());
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        out.close();
    }
}

