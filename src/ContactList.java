public class ContactList {
    Contact[] contact;
    int i ;

    public ContactList() {
        contact = new Contact[500];
        i = 0;
    }

    void addContact(Contact cont)
    {
        contact[i] = cont;
        i = i + 1;
    }

    Contact changeContactName( int i, String n){
        contact[i].setContactName(n);
        return contact[i];
    }
    Contact changeContactPhoneNum( int i, int phone){
        contact[i].setPhoneNumber(phone);
        return contact[i];
    }
    Contact changeContactAddress( int i, String add){
        contact[i].setAddress(add);
        return contact[i];
    }
    Contact getNameFor(int i ){
        return contact[i];
    }
    Contact getPhoneFor( int i ){
        return contact[i];
    }
    Contact getAddressFor( int i ){
        return contact[i];
    }
    int getTotal(){
        return contact.length;
    }


}
