public class Contact {
    private String contactName;
    private int phoneNumber;
    private String address;
    private int groupCategory;

    public Contact() {
        contactName = "";
        phoneNumber = 0;
        address = "";
        groupCategory = 0;

    }
    public Contact(String name, int phone, String address, int group){
        contactName = name;
        phoneNumber = phone;
        this.address = address;
        groupCategory = group;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGroupCategory() {
        return groupCategory;
    }

    public void setGroupCategory(int groupCategory) {
        this.groupCategory = groupCategory;
    }
}
