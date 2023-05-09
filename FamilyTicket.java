
package movietheater;

/**
 *
 * @author Rofaa
 */

public class FamilyTicket extends Ticket {

   FamilyTicket(){
       
   }
     
/*
*This constructor calls the superconstructor and creates initial values for a class AdultTicket
*/
   FamilyTicket( Seat Seatinfo, Date date, Person person, Movies Movie, Theater Theaterinfo,Payment pay){
        super ( Seatinfo, date,  person,  Movie, Theaterinfo,pay);
    } 
     
/*
*This constructor calls the superconstructor and creates initial values for a class AdultTicket
*/
    
FamilyTicket( Date date, Person person, Movies Movie, Theater Theaterinfo,Payment pay){
    super ( date,  person,  Movie, Theaterinfo,pay);
}
    
    
}
