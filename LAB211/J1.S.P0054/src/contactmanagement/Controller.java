package contactmanagement;

import java.util.Scanner;

public class Controller extends Menu {
    Scanner sc = new Scanner(System.in);
    ContactList ls = new ContactList();
    
    @Override
    void excute(int n) {
        switch (n) {
            case 1:{
                System.out.println("-------- Add a Contact --------");
                this.add();
                System.out.println("Successful");
                break;
            }
            case 2:{
                if(ls.getList().isEmpty()){
                    System.out.println("List contact is empty. Please add new contact to list.");
                    break;
                }
                else{
                    this.Display();
                break;
                }
            }
            case 3:{
                if(ls.getList().isEmpty()){
                    System.out.println("List contact is empty. Please add new contact to list.");
                    break;
                }
                else{
                    this.delete();
                    break;
                }
            }
            default: System.out.println("No invalid.");                    
        }
    }
    
    public void add(){
       Contact e = newContact();
       ls.addContact(e);
    }
    
    private Contact newContact(){
        Contact e = new Contact();
        System.out.print("Enter First Name: ");
        e.setFirstName(sc.nextLine().trim());
        System.out.print("Enter Last Name: ");
        e.setLastName(sc.nextLine().trim());
        e.setFullName(e.getFirstName()+" "+e.getLastName());
        System.out.print("Enter Group: ");
        e.setGroup(sc.nextLine());
        System.out.print("Enter Address: ");
        e.setAddress(sc.nextLine());
        System.out.print("Enter Phone: ");
        e.setPhone(Validation.checkInputPhone());
        return e;
    }
    
    public void Display(){
        System.out.println("------------------------------------------ Display all Contact -------------------------------------");
        ls.Display();
    }
    
    public void delete(){
        System.out.println("------- Delete a Contact -------");
        int ID = 0;
        String input;
        while (true) {
            while (true) {
                try{
                    System.out.print("Enter ID: ");
                    input = sc.nextLine();
                    if(Validation.CheckInput(input)){
                        ID = Integer.valueOf(input);
                        break;
                    }
                } catch(Validation ex){
                    System.out.println("ID is digit");
                } catch (NumberFormatException ex){
                        System.out.println("ID is digit");
                }    
            }
            for (int i = 0; i < ls.getList().size(); i++) {
                    if(ls.getList().get(i).getID() == ID){
                        ls.deleteContact(i);
                        return;
                    }
                } 
            System.out.println("ID isn't exist");
        }     
    }
    
    public int setn(){
        this.display();
        String input;
        int n;
        while (true) {
            while (true) {
                try{
                    System.out.print("Your choice: ");
                    input = sc.nextLine();
                    if(Validation.CheckInput(input)){
                        n = Integer.valueOf(input);
                        break;
                    }
                } catch (Validation ex) {
                    System.out.println("Please enter digit");
                } catch (NumberFormatException ex){
                    System.out.println("Please enter digit");
                }
            }
            if(n != 1 && n != 2 && n != 3 && n != 4)
                System.out.println("Please choose number 1 to 4.");
            else break;
        }
        return n;
    }
}
