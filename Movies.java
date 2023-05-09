
package movietheater;

/**
 * @author Walaa alzahrani 
 * Movies.java is a concrete class that contains a list
 * of movies and some methods that serves the purpose of this class.
 */
public class Movies {

    /**
     * Three public instance variables Name of type String , Type of type String
     * , ShowTime of type Time
     */
    public String Name;
    public String Type;
    public Time ShowTime;
    int r;

    /**
     * Creating object of class Time using the new keyword
     */
    Time time = new Time();

    /**
     * MoviesList is an array of length 20 and type String
     * MoviesList contains a list of movie's names
     */
    String[] MoviesList
            = {"Harry Potter", "Life Of Pi", "Pride and Prejudice", "Hichki", "Innocent Witnesses",
                "Parasite", "The Help 2011", "Hidden Figures", "Midnight Runners", "Extreme Job",
                "Death At A Funeral", "The Prodigy", "Luca", "Encanto", "I Am Mother", "Avengers: End Game",
                "Black Panther", "The Space Between Us", "Interstellar", "Spiderman: No Way Home"};

    /**
     * An empty constructor
     */
    public Movies() {
    }

    /**
     * Class constructor
     * @param Name of type String, refers to a class instance variable by this keyword
     */
    public Movies(String Name) {
        this.Name = Name;
    }

    /**
     * Class constructor
     * @param r the number of the movie that the user have chosen
     */
    public Movies(int r) {
        this.r = r;
    }

    /**
     * Class constructor
     * @param Name of type String, refers to a class instance variable by this keyword
     * @param Type of type String, refers to a class instance variable by this keyword
     * @param ShowTime of type Time, refers to a class instance variable by this keyword
     */
    public Movies(String Name, String Type, Time ShowTime) {
        this.Name = Name;
        this.Type = Type;
        this.ShowTime = ShowTime;

    }

    /**
     * Getter
     * @return String Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Setter
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Getter
     * @return String Type
     */
    public String getType() {
        return Type;
    }

    /**
     * Setter
     * @param Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Getter
     * @return Time ShowTime
     */
    public Time getShowTime() {
        return ShowTime;
    }

    /**
     * Setter
     * @param ShowTime
     */
    public void setShowTime(Time ShowTime) {
        this.ShowTime = ShowTime;
    }

    /**
     * Getter
     * @return int r
     */
    public int getR() {
        return r;
    }

    /**
     * Setter
     * @param r 
     */
    public void setR(int r) {
        this.r = r;
    }

    /**
     * This method displays a list of movies by their types/genres
     * @return String
     */
    public String DisplayByType() {
        System.out.println(" \n ____________________");
        System.out.println("          Fantasy: \n ____________________");
        for (int i = 0; i < 2; i++) {
            System.out.println("\n" + (i + 1) + "â€¢" + MoviesList[i]);
        }
        System.out.println(" \n ____________________");
        System.out.println("          Drama: \n ____________________");
        for (int i = 2; i < 8; i++) {
            System.out.println("\n " + (i + 1) + "â€¢" + MoviesList[i]);
        }
        System.out.println(" \n ____________________");
        System.out.println("          Action: \n ____________________");
        for (int i = 8; i < 10; i++) {
            System.out.println("\n " + (i + 1) + "â€¢" + MoviesList[i]);
        }
        System.out.println(" \n ____________________");
        System.out.println("          Comedy: \n ____________________");
        for (int i = 10; i < 11; i++) {
            System.out.println("\n " + (i + 1) + "â€¢" + MoviesList[i]);
        }
        System.out.println(" \n ____________________");
        System.out.println("           Horror: \n ____________________");
        for (int i = 11; i < 12; i++) {
            System.out.println("\n " + (i + 1) + "â€¢" + MoviesList[i]);
        }
        System.out.println(" \n ____________________");
        System.out.println("         Animation: \n ____________________");
        for (int i = 12; i < 14; i++) {
            System.out.println("\n " + (i + 1) + "â€¢" + MoviesList[i]);
        }
        System.out.println(" \n ____________________");
        System.out.println("          SciFi: \n ____________________");
        for (int i = 14; i < 20; i++) {
            System.out.println("\n " + (i + 1) + "â€¢" + MoviesList[i]);
        }
        System.out.println(" \n ____________________");

        return "";
    }

    /**
     * This method displays the movies informations (name, type, ShowTime)
     * @param Name the number of the movie that the user chose
     */
    public void DisplayMovieInfo(int Name) {
        int num;
        String d = null;
        for (int x = 0; x < 20; x++) {
            if ((Name - 1) == x) {
                num = x;
                if (num < 2) {
                    setType("Fantasy");
                    System.out.println("        The Genre: " + getType());
                    Time time = new Time(9, 30);
                    System.out.println(time.toString());
                } else if (num < 8) {
                    setType("Drama");
                    System.out.println("        The Genre: " + getType());
                    Time time = new Time(11, 30);
                    System.out.println(time.toString());
                } else if (num < 10) {
                    setType("Action");
                    System.out.println("        The Genre: " + getType());
                    Time time = new Time(2, 30);
                    System.out.println(time.toString());
                } else if (num < 11) {
                    setType("Comedy");
                    System.out.println("        The Genre: " + getType());
                    Time time = new Time(4, 30);
                    System.out.println(time.toString());
                } else if (num < 14) {
                    setType("Animation");
                    System.out.println("        The Genre: " + getType());
                    Time time = new Time(6, 00);
                    System.out.println(time.toString());
                } else if (num < 20) {
                    setType("SciFi");
                    System.out.println("        The Genre: " + getType());
                    Time time = new Time(8, 30);
                    System.out.println(time.toString());
                } else {
                    System.out.println("error");
                }
            }
        }

    }

    /**
     * This method search for a movie in the array
     * @param Name the name of the movie
     * @return flag of boolean type 
     */
    public boolean MovieSearch(String Name) {
        boolean flag = false;
        for (int i = 0; i < MoviesList.length; i++) {
            if (Name.equalsIgnoreCase(MoviesList[i])) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * This method receives r the number of the movie that the user chose and
     * search for it in MoviesList[] then return the movie name
     * @param r movie number
     * @return String f is the movie name
     */
    public String movieName(int r){
        r = r - 1;
        String f = MoviesList[r];
        return f;
    }
    
    @Override
    public String toString() {
        return "Movies{" + "Name=" + Name + ", Type=" + Type + ", ShowTime=" + time.toString() + '}';
    }

}