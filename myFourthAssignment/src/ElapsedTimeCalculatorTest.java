
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arelysalvarezpadilla
 */
public class ElapsedTimeCalculatorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //datas
        int startTime;
        int endTime;
        String input;

        //gettin the times from the user
        input = JOptionPane.showInputDialog("Enter the starting time");

        startTime = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the ending time");

        endTime = Integer.parseInt(input);

        
        //creating the elapsed time calculator     
        ElapsedTimeCalculator myCalculator = new ElapsedTimeCalculator(startTime, endTime);
        
        
        //converting the times to minutes
        myCalculator.convertToMinutes();
        
        
        //printin the times
        System.out.println("The start time is " + startTime);

        System.out.println("\nThe end time is " + endTime);

        
        //printing the calculated elapsed time 
        System.out.println("\nExactly " + myCalculator.getelapsedTimeHour() + " hour(s) and "
                + myCalculator.getelapsedTimeMin() + " minute(s) have passed");

        System.out.println("\nThe total elapsed time in minutes is " + myCalculator.getelapsedTimeMinT());

        System.out.println("\nThe total elapsed time in hours is " + myCalculator.getelapsedTimeHourT());
        

        //resetting the start and end time
        input = JOptionPane.showInputDialog("Enter the new starting time");

        startTime = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the new ending time");

        endTime = Integer.parseInt(input);
        

        //changing the start and end time 
        myCalculator.anotherTime(startTime, endTime);
        
        
        //converting the times to minutes
        myCalculator.convertToMinutes();


        //printin the new times
        System.out.println("\n-----------------------------------------------------");

        System.out.println("\nThe new start time is " + startTime);

        System.out.println("\nThe new end time is " + endTime);

        //printing the calculated elapsed time for the new time
        System.out.println("\nExactly " + myCalculator.getelapsedTimeHour() + " hour(s) and "
                + myCalculator.getelapsedTimeMin() + " minute(s) have passed");

        System.out.println("\nThe total elapsed time in minutes is " + myCalculator.getelapsedTimeMinT());

        System.out.println("\nThe total elapsed time in hours is " + myCalculator.getelapsedTimeHourT());

        System.exit(0);
    }

}
