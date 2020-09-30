public class ZooClock {
    public int CurrTime;
    protected int hour;
    public String meridiem;
    ZooClock(){
        CurrTime = 12;
        hour = 0;
        meridiem = "am";
        System.out.println("The time is "+ CurrTime + " " + meridiem);

    }
    public void Time(){
        if(hour < 11){
            meridiem = "am";
        }
        else{
            meridiem = "pm";
        }
        hour += 1;
        if (CurrTime == 12){
            CurrTime = 1;
        }
        else if (CurrTime != 12){
            CurrTime += 1;
        }
        System.out.println("The time is "+ CurrTime + " " + meridiem);
    }
    public void newDay(){
        hour = 0;
        CurrTime = 12;
        meridiem = "am";
        System.out.println("The time is "+ CurrTime + " " + meridiem);
    }
}
