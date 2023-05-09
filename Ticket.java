
package movietheater;

import java.util.ArrayList;

/**
 *
 * @author Rofaa
 */
public abstract class Ticket {

    /**
     *
     */
    public Seat Seatinfo;

    /**
     *
     */
    public Date date;

    /**
     *
     */
    public Person person;

    /**
     *
     */
    public Movies Movie;

    /**
     *
     */
    public Theater Theaterinfo;
      public Payment pay;
    /**
     *
     */
    public Ticket() {
    }

   
    
    
    public Ticket(Date date, Person person, Movies Movie, Theater Theaterinfo, Payment pay) {
        this.date = date;
        this.person = person;
        this.Movie = Movie;
        this.Theaterinfo = Theaterinfo;
        this.pay = pay;
    }

    public Ticket(Seat Seatinfo, Date date, Person person, Movies Movie, Theater Theaterinfo, Payment pay) {
        this.Seatinfo = Seatinfo;
        this.date = date;
        this.person = person;
        this.Movie = Movie;
        this.Theaterinfo = Theaterinfo;
        this.pay = pay;
    }

    
    /**
     *
     * @return
     */
    public Seat getSeatinfo() {
        return Seatinfo;
    }

    /**
     *
     * @param Seatinfo
     */
    public void setSeatinfo(Seat Seatinfo) {
        this.Seatinfo = Seatinfo;
    }

    /**
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * @return
     */
    public Person getPerson() {
        return person;
    }

    /**
     *
     * @param person
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     *
     * @return
     */
    public Movies getMovie() {
        return Movie;
    }

    /**
     *
     * @param Movie
     */
    public void setMovie(Movies Movie) {
        this.Movie = Movie;
    }

    /**
     *
     * @return
     */
    public Theater getTheaterinfo() {
        return Theaterinfo;
    }

    /**
     *
     * @param Theaterinfo
     */
    public void setTheaterinfo(Theater Theaterinfo) {
        this.Theaterinfo = Theaterinfo;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Ticket{"+ ", Seatinfo=" + Seatinfo +  ", date=" + date + ", person=" + person + ", Movie=" + Movie + ", Theaterinfo=" + Theaterinfo + '}';
    }
    
     
    
    
    
}



     
   


