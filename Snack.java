
package movietheater;

/**
 *
 * @author shrouq
 */
public class Snack {
    private String Snack;
    private String Size;
    private String flavor;
    private int price;
    
    /**
     *
     */
    public Snack() {
    }
    /**
     * 
     * @param Snack
     * @param Size
     * @param flavor
     * @param price 
     */
    public Snack(String Snack, String Size, String flavor,int price) {
        this.Snack = Snack;
        this.Size = Size;
        this.flavor = flavor;
    }
       /**
        * 
        * @param Size
        * @param flavor 
        */
    public Snack(String Size, String flavor) {
        this.Size = Size;
        this.flavor = flavor;
    }
    /**
     * 
     * @param Snack 
     */
    public Snack(String Snack) {
        this.Snack = Snack;
    }
    /**
     * 
     * @return Snack
     */
    public String getSnack() {
        return Snack;
    }
    /**
     * 
     * @param Snack 
     */
    public void setSnack(String Snack) {
        this.Snack = Snack;
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

   
  
    
    
}
