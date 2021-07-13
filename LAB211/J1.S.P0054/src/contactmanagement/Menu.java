package contactmanagement;

import java.util.ArrayList;

public abstract class Menu {
    private String title;
    ArrayList menu = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public final void setTitle() {
        this.title = "========= Contact program =========";
    }

    public ArrayList getMenu() {
        return menu;
    }

    public Menu(String title, ArrayList menu) {
        this.title = title;
        this.menu = menu;
    }

    public Menu() {
        this.menu = new ArrayList<>();
        this.setMenu();
        this.setTitle();
    }
    
    public final void setMenu(){
        menu.add(0,"Add a Contact");
        menu.add(1,"Display all Contact");
        menu.add(2,"Delete a Contact");
        menu.add(3,"Exit");
    }
    
    public void display(){
        System.out.println(this.getTitle());
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i+1)+". "+menu.get(i));
        }
    }
    
    abstract void excute(int n);
}
