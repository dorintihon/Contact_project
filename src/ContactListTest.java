public class ContactListTest{

    public static void main(String[] args)   {

        ContactList list = new ContactList();

        list.addContact( new Contact("Don", 555666777, "5 Main Rd", 1) );
        //add more contacts

        // call ContactList’s method to print out all contact objects’ data in the contactList.

        list.changeContactPhoneNum(1, 666777888);
        list.changeContactAddress(3, "10 Mass Ave");
        //add more calls to change a contact’s name, phone number, or address




        // call ContactList’s method to print out all contact objects’ data in the contactList.


        System.out.println("The total number of contacts in the list is : " + list.getTotal( ) );

        // call doesExist method


        // print the content of the array returned from getGroup() method


    }
}

