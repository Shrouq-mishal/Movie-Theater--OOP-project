package movietheater;
/**
 *
 * @author shrouq
 */
public class Time {
   private int hour ;
   private int minute ;
   private int second;

    /**
     *
     */
    public Time() {
    }

    /**
     *
     * @param h
     * @param m
     * @param s
     */
    public Time(int h, int m, int s) {
       hour = (h>=0 && h<24? h:0);
        minute =  (m>=0 && m<60? m:0);
        second =  (s>=0 && s<60? s:0);
    }
 
    /**
     *
     * @param h
     * @param m
     */
    public Time(int h, int m) {
       hour = (h>=0 && h<24? h:0);
        minute =  (m>=0 && m<60? m:0);
    }

    /**
     *
     * @return string
     */
    @Override
    public String toString(){
        return "The Showtime: "+hour+":"+minute;
    }
    
    /**
     *
     * @return String
     */
    public String toTime(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
    }