package movietheater;

import java.util.*;

/**
 *
 * @author Nada Ahmad and reyouf wasil
 * @version 8.0.2
 */
public class Reception implements Booking {

    Payment pay = new Payment();
    Movies movie = new Movies();
    Theater t = new Theater();
    Ticket F = new FamilyTicket();
    Seat seat = new Seat();
    Ticket K = new KidsTicket();
    Ticket A = new AdultTicket();
    Bar bar = new Bar();
    int no;
    long phSearch;

    int mn = 0;
    int tt = 0;
    Person person = new Person();
    ArrayList<Ticket> BookingList = new ArrayList<>();

    /**
     * empty constructor
     */
    public Reception() {
    }

    /**
     *
     * @param PhoneNum
     * @return integer value and it is the index of exist element in array
     */
    @Override
    public int TicketSearch(long PhoneNum) {
        int R = -1;
        for (int c = 0; c < BookingList.size(); c++) {
            long r = BookingList.get(c).person.PhoneNum;
            if (PhoneNum == r) {
                R = c;
            }
        }
        return R;
    }

    /**
     *
     * @param PhoneNum this class cancels a ticket by remove it from array
     */
    @Override
    public void Cancel(long PhoneNum) {

        try {
            int f = TicketSearch(PhoneNum);
            BookingList.remove(f);
            System.out.println("Done");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("There is no ticket with this number");
        } catch (Exception e) {
            System.err.println("There is an exception ");
        } finally {
            System.out.println("make sure that if you booked more then one ticket, then you have to cancel it all if you want");
        }
    }

    /**
     * this method creates a ticket by taking an inputs from the user
     */
    @Override
    public void Create() {
        Scanner in = new Scanner(System.in);
        int totalT = 0;

        System.out.println("Do you want to search for a movie?");
        String ans = in.next();
        if (ans.equalsIgnoreCase("yes")) {
            System.out.println("Type the name of the movie that you want to search for: ");
            String name = in.nextLine();
            name = in.nextLine();

            boolean search = movie.MovieSearch(name);
            if (search == true) {
                System.out.println("The movie does exist\n");
            } else {
                System.out.println("The movie does not exist\n");
            }
        }

        System.out.println("");

        System.out.println("-Here's a list of movies-");
        System.out.println(movie.DisplayByType());
        System.out.println("Type the number of Movie that you want to watch");
        no = in.nextInt();
        mn = no;

        System.out.println("what is your name:");
        String namep = in.nextLine();
        namep = in.nextLine();
        System.out.println("what is your number phone:");
        long phonum = in.nextLong();
        long phSearch = phonum;

        System.out.println("Date of Booking Enter the day:");
        int da = in.nextInt();
        System.out.println("Date of Booking Enter the month:");
        int mo = in.nextInt();

        person.AddPerson(namep, phonum);

        System.out.println("what type of ticket you want?\n"
                + " 1/ Single's ticket \n 2/ Family's ticket \n 3/ Kid's ticket");
        int L = in.nextInt();
        tt = L;

        switch (L) {
            case (1):

                System.out.println("How many Single tickets you want?");
                int a = in.nextInt();

                System.out.println("Choose the theater type: \n 1- Rgular Cinema \n 2- 3D Cinema \n 3-Car Cinema");
                int c = in.nextInt();
                if (c == 1 || c == 2) {
                    System.out.println("Choose the number of ticket's type you want: \n 1- Gold \n 2- Platinum \n 3- Silver");
                    int b = in.nextInt();
                    totalT = pay.SingleTickets(b, c);
                    for (int count = 0; count < a; count++) {
                        System.out.println("seat booking for ticket " + (count + 1));
                        switch (b) {

                            case 1:
                                System.out.println("Choose the row of seat you want:\n1- A  \n2- B  \n3- C  \n4- D   \n5- E  \n6- F");
                                int r = in.nextInt();
                                System.out.println("Choose the colmn of seat you want:(From 1 to 10)");
                                int co = in.nextInt();

                                seat.BookedSeat(seat.Goldseat, r, co, "booked");
                                if (c == 1) {
                                    String d = movie.movieName(no);
                                    A = new AdultTicket(new Seat(r, co), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("Rgular Cinema"), new Payment(totalT));
                                    BookingList.add(A);
                                }
                                if (c == 2) {
                                    String d = movie.movieName(no);
                                    A = new AdultTicket(new Seat(r, co), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("3D Cinema"), new Payment(totalT));
                                    BookingList.add(A);
                                }

                                break;
                            case 2:
                                System.out.println("Choose the row of seat you want:(\n1- A  \n2- B  \n3- C  \n4- D   \n5- E  \n6- F)");
                                int r1 = in.nextInt();
                                System.out.println("Choose the colmn of seat you want:(From 1 to 10)");
                                int co1 = in.nextInt();
                                seat.BookedSeat(seat.PlatinumSeat, r1, co1, "booked");
                                if (c == 1) {
                                    String d = movie.movieName(no);
                                    A = new AdultTicket(new Seat(r1, co1), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("Rgular Cinema"), new Payment(totalT));
                                    BookingList.add(A);
                                }
                                if (c == 2) {
                                    String d = movie.movieName(no);
                                    A = new AdultTicket(new Seat(r1, co1), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("3D Cinema"), new Payment(totalT));
                                    BookingList.add(A);
                                }
                                break;
                            case 3:
                                System.out.println("Choose the row of seat you want:(\n1- A  \n2- B  \n3- C  \n4- D   \n5- E  \n6- F)");
                                int r2 = in.nextInt();
                                System.out.println("Choose the colmn of seat you want:(From 1 to 10)");
                                int co2 = in.nextInt();
                                seat.BookedSeat(seat.PlatinumSeat, r2, co2, "booked");
                                if (c == 1) {
                                    String d = movie.movieName(no);
                                    A = new AdultTicket(new Seat(r2, co2), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("Rgular Cinema"), new Payment(totalT));
                                    BookingList.add(A);
                                }
                                if (c == 2) {
                                    String d = movie.movieName(no);
                                    A = new AdultTicket(new Seat(r2, co2), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("3D Cinema"), new Payment(totalT));
                                    BookingList.add(A);
                                }
                                break;
                        }
                    }
                } else if (c == 3) {
                    String d = movie.movieName(no);
                    A = new AdultTicket(new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("Car Cinema"), new Payment(totalT));
                    BookingList.add(F);
                } else {
                    System.out.println("wrong enter");
                }

                break;

            case (2):
                System.out.println("Enter the number of the family members: ");
                int x = in.nextInt();

                System.out.println("Choose the theater type: \n 1- Rgular Cinema \n 2- 3D Cinema \n 3-Car Cinema");
                int z = in.nextInt();
                if (z == 1 || z == 2) {
                    System.out.println("Choose the number of ticket's type you want: \n 1- Gold \n 2- Platinum \n 3- Silver");
                    int y = in.nextInt();
                    totalT = pay.SingleTickets(y, z);
                    for (int count = 0; count < x; count++) {
                        System.out.println("seat booking for ticket " + (count + 1));
                        switch (y) {

                            case 1:
                                System.out.println("Choose the row of seat you want:(\n1- A  \n2- B  \n3- C  \n4- D   \n5- E  \n6- F)");
                                int r = in.nextInt();
                                System.out.println("Choose the colmn of seat you want:(From 1 to 10)");
                                int co = in.nextInt();
                                seat.BookedSeat(seat.Goldseat, r, co, "booked");
                                if (z == 1) {
                                    String d = movie.movieName(no);
                                    F = new FamilyTicket(new Seat(r, co), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("Rgular Cinema"), new Payment(totalT));
                                    BookingList.add(F);
                                }
                                if (z == 2) {
                                    String d = movie.movieName(no);
                                    F = new FamilyTicket(new Seat(r, co), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("3D Cinema"), new Payment(totalT));
                                    BookingList.add(F);
                                }
                                break;
                            case 2:
                                System.out.println("Choose the row of seat you want:(\n1- A  \n2- B  \n3- C  \n4- D   \n5- E  \n6- F)");
                                int r1 = in.nextInt();
                                System.out.println("Choose the colmn of seat you want:(From 1 to 10)");
                                int co1 = in.nextInt();
                                seat.BookedSeat(seat.PlatinumSeat, r1, co1, "booked");
                                if (z == 1) {
                                    String d = movie.movieName(no);
                                    F = new FamilyTicket(new Seat(r1, co1), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("Rgular Cinema"), new Payment(totalT));
                                    BookingList.add(F);
                                }
                                if (z == 2) {
                                    String d = movie.movieName(no);
                                    F = new FamilyTicket(new Seat(r1, co1), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("3D Cinema"), new Payment(totalT));
                                    BookingList.add(F);
                                }
                                break;
                            case 3:
                                System.out.println("Choose the row of seat you want:(\n1- A  \n2- B  \n3- C  \n4- D   \n5- E  \n6- F)");
                                int r2 = in.nextInt();
                                System.out.println("Choose the colmn of seat you want:(From 1 to 10)");
                                int co2 = in.nextInt();
                                seat.BookedSeat(seat.PlatinumSeat, r2, co2, "booked");
                                if (z == 1) {
                                    String d = movie.movieName(no);
                                     F = new FamilyTicket(new Seat(r2, co2), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("Rgular Cinema"), new Payment(totalT));
                                    BookingList.add(A);
                                }
                                if (z == 2) {
                                    String d = movie.movieName(no);
                                    F = new FamilyTicket(new Seat(r2, co2), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("3D Cinema"), new Payment(totalT));
                                    BookingList.add(A);
                                }
                                break;
                        }
                    }
                } else if (z == 3) {
                    String d = movie.movieName(no);
                    F = new FamilyTicket(new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("Car Cinema"), new Payment(totalT));
                    BookingList.add(F);
                } else {
                    System.out.println("wrong enter");

                }

                break;
            case (3):
                System.out.println("How many kids tickets you want?");
                int i = in.nextInt();

                System.out.println("Choose the theater type: \n 1- Rgular Cinema \n 2- 3D Cinema \n 3-Car Cinema");
                int k = in.nextInt();
                if (k == 1 || k == 2) {
                    System.out.println("Choose the number of ticket's type you want: \n 1- Gold \n 2- Platinum \n 3- Silver");
                    int j = in.nextInt();
                    totalT = pay.SingleTickets(j, k);
                    for (int count = 0; count < i; count++) {
                        System.out.println("seat booking for ticket " + (count + 1));
                        switch (j) {

                            case 1:
                                System.out.println("Choose the row of seat you want:(\n1- A  \n2- B  \n3- C  \n4- D   \n5- E  \n6- F)");
                                int r = in.nextInt();
                                System.out.println("Choose the colmn of seat you want:(From 1 to 10)");
                                int co = in.nextInt();
                                seat.BookedSeat(seat.Goldseat, r, co, "booked");
                                if (k == 1) {
                                    String d = movie.movieName(no);
                                    K = new KidsTicket(new Seat(r, co), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("Rgular Cinema"), new Payment(totalT));
                                    BookingList.add(K);
                                }
                                if (k == 2) {
                                    String d = movie.movieName(no);
                                    K = new KidsTicket(new Seat(r, co), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("3D Cinema"), new Payment(totalT));
                                    BookingList.add(K);
                                }
                                break;
                            case 2:
                                System.out.println("Choose the row of seat you want:(\n1- A  \n2- B  \n3- C  \n4- D   \n5- E  \n6- F)");
                                int r1 = in.nextInt();

                                System.out.println("Choose the colmn of seat you want:(From 1 to 10)");
                                int co1 = in.nextInt();

                                seat.BookedSeat(seat.PlatinumSeat, r1, co1, "booked");
                                if (k == 1) {
                                    String d = movie.movieName(no);
                                    K = new KidsTicket(new Seat(r1, co1), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("Rgular Cinema"), new Payment(totalT));
                                    BookingList.add(K);
                                }
                                if (k == 2) {
                                    String d = movie.movieName(no);
                                    K = new KidsTicket(new Seat(r1, co1), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("3D Cinema"), new Payment(totalT));
                                    BookingList.add(K);
                                }
                                break;
                            case 3:
                                System.out.println("Choose the row of seat you want:(\n1- A  \n2- B  \n3- C  \n4- D   \n5- E  \n6- F)");
                                int r2 = in.nextInt();
                                System.out.println("Choose the colmn of seat you want:(From 1 to 10)");
                                int co2 = in.nextInt();
                                seat.BookedSeat(seat.PlatinumSeat, r2, co2, "booked");
                                if (k == 1) {
                                    String d = movie.movieName(no);
                                     K = new KidsTicket(new Seat(r2, co2), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("Rgular Cinema"), new Payment(totalT));
                                    BookingList.add(A);
                                }
                                if (k == 2) {
                                    String d = movie.movieName(no);
                                     K = new KidsTicket(new Seat(r2, co2), new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("3D Cinema"), new Payment(totalT));
                                    BookingList.add(A);
                                }
                                break;
                        }
                    }
                } else if (k == 3) {
                    String d = movie.movieName(no);
                    K = new KidsTicket(new Date(da, mo, 2022), new Person(namep, phonum), new Movies(d), new Theater("Car Cinema"), new Payment(totalT));
                    BookingList.add(K);
                } else {
                    System.out.println("wrong enter");
                }

        }

    }

    /**
     * The finalTicket() method prints the final ticket the user booked
     */
    public void finalTicket() {
        int num = 0;
        int price = 0;

        for (int i = 0; i < BookingList.size(); i++) {

            System.out.println("´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´");
            System.out.println("                 * Cinema Ticket *                   \n");
            System.out.println(" • GUEST INFO \n" + BookingList.get(i).person.toString() + "\n\n • MOVIE INFO");
            System.out.println("        The Name Of The Movie: " + BookingList.get(i).Movie.getName());
            BookingList.get(i).Movie.DisplayMovieInfo(mn);

            System.out.println("\n • SEAT INFO \n" + BookingList.get(i).Seatinfo.toString());
            System.out.println("\n • DATE \n" + BookingList.get(i).date.toString());
            System.out.println(BookingList.get(i).Theaterinfo.toString());
            System.out.println("________________");
            System.out.println("The price of your ticket is: " + BookingList.get(i).pay.t + " SR");
            System.out.println("________________");
            System.out.println("´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´\n");

            if (i >= 0) {
                price += BookingList.get(i).pay.t;//* (i + 1);
                // num += i;
            }
        }
        // if(num > 0){
        System.out.println("•The total price of all tickets is: " + price + " SR\n");
        // }
    }

}