package movietheater;

/**
 *
 * @author Nada Ahmad
 */
public class Theater {

    private String TheaterName;

    String[] TheaterList = {"Rgular Cinema", "3D Cinema", "Car Cinema"};

    private int TheaterNumber = 0;

    /**
     *empty constactor
     */
    public Theater() {
    }

    /**
     *constractor
     * @param TheaterName
     */
    public Theater(String TheaterName) {
        this.TheaterName = TheaterName;

    }


    /**
     *getter for TheaterName
     * @return
     */
    public String getTheaterName() {
        return TheaterName;
    }

    /**
     * setter for TheaterName
     * @param TheaterName
     */
    public void setTheaterName(String TheaterName) {
        this.TheaterName = TheaterName;
    }

    /**
     * getter for TheaterNumber
     * @return
     */
    public int getTheaterNumber() {
        return TheaterNumber;
    }

    /**
     * setter for TheaterNumber
     * @param TheaterNumber
     */
    public void setTheaterNumber(int TheaterNumber) {
        this.TheaterNumber = TheaterNumber;
    }

    /**
     * to string method for print Theater information
     * @return
     */
    @Override
    public String toString() {
        return "Theater{" + "TheaterName=" + TheaterName + "}";
    }

}
