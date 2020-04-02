/*
This program creates an array of 100 random elements and gives various outputs for those elements
*/

import java.util.*;
import java.lang.Math;
import javax.swing.JOptionPane;

public class Assignment08{
    //method to get the lowest number in the array
	public static Double getLowest(ArrayList<Integer> numbers){
		double min = Collections.min(numbers);
		return min;
    }
    //method to get the highest number in the array
	public static Double getHighest(ArrayList<Integer> numbers){
		double max = Collections.max(numbers);
		return max;
    }
    //method to get all total for all the numbers in the array added together
	public static Double getTotal(ArrayList<Integer> numbers){
		double sum = 0.0;
		for(int i = 0; i < 100; i++){
			sum += numbers.get(i);
		}
		return sum;
    }
    //method to get the average of all numbers in the array
	public static Double getAverage(ArrayList<Integer> numbers){
		double sum = getTotal(numbers);
		return sum / numbers.size();
    }
    //method to get the standard deviation of the numbers in the array
	public static Double getStandardDeviation(ArrayList<Integer> numbers){
        double sd = 0.0;
        int length = numbers.size();
        double average = getAverage(numbers);
        for(double i : numbers){
            sd += Math.pow(i - average, 2);
        }
        return Math.sqrt(sd / length);
        }
        
    public static void main(String[] args){
        Random random = new Random();
        //create the array
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++){
            int r = random.nextInt((599 - 501) + 1) + 501;
            numbers.add(r);
        }
        //initialize variables
        double min = getLowest(numbers);
        double max = getHighest(numbers);
        double total = getTotal(numbers);
        double average = getAverage(numbers);
        double sd = getStandardDeviation(numbers);
        String minOut = String.format("Lowest number: %.2f\n", min);
        String maxOut = String.format("Highest number: %.2f\n", max);
        String totalOut = String.format("Numbers total: %.2f\n", total);
        String averageOut = String.format("Numbers average: %.2f\n", average);
        String sdOut = String.format("Standard deviation:  %.2f\n", sd);
        //print results to window
        JOptionPane.showMessageDialog(null, "Statistical analysis of 100 random numbers between 501 and 599\n" + 
        "=====================================================\n" + minOut + maxOut + totalOut + averageOut + sdOut);
	}
}
