/**
 * Class that computes the amount of time that passes between 
 * a starting time and an ending time, in military format.
 */

/**
 *
 * @author arelysalvarezpadilla
 */
public class ElapsedTimeCalculator {

    //instance variables 
    private int startTime;
    private int endTime;
    
    //constructor 
    public ElapsedTimeCalculator(int startTimeM, int endTimeM)
    {
        startTime = startTimeM;
        endTime = endTimeM;
    }
    
    //getting the starting and endind times
    public int getstartTime()
    {
        return startTime;
    }
    
    public int getendTime()
    {
        return endTime;
    }
    
    
    //reseting the starting and ending times
    public void reset(int startTimeM1, int endTimeM1)
    {
        startTime = startTimeM1;
        endTime = endTimeM1;
    }
    
    
    // getting the elapsed time in hours (fix this part to get only the hours, convert both times to minutes)
    public int getelapsedTime()
    {
        int elapsedTime = (endTime*60) - (startTime*60); 
        int elapsedTimeHours = elapsedTime/60;
        return elapsedTimeHours;
    }

}

