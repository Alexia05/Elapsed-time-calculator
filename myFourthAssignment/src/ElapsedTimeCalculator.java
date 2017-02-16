
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
    private int startTimeInMinutes;
    private int endTimeInMinutes;

    //constructor 
    public ElapsedTimeCalculator(int startTimeM, int endTimeM) {
        startTime = startTimeM;
        endTime = endTimeM;
    }

    //getting the start and end times 
    public int getstartTime() {
        return startTime;
    }

    public int getendTime() {
        return endTime;
    }

    //converting the start and end time in minutes
    public void convertToMinutes() {
        this.startTimeInMinutes = (startTime / 100) * 60 + (startTime % 100);
        this.endTimeInMinutes = (endTime / 100) * 60 + (endTime % 100);
    }

    // getting the hours portion of the elapsed time 
    public int getelapsedTimeHour() {
        int elapsedTime = endTimeInMinutes - startTimeInMinutes;
        return elapsedTime / 60;
    }

    //getting the minutes portion of the elapsed time 
    public int getelapsedTimeMin() {
        int elapsedTime = endTimeInMinutes - startTimeInMinutes;
        return elapsedTime % 60;
    }

    //getting the total elapsed time in minutes
    public int getelapsedTimeMinT() {
        int elapsedTime = endTimeInMinutes - startTimeInMinutes;
        return elapsedTime;
    }
    
    //getting the total elapsed time in hours 
    public double getelapsedTimeHourT() {
        double elapsedTime = endTimeInMinutes - startTimeInMinutes;
        return  elapsedTime/60;
    }
    
    
    //reseting the start and end times
    public void anotherTime(int startTimeM, int endTimeM) {
        startTimeInMinutes = startTimeM;
        endTimeInMinutes = endTimeM;
    }

    
}
