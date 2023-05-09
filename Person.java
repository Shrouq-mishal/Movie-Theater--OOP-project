package movietheater;

/**
 *
 * @author Nada Ahmad
 */
public class Person {

    private String Name;

    long PhoneNum;

    /**
     *
     */
    public Person[] person = new Person[100];
    int PN = 0;

    /**
     * empty constractor
     */
    public Person() {
    }

    /**
     * constractor
     * @param Name
     * @param PhoneNum
     */
    public Person(String Name, long PhoneNum) {
        this.Name = Name;

        this.PhoneNum = PhoneNum;

    }

   

    /**
     * method for add person to the list
     * @param Name
     * @param PhoneNum
     */
    public void AddPerson(String Name, long PhoneNum) {
        person[PN] = new Person(Name, PhoneNum);
        PN++;

    }

    /**
     * getter
     * @return
     */
    public String getName() {
        return Name;
    }

    /**
     * setter
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /** 
     * getter
     * @return
     */
    public long getPhoneNum() {
        return PhoneNum;
    }

    /**
     * setter
     * @param PhoneNum
     */
    public void setPhoneNum(long PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * to string for print information
     * @return
     */
    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", PhoneNum=" + PhoneNum + '}';
    }

}
