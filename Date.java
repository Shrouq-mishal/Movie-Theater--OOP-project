
package movietheater;

/**
 *
 * @author shrouq
 */
public class Date {
    private int Day;
    private int Month;
    private int Year;
    /**
     * 
     */
    public Date() {
    }
    /**
     * 
     * @param Day
     * @param Month
     * @param Year 
     */
    public Date(int Day, int Month, int Year) {
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }
    /**
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "Date : " + Day + "\\" + Month + "\\" + Year ;
    }
    
}
