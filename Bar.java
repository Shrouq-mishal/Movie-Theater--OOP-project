
package movietheater;
import java.util.Scanner;
/**
 *
 * @author shrouq 
 */
public class Bar {
    //inctance
    private String Snack;
    private String Size;
    private String flavor;
    private String Drink;
    String[]SnackMenu={"1-PopCorn","2-Nachos","3-Pizza","4-Hotdog","5-Dessert"};
    String [] DrinkMenu={"6-Cold Drink","7-Hot Drink"};
    private int Price;
    private double Total ;

    //object
Snack s=new Snack();
Drink d= new Drink();


 //getter and setter
/**
 * 
 * @return price
 */
    public int getPrice() {
        return Price;
    }

    /**
     * 
     * @param Price 
     */
    public void setPrice(int Price) {
        this.Price = Price;
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
    
    //consturctors
    /**
     * 
     */
    public Bar() {
    }
    /**
     * 
     * @param s
     * @param d 
     */
    public Bar(Snack s,Drink d){
     this.s=s;
     this.d=d;
            }
    /**
     * 
     * @param Snack
     * @param Drink 
     */
    public Bar(String Snack, String Drink) {
        this.Snack = Snack;
        this.Drink = Drink;
    }
  /**
   * Ask the user which option they would like to choose
   * return Total,Snack and Drink
   */
    public void addSnack_Drink(){
    
     Scanner input =new Scanner(System.in);
        int choice = 0;
        int Size;
        int Snack;
        int flavor;
        int Drink;
        int Type;
       try{
   System.out.println("Welcome \n what do you choose to Eat oR Drink :");
        System.out.println("1- SNACKS\n2- DRINKS");
        int Fristchoice =input.nextInt();
        if(Fristchoice==1){
        for (int i = 0; i < SnackMenu.length; i++) 
           
            System.out.println(SnackMenu[i]);
           System.out.println("Welcome \n what do you choose to eat :");
         choice= input.nextInt();
        }//end if
    
      
        
         else if (Fristchoice==2){
         for (int i = 0; i < DrinkMenu.length; i++) {
            System.out.println(DrinkMenu[i]);
        }   System.out.println("Welcome \n what do you choose to Drink:");
            choice= input.nextInt();
         }
       }
   catch(Exception or){
                System.out.println("Enter Number Only, Please");
                }
       
   switch(choice){
       case 1 :
         try{
           System.out.println("\t\tPOPCORN\t\t");
           System.out.println("1-Small\t\t\t\t 23SR\n2-Regular\t\t\t 25SR\n3-Large\t\t\t\t 26SR");
           Size = input.nextInt();
           System.out.println("What flavor do you Choose :");
           System.out.println("\t 1-SALT || 2-CHEESE ||3-CARAMEL");
           flavor= input.nextInt();
           s.setSnack("POPCORN");
           if(Size==1){
              s.setSize("Samll");
              Price=23;
           } 
             else if (Size==2){
              s.setSize("Regular");
              Price=25;}
             else{
               s.setSize("Large");
              Price =26;}
              if (flavor==1)
                s.setFlavor("Salt");
              else if (flavor==2)
                 s.setFlavor("CHEESE");
              else 
                 s.setFlavor("CARAMEL");
               Quantity();
              System.out.println("You've ordered "+s.getSize()+" "+s.getSnack()+" "+s.getFlavor()+" and it's "+Total+"SR");
              System.out.println("Enjoy your meal");
         }
           catch(Exception or){
                System.out.println("Enter Number Only, Please");
                }
       
           break;
       case 2:
           try{
           System.out.println("\t\t NACHOS\t\t");
           System.out.println("1-Superme Nachost\t\t\t 40SR\n2-Deluxe Nachos\t\t\t \t 50SR");
           Snack = input.nextInt();
            if(Snack==1){
              s.setSnack("Superme Nachost");
              Price=40;}
              else {
              s.setSnack("Deluxe Nachos");
              Price=50;}
             Quantity();
            System.out.println(" You've ordered "+s.getSnack()+" and it's "+Total+"SR");
            System.out.println("Enjoy your meal");
           }
             catch(Exception or){
                System.out.println("Enter Number Only, Please");
                }
       
            
            
            break;
       case 3:
           try{
           
           System.out.println("\t\t PIZZA\t\t");
           System.out.println("1-Cheese Pizza\t\t\t\t 34SR\n2-vegetable Pizza\t\t\t 36SR");
           Snack = input.nextInt();
            if(Snack==1){
              s.setSnack("Cheese Pizza");
              Price=34;}
           else {
              s.setSnack("vegetable Pizza");
              Price=36;}
             Quantity();
            System.out.println(" your choice  is "+s.getSnack()+" and it's "+Total+"SR");
            System.out.println("Enjoy your meal");
           }
             catch(Exception or){
                System.out.println("Enter Number Only, Please");
                }
       
            
           break;
       case 4:
         try{
           System.out.println("\t\tHOTDOG\t\t");
           System.out.println("1-Chicken Hotdog\t\t\t 31SR\n2-Beef Hotdog\t\t\t\t 31SR");
           Snack = input.nextInt();
           if(Snack==1){
              s.setSnack("Chicken Hotdog");
              Price=31;}
           else {
              s.setSnack("Beef Hotdog");
              Price=34;}
            Quantity();
           System.out.println("You've ordered a "+s.getSnack()+" and it's "+Total+"SR");
           System.out.println("Enjoy your meal");
         }
           catch(Exception or){
                System.out.println("Enter Number Only, Please");
                }
       
           
           break;
          
       case 5:
           try{
           System.out.println("\t\tDESSERT\t\t");
           System.out.println("1-Ice cream Cup\t\t\t18SR\n2-Milkshake\t\t\t36SR");
            Size = input.nextInt();
           if(Size==1){
              s.setSize("Cup");
              Price=18;}
           else{System.out.println(" Choose a Size :\n1-Small\t\t\t\t 33SR\n2-Regular\t\t\t 35SR\n3-Large\t\t\t\t 36SR\n");
             Size = input.nextInt();
              if(Size==1){
              s.setSize("Samll");
              Price=33;}
           else if (Size==2){
              s.setSize("Regular");
              Price=35;}
           else{
               s.setSize("Large");
               Price=36;}
           
           }
            System.out.println("What flavor do you Choose :");
           System.out.println("\t 1-Vanilla || 2-Chocolate ||3-Strawberry");
           flavor= input.nextInt();
             if (flavor==1)
                s.setFlavor("Vanilla ");
              else if (flavor==2)
                 s.setFlavor("Chocolate");
              else 
                 s.setFlavor("Strawberry");
              Quantity();
             System.out.println(" You've ordered  "+s.getSize()+" "+s.getFlavor()+" Milkshake"+" and it's "+Total+"SR");
             System.out.println("Enjoy your meal");
           }
             catch(Exception or){
                System.out.println("Enter Number Only, Please");
                }
       
             
             break; 
   
     case 6:
         try{
         System.out.println("1-SOFT DRINK\n2-FRESH JUICES\n3-SMOOTHIES");
             Type =input.nextInt();
             if(Type==1){
                 System.out.println("1-Red Bull\n2-Sulsh Bull\n");
                 flavor =input.nextInt();
                   if(flavor==1){
                     d.setFlavor("Red Bull");
                      System.out.println(" what the size you wanna drink \n1-Small\t\t\t\t 23SR\n2-Regular\t\t\t 25SR\n3-Large\t\t\t\t 26SR");
                       Size = input.nextInt();
                    if(Size==1){
                     d.setSize("Samll");
                     Price=23;}
                     else if (Size==2){
                     d.setSize("Regular");
                     Price=25;}
                     else{
                     d.setSize("Large");
                     Price=26;}
                     }//end if falvor1
                   else {
                       d.setFlavor("Sulsh Bull");
                       System.out.println(" what the size you wanna drink \n1-Small\t\t\t\t 23SR\n2-Regular\t\t\t 25SR\n3-Large\t\t\t\t 26SR");
                       Size = input.nextInt();
                    if(Size==1){
                     d.setSize("Samll");
                     Price=23;
                    }
                     else if (Size==2){
                     d.setSize("Regular");
                    Price=25;}
                     else{
                     d.setSize("Large");
                    Price=26;}
                   }//end else flavor2
                    Quantity();
                    System.out.println("  You've ordered  "+d.getSize()+" "+d.getFlavor()+" and it's "+Total+"SR" );
                    System.out.println("Enjoy your meal");
                     } //end if Type
             
            else if (Type ==2){
                 System.out.println("1-Orange\n2-Lemonade\n3-Watermelon");
                  flavor =input.nextInt();
                   if(flavor==1)
                       d.setFlavor("Orange");
                    else if(flavor==2)
                       d.setFlavor("Lemonade");
                    else
                       d.setFlavor("Watermelon");
                    System.out.println(" what the size you wanna drink \n1-Small\t\t\t\t 23SR\n2-Regular\t\t\t 25SR\n3-Large\t\t\t\t 26SR");
                       Size = input.nextInt();
                    if(Size==1){
                       d.setSize("Samll");
                      Price=23;}
                     else if (Size==2){
                       d.setSize("Regular");
                      Price=25;}
                     else{
                       d.setSize("Large");
                       Price=26;}
                     Quantity();
                     System.out.println("  You've ordered  "+d.getSize()+" "+d.getFlavor() +" JUICE"+" and it's "+Total+"SR");
                     System.out.println("Enjoy your meal");
            }//end else if type 2
            
            
            else{
            System.out.println("1-Banana\n2-Strawberry\n3-Banana&Strawberry");
                  flavor =input.nextInt();
                   if(flavor==1)
                       d.setFlavor("Banana");
                    else if(flavor==2)
                       d.setFlavor("Strawberry");
                    else
                       d.setFlavor("Banana&Strawberry");
                   System.out.println(" what the size you wanna drink \n1-Small\t\t\t\t 23SR\n2-Regular\t\t\t 25SR\n3-Large\t\t\t\t 26SR");
                       Size = input.nextInt();
                    if(Size==1){
                       d.setSize("Samll");
                       Price=23;}
                     else if (Size==2){
                       d.setSize("Regular");
                       Price=25;}
                     else{
                      d.setSize("Large");
                      Price=26;}
                     Quantity();
                    System.out.println("  You've ordered  "+d.getSize()+ " "+d.getFlavor()+" SOOMTHIE"+" and it's "+Total+"SR");
                        System.out.println("Enjoy your meal");
                     }//end else type 3 
         }
           catch(Exception or){
                System.out.println("Enter Number Only, Please");
                }
       
                     break;
         case 7:
             try{
             System.out.println("1- English Breakfast\t\t\t 13SR \n2- Earl Grey\t\t\t\t 13SR \n3- Green Tea\t\t\t\t 13SR \n4- Karak Tea\t\t\t\t 10SR");
                  Drink =input.nextInt();
                  if(Drink==1){
                     d.setDrink("English Breakfast");
                    Price=13;}
                    else if(Drink==2){
                       d.setDrink("Earl Grey");
                       Price=13;}
                    else if(Drink==3){
                       d.setDrink(" Green Tea");
                       Price=13;}
                    else{
                        d.setDrink("Karak Tea");
                        Price=10;}
                   Quantity();
                     System.out.println("  You've ordered  "+d.getDrink()+" and it's "+Total+"SR");
                     System.out.println("Enjoy your meal");
             }
               catch(Exception or){
                System.out.println("Enter Number Only, Please");
                }
       
                     break;
                     
                     }//end Switch
    
    }
    
    
    public void Quantity(){
        try{
        Scanner input= new Scanner (System.in);
        int Quantity;
        System.out.println("Enter Quantity : ");
        Quantity= input.nextInt();
        Total(Quantity,Price);
         //   System.out.print(Quantity);
        }
          catch(Exception or){
                System.out.println("Enter Number Only, Please");
                }
        
    }
    
    
    /**
     * 
     * @param Q
     * @param p
     * @return Total
     */
    public double Total(double Q , int p){
        
        double total;
        Total=Q*p;
        System.out.println(" Total : "+Total +"SR");
        return Total;
    }
    
    /**
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "Bar{" + "Snack=" + Snack + ", Drink=" + Drink + ", Snack Menu : \n" + SnackMenu + ", DrinkMenu=" + DrinkMenu + '}';
    }
    
}
