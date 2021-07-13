

package loginbank;

import java.util.ArrayList;

public abstract class Menu {
    private String Title;
    private final ArrayList Menu = new ArrayList<>();

    public String getTitle() {
        return Title;
    }

    public final void setTitle() {
        this.Title = "-------Login Program-------";
    }

    public ArrayList getMenu() {
        return Menu;
    }

    public final void setMenu() {
        this.Menu.add("Vietnamese");
        this.Menu.add("English");        
        this.Menu.add("Exit");
    }

    public Menu() {
        this.setTitle();
        this.setMenu();
    }

    public void displayMenu(){
        System.out.println(this.getTitle());
        for (int i = 0; i < Menu.size(); i++) {
            System.out.println((i+1)+". "+Menu.get(i));
        }
    }

    abstract void excute(int n);

    abstract int select();
}