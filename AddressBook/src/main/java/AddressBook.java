import java.util.Scanner;

public class AddressBook
{
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private int phoneNumber;
    public AddressBook(String firstName, String lastName, String address, String city, String state, int zip, int phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public AddressBook()
    {

    }

    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public String getState()
    {
        return state;
    }
    public void setState(String state)
    {
        this.state = state;
    }
    public int getZip()
    {
        return zip;
    }
    public void setZip(int zip)
    {
        this.zip = zip;
    }
    public int getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

    public void display(){
        System.out.println("\nAddress Book\n FirstName:"+firstName+"\nLastName:"+lastName+"\nAddress:"+address+"\nState:"+state+"\nCity:"+city+"\nZip:"+zip+"\nPhone:"+phoneNumber);
    }
    void addPerson ()
    {

            System.out.println("Enter First Name");
            String firstName = scanner.next();

            System.out.println("Enter Last Name");
            String lastName = scanner.next();

            System.out.println("Enter Address");
            String address = scanner.next();

            System.out.println("Enter City");
            String city = scanner.next();

            System.out.println("Enter State");
            String state = scanner.next();

            System.out.println("Enter Zip Code");
            int zip = scanner.nextInt();

            System.out.println("Enter Phone Number");
            int phoneNumber = scanner.nextInt();

            AddressBook addressBook = new AddressBook(firstName, lastName, address, city, state, zip, phoneNumber);
            addressBook.display();
    }

    public static void main(String[] args)
    {
        AddressBook addressBook = new AddressBook();
        addressBook.addPerson();

    }


}

