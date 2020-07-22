
import java.util.ArrayList;
import java.util.Scanner;

public class Person
{
    Scanner scanner=new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private int phoneNumber;
    Person(){}
    Person(String firstName, String lastName, String address, String city, String state, int zip, int phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void display()
    {
        System.out.println("\nAddress Book\n FirstName:" + firstName + "\nLastName:" + lastName + "\nAddress:" + address + "\nState:" + state + "\nCity:" + city + "\nZip:" + zip + "\nPhone:" + phoneNumber);
    }

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> arrayList = new ArrayList<Person>();
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

        Person person = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
        person.display();

        System.out.println("What do you want to edit? \n1.Address \n2.City \n3.State \n4.Zip \n5.PhoneNumber");
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1 : System.out.println("Enter Address");
                     address = scanner.next();
                     person.setAddress(address);
                     break;
            case 2 : System.out.println("Enter City");
                      city = scanner.next();
                     person.setCity(city);
                     break;
            case 3 : System.out.println("Enter State");
                     state = scanner.next();
                     person.setState(state);
                     break;
            case 4 : System.out.println("Enter Zip");
                     zip = scanner.nextInt();
                     person.setZip(zip);
                     break;
            case 5 : System.out.println("Enter Phone Number");
                     phoneNumber =  scanner.nextInt();
                     person.setPhoneNumber(phoneNumber);
                     break;
        }
        arrayList.add(new Person(firstName, lastName, address, city, state, zip, phoneNumber));
        person.display();

        System.out.println("Enter the First Name of the person ");
        String name = scanner.next();
        for(Person deletePerson:arrayList)
        {
            if(arrayList.contains(name))
            {
                arrayList.remove(deletePerson);
                System.out.println("Deleted Successfully");
            }
        }


    }



}

