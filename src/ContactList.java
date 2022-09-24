//Dorin Tihon
/**
 ContactList class that contains an array of Contact objects with defining the methods
 to be able to manage the objects.
 */
class ContactList
{
    //Variables for this class;
    private Contact[] contact;
     private int contacts = 0;

     //Default constructor
    public ContactList()
    {
        contact = new Contact[50];

    }
    //Constructor
    public ContactList(Contact[] contact) {
        this.contact = contact;

    }

    //addContact( … ) to add a contact object to the array.
    public void addContact(Contact contact)
    {

        this.contact[contacts] = contact;
        contacts++;
    }

    //changeContactName( int i, String n) to change the name of a specific contact object (the ith  one).
    public void changeContactName( int i, String n)
    {
        contact[i].setContactName(n);

    }


    //changeContactPhoneNum( int i, int phone) to change the phone number of a specific contact object.
    public void changeContactPhoneNum( int i, int phone)
    {
        contact[i].setPhoneNumber(phone);

    }

    //changeContactAddress( int i, String add) to change the address of a specific contact object.
    public void changeContactAddress( int i, String add)
    {
        contact[i].setAddress(add);

    }

    //getNameFor( int i ) to retrieve the name of a specific contact object.
    public String getNameFor(int i)
    {
        return contact[i].getContactName();
    }

    //getPhoneFor( int i ) to retrieve the phone number of a specific contact object
    public long getPhoneFor(int i)
    {
        return contact[i].getPhoneNumber();
    }


    //getAddressFor( int i ) to retrieve the address of a specific contact object.
    public String getAddressFor(int i)
    {
        return contact[i].getAddress();
    }

    //getTotal( ) to return the total number of contact objects in the array.
    public int getTotal( )
    {
        return contact.length - (contact.length - contacts);
    }

    //whosePhoneNum(int phoneNum) to return the name of the contact for given phone number.
    // If the phone number doesn’t exist, it should return an error message.
    public String whosePhoneNum(int phoneNum)
    {
        for(int i = 0; i< contacts; ++i)
        {
            if((contact[i].getPhoneNumber())==phoneNum)
            {
                return contact[i].getContactName();
            }
        }

        return null;
    }


    // Method that returns an contactArray of contacts that are in groupCategory g.
    public Contact[] getGroup(int g) {
        int i = 0;
        Contact[] group = new Contact[4];
        while (i < contacts) {
            if (contact[i].getGroupCategory() == g) {
                 group[i] = contact[i];
            }
            ++i;
        }

        return group;
    }



    //doesExist(Contact c) returns true if a contact object c exists in the array.
    public boolean doesExist(Contact c)
    {
        for(int i=0; i<contacts; ++i)
        {
            if(contact[i]==c)
                return true;
        }
        return false;
    }

    //getAllContacts() returns the information on all contacts in the array as a formatted String.
    public void getAllContacts()
    {
        for(int i = 0; i< contacts; ++i)
        {
            System.out.println("Name: " + contact[i].getContactName() + " -- Phone number: " + contact[i].getPhoneNumber()
                    + " -- Address: " + contact[i].getAddress() + " -- Group: " + contact[i].getGroupCategory() + "\n");
        }

    }
}