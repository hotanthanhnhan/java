package contactmanagement;

import java.util.*;

public class ContactList {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Contact> List = new ArrayList<>();
    private int idCounter = 0;
    public ArrayList<Contact> getList() {
        return List;
    }

    public void setList(ArrayList<Contact> List) {
        this.List = List;
    }

    public ContactList() {            
    }
    
    public void addContact(Contact e){
        e.setID(GetId());
        List.add(e);
    }
    
    public void deleteContact(int ID){
        System.out.println("Successful");
        List.remove(ID);
    }
    
    private synchronized int GetId(){
	     idCounter = idCounter + 1;
	     return idCounter;
    }
    
    public void Display(){        
        System.out.println("ID\tName\t\t\tFirst Name\tLast Name\tGroup\t\tAddress\t\tPhone");
        for (int i = 0; i < List.size(); i++) {
            List.get(i).print();
        }
    }
}
