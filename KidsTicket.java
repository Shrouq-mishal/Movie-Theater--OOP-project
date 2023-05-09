
package movietheater;
/**
 *
 * @author Rofaa
 */

public class KidsTicket extends Ticket {
    
    KidsTicket(){
        
    }
/*
*This constructor calls the superconstructor and creates initial values for a class KidsTicket
*/
    KidsTicket( Seat Seatinfo, Date date, Person person, Movies Movie, Theater Theaterinfo,Payment pay){
        super ( Seatinfo, date,  person,  Movie, Theaterinfo,pay);
    }
/*
*This constructor calls the superconstructor and creates initial values for a class KidsTicket
*/

    public KidsTicket(Date date, Person person, Movies Movie, Theater Theaterinfo,Payment pay) {
        super(date, person, Movie, Theaterinfo,pay);
    }
    
    
}

