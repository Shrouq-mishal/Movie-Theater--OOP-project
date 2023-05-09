
package movietheater;


import java.util.*;
/**
 *
 * @author Nada Ahmad
 * @version 8.0.2
 */
public class MovieTheater {

    /**
     *
     * @param args
     */
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        
          Bar b= new Bar();
          Reception R = new Reception();

            System.out.println("~â€¢ WELCOME DEAR COSTUMER â€¢~\n This is a movie theater program ^^\n");
         for (int s = 0 ; s<3;s++){
                 
         System.out.println("To START press آ´one` and to END press آ´two`");
         s = in.nextInt();
        
        if (s==1){
 
       
                System.out.println("Select what you want:(enter the number of Selection)");
                System.out.println("1] Create a Ticket");
                System.out.println("2]Cancel a Ticket");
                System.out.println("3] Bar");
             
         int q = in.nextInt();
        
        switch(q){
           case 1 :
                R.Create();
               break;
           case 2 :
                   
                System.out.println("Enter the Phone Number for Ticket that you want to cancel:");
                 long x1 = in.nextInt();
                 R.Cancel(x1);
              
                  break;
           case 3 :
             Bar []barlist =new Bar[100];
             b.addSnack_Drink();
                  break;
            default :
                System.out.println("wrong enter");
            
        }
        }else {
            break;
        }}
        R.finalTicket();
     
    }
    
}

