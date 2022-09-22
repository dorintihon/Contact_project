class ContactList
{
    Contact[] contact;
    int count;

    ContactList()
    {
        contact = new Contact[99];
        count = 0;
    }

    void addContact(Contact contact)
    {
        this.contact[count] = contact;
        count++;
    }

    Contact changeContactName( int i, String n) //to change the name of a specific contact object (the ith one).
    {
        contact[i].setContactName(n);
        return contact[i];
    }


    Contact changeContactPhoneNum( int i, int phone) //to change the phone number of a specific contact object.
    {
        contact[i].setPhoneNumber(phone);
        return contact[i];
    }


    Contact changeContactAddress( int i, String add) //to change the address of a specific contact object.
    {
        contact[i].setAddress(add);
        return contact[i];
    }

    Contact getNameFor(int i) // to retrieve the name of a specific contact object.
    {
        return contact[i];
    }

    Contact getPhoneFor( int i ) // to retrieve the phone number of a specific contact object.
    {
        return contact[i];
    }

    Contact getAddressFor( int i ) // to retrieve the address of a specific contact object.
    {
        return contact[i];
    }

    int getTotal( ) // to return the total number of contact objects in the contactArray.
    {
        return contact.length - (contact.length - count);
    }

    Contact whosePhoneNum(int phoneNum) // to return the name of the contact for given phone number. If the phone number doesn’t exist, it should return an error message.
    {
        for(int i = 0; i< count; i++)
        {
            if((contact[i].getPhoneNumber())==phoneNum)
            {
                return contact[i];
            }
        }
        return null;
    }


    Contact getGroup(int g) // returns an contactArray of contacts that are in groupCategory g.
    {
        int i = 0;
        while( i< count){
            if(contact[i].getGroupCategory() == g) {
                System.out.println(contact[i].getContactName());
                return contact[i];
            }
            i++;
        }
        return null;
    }


    boolean doesExist(Contact c) // returns true if a contact object c exists in the contactArray.
    {
        for(Contact i : contact)
        {
            if( i == c ) {
                return true;
            }

        }
        return false;
    }

    void getAllContacts() // returns the information on all contacts in the contactArray as a formatted String.
    {
        for(int i = 0; i< count; i++)
        {
            System.out.println("Name: " + contact[i].getContactName() + " -- Phone number: " + contact[i].getPhoneNumber()
                    + " -- Address: " + contact[i].getAddress() + " -- Group: " + contact[i].getGroupCategory() + "\n");
        }

    }
}