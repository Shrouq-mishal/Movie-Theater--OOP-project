
package movietheater;


/**
 * @author Walaa Alzahrani
 * Payment.java is a concrete class that contains payments methods 
 */
public class Payment {

      int t;

    public Payment(int t) {
        this.t=t;
    }



    /**
     * Creating 3 object of class using the new keyword
     */
    AdultTicket s = new AdultTicket();
    FamilyTicket f = new FamilyTicket();
    KidsTicket k = new KidsTicket();

    /**
     * instance variables of int type price and finalPrice 
     * both with an initial value 0
     */
    int price = 0;
    int finalPrice = 0;
    
    /**
     * Three instance variables Gold of type int , Platinum of type int
     * , Silver of type int
     */
    int Gold;
    int Platinum;
    int Silver;

    /**
     * Three instance variables Regular of type integer , ThreeD of type integer
     * , Car of type integer
     */
    Integer Regular;
    Integer ThreeD;
    Integer Car;

    /**
     * Empty constructor
     */
    public Payment() {

    }

    /**
     * Class constructor
     * @param Gold
     * @param Platinum
     * @param Silver
     */
    public Payment(int Gold, int Platinum, int Silver) {
        this.Gold = Gold;
        this.Platinum = Platinum;
        this.Silver = Silver;
    }

    /**
     * Class constructor 
     * @param Regular
     * @param ThreeD
     * @param Car
     */
    public Payment(Integer Regular, Integer ThreeD, Integer Car) {
        this.Regular = Regular;
        this.ThreeD = ThreeD;
        this.Car = Car;
    }

    /**
     * Getter
     * @return int value
     */
    public int getPrice() {
        return price;
    }

    /**
     * Setter 
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Setter
     * @return int value
     */
    public int getFinalPrice() {
        return finalPrice;
    }

    /**
     * Setter
     * @param finalPrice
     */
    public void setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
    }

    /**
     * Getter
     * @return integer value
     */
    public Integer getRegular() {
        return Regular;
    }

    /**
     * Getter
     * @return integer value
     */
    public Integer getThreeD() {
        return ThreeD;
    }

    /**
     * Getter
     * @return integer value
     */
    public Integer getCar() {
        return Car;
    }

    /**
     * Getter
     * @return int value
     */
    public int getGold() {
        return Gold;
    }

    /**
     * Setter
     * @param Gold
     */
    public void setGold(int Gold) {
        this.Gold = Gold;
    }

    /**
     * Getter
     * @return int value
     */
    public int getPlatinum() {
        return Platinum;
    }

    /**
     * Setter
     * @param Platinum
     */
    public void setPlatinum(int Platinum) {
        this.Platinum = Platinum;
    }

    /**
     * Getter
     * @return int
     */
    public int getSilver() {
        return Silver;
    }

    /**
     * Setter
     * @param Silver
     */
    public void setSilver(int Silver) {
        this.Silver = Silver;
    }

    /**
     * This methods is specified for the tickets of singles costumers
     * @param type refers to cinema types  
     * @param cinema refers to cinema's ticket types
     * @return int returns the total price of the ticket
     */
    public int SingleTickets( int type, int cinema) {

        int total = 0;
        int p = 0;
        
        setGold(60);
        setPlatinum(50);
        setSilver(40);

            switch (type) {
                case 1:
                    switch (cinema) {
                        case 1:
                            setPrice(Gold);
                            total += getPrice();
                            break;
                        case 2:
                            setPrice(Gold + 40);
                            total += getPrice();
                            break;
                        case 3:
                            setPrice(Gold + 20);
                            total += getPrice();
                            break;
                    }
                    break;

                case 2:
                    switch (cinema) {
                        case 1:
                            setPrice(Platinum);
                            total += getPrice();
                            break;
                        case 2:
                            setPrice(Platinum + 40);
                            total += getPrice();
                            break;
                        case 3:
                            setPrice(Platinum + 20);
                            total += getPrice();
                            break;
                    }
                    break;
                case 3:
                    switch (cinema) {
                        case 1:
                            setPrice(Silver);
                            total += getPrice();
                            break;
                        case 2:
                            setPrice(Silver + 40);
                            total += getPrice();
                            break;
                        case 3:
                            setPrice(Silver + 20);
                            total += getPrice();
                            break;
                    }
                    break;
            }
        

        p += total;
        setFinalPrice(p);
        return p;
    }

    /**
     * This methods is specified for the tickets of family costumers
     * @param type refers to cinema types  
     * @param cinema refers to cinema's ticket types
     * @return int returns the total price of the ticket
     */
    public int FamilyTickets(int type, int cinema) {

        int total = 0;
        int p = 0; 
        
        setGold(70);
        setPlatinum(60);
        setSilver(50);


            switch (type) {
                case 1:
                    switch (cinema) {
                        case 1:
                            setPrice(Gold);
                            total += getPrice();
                            break;
                        case 2:
                            setPrice(Gold + 30);
                            total += getPrice();
                            break;
                        case 3:
                            setPrice(Gold + 20);
                            total += getPrice();
                            break;
                    }
                    break;

                case 2:
                    switch (cinema) {
                        case 1:
                            setPrice(Platinum);
                            total += getPrice();
                            break;
                        case 2:
                            setPrice(Platinum + 30);
                            total += getPrice();
                            break;
                        case 3:
                            setPrice(Platinum + 20);
                            total += getPrice();
                            break;
                    }
                    break;
                case 3:
                    switch (cinema) {
                        case 1:
                            setPrice(Silver);
                            total += getPrice();
                            break;
                        case 2:
                            setPrice(Silver + 30);
                            total += getPrice();
                            break;
                        case 3:
                            setPrice(Silver + 20);
                            total += getPrice();
                            break;
                    }
                    break;
            }
        
        p += total;
        setFinalPrice(p);
        return p;
    }

    /**
     * This methods is specified for the tickets of Kids costumers
     * @param type refers to cinema types  
     * @param cinema refers to cinema's ticket types
     * @return int returns the total price of the ticket
     */
    public int KidsTickets(int type, int cinema) {

        int total = 0;
        int p = 0;
        
        setGold(30);
        setPlatinum(20);
        setSilver(15);

            switch (type) {
                case 1:
                    switch (cinema) {
                        case 1:
                            setPrice(Gold);
                            total += getPrice();
                            break;
                        case 2:
                            setPrice(Gold + 15);
                            total += getPrice();
                            break;
                        case 3:
                            setPrice(Gold + 10);
                            total += getPrice();
                            break;
                    }
                    break;

                case 2:
                    switch (cinema) {
                        case 1:
                            setPrice(Platinum);
                            total += getPrice();
                            break;
                        case 2:
                            setPrice(Platinum + 15);
                            total += getPrice();
                            break;
                        case 3:
                            setPrice(Platinum + 10);
                            total += getPrice();
                            break;
                    }
                    break;
                case 3:
                    switch (cinema) {
                        case 1:
                            setPrice(Silver);
                            total += getPrice();
                            break;
                        case 2:
                            setPrice(Silver + 15);
                            total += getPrice();
                            break;
                        case 3:
                            setPrice(Silver + 10);
                            total += getPrice();
                            break;
                    }
                    break;}

        p += total;
        setFinalPrice(p);
        return p;
    }

}