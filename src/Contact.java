//Dorin Tihon
/**
Contact class to define the contact object to represent the contact information
for an individual that has name, phone number, address, and group category
 */
public class Contact {

    ////Variables for this class;
    private String contactName;
    private long phoneNumber;
    private String address;
    private int groupCategory;

    //Default constructor
    public Contact() {
        contactName = "none";
        phoneNumber = 0;
        address = "none";
        groupCategory = 0;

    }
    //Constructor
    public Contact(String name, long phone, String address, int group){
        contactName = name;
        phoneNumber = phone;
        this.address = address;
        groupCategory = group;
    }

    //getContactName() returns the name of contact
    public String getContactName() {
        return contactName;
    }

    //setContactName(String contactName) sets the name of a contact
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    //getPhoneNumber() returns the phone number of contact
    public long getPhoneNumber() {
        return phoneNumber;
    }

    //setPhoneNumber(long phoneNumber) sets the phone number for a contact
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //getAddress() returns the address for a contact
    public String getAddress() {
        return address;
    }

    //setAddress(String address) sets the address for the contact object
    public String setAddress(String address) {
        this.address = address;
        return address;
    }

    //getGroupCategory() returns the group of the contact
    public int getGroupCategory() {
        return groupCategory;
    }

    //setGroupCategory(int groupCategory) sets the group for a contact
    public void setGroupCategory(int groupCategory) {
        this.groupCategory = groupCategory;
    }


}
