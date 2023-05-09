package movietheater;


/**
 *
 * @author Rofaa
 */
public class AdultTicket extends Ticket {

    AdultTicket() {

    }
  
/*
*This constructor calls the superconstructor and creates initial values for a class AdultTicket
*/
    AdultTicket(Seat Seatinfo, Date date, Person person, Movies Movie, Theater Theaterinfo,Payment pay) {
        super(Seatinfo, date, person, Movie, Theaterinfo,pay);
    }

      
/*
*This constructor calls the superconstructor and creates initial values for a class AdultTicket
*/
    public AdultTicket(Date date, Person person, Movies Movie, Theater Theaterinfo,Payment pay) {
        super(date, person, Movie, Theaterinfo, pay);
    }

}
