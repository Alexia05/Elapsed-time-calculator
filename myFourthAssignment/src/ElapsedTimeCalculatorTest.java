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

        //creating The Eapsed time calculator     
        ElapsedTimeCalculator myCalculator = new ElapsedTimeCalculator(1445, 1730);

        //gettin the times
        int startTime = myCalculator.getstartTime();
        int endTime = myCalculator.getendTime();
        
        System.out.println("The start time is " + startTime);
        System.out.println("\nThe end time is " + endTime);
       
        //calculatin the elapsed time 
        int elapsedTime = myCalculator.getelapsedTime();
        
        System.out.println("\nThe elpased time in hours is " + elapsedTime);
    }

}
