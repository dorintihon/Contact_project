//Dorin Tihon
import java.util.Arrays;
/**
 tester class for testing the methods of other classes
 */

public class ContactListTest{

    //main method
    public static void main(String[] args)   {

        ContactList list = new ContactList();

        list.addContact( new Contact("Don", 5556667777L, "5 Main Rd", 1) );
        //add more contacts
        list.addContact( new Contact("Don1", 1111111122L, "0 Main Rd", 2) );
        list.addContact( new Contact("Don2", 1111111133L, "1 Main Rd", 1) );
        list.addContact( new Contact("Don3", 1111111144L, "2 Main Rd", 3) );


        // call ContactList’s method to print out all contact objects’ data in the contactList.
        list.getAllContacts();



        System.out.println("\n");
        //add more calls to change a contact’s name, phone number, or address
        list.changeContactName(3, "Bella");
        list.changeContactPhoneNum(1, 666777888);
        list.changeContactAddress(2, "10 Mass Ave");


        // call ContactList’s method to print out all contact objects’ data in the contactList.
        list.getAllContacts();

        //prints the total number of contacts in the array
        System.out.println("The total number of contacts in the list is : " + list.getTotal( ) );

        System.out.println("\n");
        // call doesExist method
        Contact contact1 = new Contact("Don3", 1111111144, "2 Main Rd", 3);
        System.out.println(list.doesExist(contact1));
        Contact contact2 = new Contact("Don51", 1111111144, "2 Main Rd", 3);
        System.out.println(list.doesExist(contact2));

        System.out.println("\n");
        //call getter methods of contactlist class
        System.out.println(list.getNameFor(1));
        System.out.println(list.getPhoneFor(3));
        System.out.println(list.getAddressFor(1));

        System.out.println("\n");
        // print the content of the array returned from getGroup() method
        System.out.println(Arrays.toString(list.getGroup(1)));


        System.out.println("\n");
        //print the name of the contact of whose is the phone number
        System.out.println(list.whosePhoneNum(666777888));



    }
}

