public class ContactListTest{

    public static void main(String[] args)   {

        ContactList list = new ContactList();

        list.addContact( new Contact("Don", 555666777, "5 Main Rd", 1) );
        //add more contacts
        list.addContact( new Contact("Don1", 111111112, "0 Main Rd", 2) );
        list.addContact( new Contact("Don2", 111111113, "1 Main Rd", 1) );
        list.addContact( new Contact("Don3", 111111114, "2 Main Rd", 3) );


        // call ContactList’s method to print out all contact objects’ data in the contactList.
        list.getAllContacts();



        System.out.println("\n");



        //add more calls to change a contact’s name, phone number, or address
        Contact contact1 = list.changeContactName(3, "Bella");
        list.changeContactPhoneNum(1, 666777888);
        list.changeContactAddress(2, "10 Mass Ave");


        // call ContactList’s method to print out all contact objects’ data in the contactList.
        list.getAllContacts();

        System.out.println("The total number of contacts in the list is : " + list.getTotal( ) );

        // call doesExist method
        System.out.println(list.doesExist(contact1));



        // print the content of the array returned from getGroup() method
        list.getGroup(1);

        Contact contact7 = list.whosePhoneNum(666777888);
        System.out.println(contact7.getContactName());


    }
}

