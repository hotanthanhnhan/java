package contactmanagement;

public class Contact {
    
    private int ID;
    private String fullName;
    private String Group;
    private String Address;
    private String Phone;
    private String firstName;
    private String lastName;

    public Contact() {
    }

    public Contact(int ID, String fullName, String Group, String Address, String Phone, String firstName, String lastName) {
        this.ID = ID;
        this.fullName = fullName;
        this.Group = Group;
        this.Address = Address;
        this.Phone = Phone;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
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

    public void print() {
        System.out.printf("%d\t%-24s%-16s%-16s%-16s%-16s%s\n",ID,fullName,firstName,lastName,Group,Address,Phone);
    }

    
    
    
    
}
