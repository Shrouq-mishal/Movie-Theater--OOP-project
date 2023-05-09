package movietheater;

/**
 *
 * @author Nada Ahmad
 */
public class Seat {

    private int Row;
    private int Column;

    /**
     * this array for seat number
     */
    public String[][] Goldseat = {
        {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10"}, {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"}, {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10"}, {"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10"}, {"E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10"}, {"F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10"}};

    /**
     *this array for seat number
     */
    public String[][] PlatinumSeat = {
        {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10"}, {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"}, {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10"}, {"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10"}, {"E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10"}, {"F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10"}};

    /**
     *this array for seat number
     */
    public String[][] SilverSeat = {
        {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10"}, {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"}, {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10"}, {"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10"}, {"E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10"}, {"F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10"}};

    /**
     *empty constractor
     */
    public Seat() {
    }

    /**
     * constractor
     * @param Row
     * @param Column
     */
    public Seat(int Row, int Column) {

        this.Row = Row;
        this.Column = Column;

    }

    /**
     *
     * @param S
     */
    public boolean CheekedSeat(String S[][],int row, int column) {
        boolean flag = false;
        row = row -1;
        column= column-1;
        if (S[row][column].equalsIgnoreCase("booked")){
            flag= true;
        }
        return flag;
    }

    /**
     * this method for booked a seat
     * @param S
     * @param row
     * @param column
     * @param r
     */
    public void BookedSeat(String S[][], int row, int column, String r) {
        row = row - 1;
        column = column - 1;
        S[row][column] = r;

    }

    /**
     * to string fof print seat information
     * @return
     */
    @Override
    public String toString() {
        return "Seat{" + " Row=" + Row + ", Column=" + Column + "}";
    }

}
