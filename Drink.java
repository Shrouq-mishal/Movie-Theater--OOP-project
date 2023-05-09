
package movietheater;

/**
 *
 * @author shrouq
 */
public class Drink {
    private String Drink;
    private String Size;
    private String flavor;
    /**
     * 
     * @param Drink
     * @param Size
     * @param flavor 
     */
    public Drink(String Drink, String Size, String flavor) {
        this.Drink = Drink;
        this.Size = Size;
        this.flavor = flavor;
    }
    /**
     * 
     */
    public Drink() {
    }
    /**
     * 
     * @param Size
     * @param flavor 
     */
    public Drink(String Size, String flavor) {
        this.Size = Size;
        this.flavor = flavor;
    }
    /**
     * 
     * @return Drink
     */
    public String getDrink() {
        return Drink;
    }
    /**
     * 
     * @param Drink 
     */
    public void setDrink(String Drink) {
        this.Drink = Drink;
    }
    /**
     * 
     * @return Size
     */
    public String getSize() {
        return Size;
    }
    /**
     * 
     * @param Size 
     */
    public void setSize(String Size) {
        this.Size = Size;
    }
    /**
     * 
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }
    /**
     * 
     * @param flavor 
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
/**
 * 
 * @param i 
 */
    void setPrice(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
