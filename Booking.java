
package movietheater;

/**
 *
 * @author Nada Ahmad
 */
public interface Booking {

    /**
     *
     * @param Id
     * @return
     */
    public  int TicketSearch(long Id);

    /**
     * 
     * @param Id
     */
    public void Cancel(long Id);

    /**
     *
     * @return 
     */
    public void Create();
   
}
