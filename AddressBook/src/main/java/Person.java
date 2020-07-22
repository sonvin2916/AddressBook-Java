

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Person
{
    Scanner scanner=new Scanner(System.in);
    ArrayList<Person> arrayList = new ArrayList<Person>();
    int duplicate=0;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private int phoneNumber;
    Person person;
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
    void checkDuplicate(String firstName)
    {
        if(arrayList.size()>1)
        {
            for(int index=0;index<arrayList.size();index++)
            {
                person=(Person)arrayList.get(index);
                if(firstName.equals(person.firstName))
                {
                    System.out.println("Duplicate record exits"+person.getFirstName());
                    duplicate=1;
                }
            }
        }
        else {
            System.out.println("Record not found");
        }
    }
    void addPerson()
    {
        System.out.println("Enter the total number of people you want to add");
        int number = scanner.nextInt();
        for(int index=0; index<number; index++)
        {
            System.out.println("Enter First Name");
            String firstName = scanner.next();
            System.out.println("Enter Last Name");
            String lastName = scanner.next();
            checkDuplicate(firstName);
            if(duplicate==0) {
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
                arrayList.add(new Person(firstName,lastName,address,city,state,phoneNumber,zip));
                for(Person add : arrayList)
                {
                    System.out.println("First Name :"+add.getFirstName()+"\nLast Name:"+add.getLastName()+"\nAddress:"+add.getAddress()+"\nState:"+add.getState()+"\nCity:"+add.getCity()+"\nZip:"+add.getZip()+"\nPhone Number:"+add.getPhoneNumber());
                }
            }
        }
    }
    void sortName()
    {
        arrayList.stream().sorted(Comparator.comparing(Person::getFirstName)).forEach(action->System.out.printf("",action.getFirstName(),action.getLastName(),action.getAddress(),action.getCity(),action.getState(),action.getZip(),action.getPhoneNumber()));
    }
    void editPerson() {1
        System.out.println("Enter Person's First Name");
        String firsName = scanner.next();
        for (int index = 0; index < arrayList.size(); index++) {
            person = (Person) arrayList.get(index);
            if (firsName.equals(person.firstName)) {
                System.out.println("Record found" + person.firstName);
                System.out.println("What do you want to edit? \n1.Address \n2.City \n3.State \n4.Zip \n5.PhoneNumber");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter Address");
                        address = scanner.next();
                        person.setAddress(address);
                        break;
                    case 2:
                        System.out.println("Enter City");
                        city = scanner.next();
                        person.setCity(city);
                        break;
                    case 3:
                        System.out.println("Enter State");
                        state = scanner.next();
                        person.setState(state);
                        break;
                    case 4:
                        System.out.println("Enter Zip");
                        zip = scanner.nextInt();
                        person.setZip(zip);
                        break;
                    case 5:
                        System.out.println("Enter Phone Number");
                        phoneNumber = scanner.nextInt();
                        person.setPhoneNumber(phoneNumber);
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
                System.out.print("First Name :" + person.getFirstName() + "\nLast Name:" + person.getLastName() + "\nAddress:" + person.getAddress() + "\nState:" + person.getState() + "\nCity:" + person.getCity() + "\nZip:" + person.getZip() + "\nPhone Number:" + person.getPhoneNumber());
            } else {
                System.out.println("No Matching record found");
            }
        }
    }
    void deletePerson()
    {
        System.out.println("Enter Person's First Name");
        String firstName=scanner.next();
        for(int index=0; index<arrayList.size();index++)
        {
            person=(Person)arrayList.get(index);
            if(firstName.equals(person.firstName))
            {
                System.out.println("Record Found"+person.firstName);
                System.out.println("Are you sure you want to delete \n1.Yes \n2.No ");
                int choice = scanner.nextInt();
                if(choice==1)
                {
                    arrayList.remove(index);
                }
                else
                {
                    System.out.println("Not Deleted");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Address Book Application");
        String firstName = null, lastName = null, address = null, city = null, state = null;
        int zip = 0, phoneNumber = 0;
        Person personDetails = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
        while (true) {
            System.out.println("Enter your choice \n1.Add a Person \n2.Edit a Person \n3.Delete a Person \n4.Exit");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    personDetails.addPerson();
                    ;
                    break;
                case 2:
                    personDetails.editPerson();
                    break;
                case 3:
                    personDetails.deletePerson();
                    break;
                default:
                    System.out.println("Exit");
                    break;


            }
        }
    }

}

