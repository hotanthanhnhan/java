
package loginbank;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller extends Menu{

    Login L = new Login();
    Scanner sc = new Scanner(System.in);
    Locale localeVi = new Locale("vi");
    ResourceBundle vi = ResourceBundle.getBundle("language.language", localeVi);
    Locale localeEn = new Locale("en");
    ResourceBundle en = ResourceBundle.getBundle("language.language", localeEn);
    
    @Override
    void excute(int n) {
        switch (n) {
            case 1:{
                this.loginVi();
                break;
            }
            case 2:{
                this.loginEn();
                break;
            }     
            case 3:{
                System.exit(0);
            }
            default: System.err.println("No invalid.");              
        }
    }

     void loginVi(){
        System.out.print(vi.getString("Account"));
        L.setAccount(sc.nextLine().trim());
        while (!Validation.checkAccount(L.getAccount())) {
            System.err.println(vi.getString("AccountError"));
            System.out.print(vi.getString("Account"));
            L.setAccount(sc.nextLine().trim());
        }
        System.out.print(vi.getString("Pass"));
        L.setPass(sc.nextLine().trim());
        while (!Validation.checkPass(L.getPass())) {
            System.err.println(vi.getString("PassError"));
            System.out.print(vi.getString("Pass"));
            L.setPass(sc.nextLine().trim());
        }
        L.setCaptcha();
        System.out.println("Captcha: "+L.getCaptcha());
        System.out.print(vi.getString("Captcha"));
        String resCaptcha = sc.nextLine().trim();
        while (!resCaptcha.equals(L.getCaptcha())) {
            System.err.println(vi.getString("CaptchaError"));
            System.out.print(vi.getString("Captcha"));
            resCaptcha = sc.nextLine().trim();
        }
    }

    private void loginEn(){
        System.out.print(en.getString("Account"));
        L.setAccount(sc.nextLine().trim());
        while (!Validation.checkAccount(L.getAccount())) {
            System.err.println(en.getString("AccountError"));
            System.out.print(en.getString("Account"));
            L.setAccount(sc.nextLine().trim());
        }
        System.out.print(en.getString("Pass"));
        L.setPass(sc.nextLine().trim());
        while (!Validation.checkPass(L.getPass())) {
            System.err.println(en.getString("PassError"));
            System.out.print(en.getString("Pass"));
            L.setPass(sc.nextLine().trim());
        }
        L.setCaptcha();
        System.out.println("Captcha: "+L.getCaptcha());
        System.out.print(en.getString("Captcha"));
        String resCaptcha = sc.nextLine().trim();
        while (!resCaptcha.equals(L.getCaptcha())) {
            System.err.println(en.getString("CaptchaError"));
            System.out.print(en.getString("Captcha"));
            resCaptcha = sc.nextLine().trim();
        }
    }

    @Override
    int select() {
        this.displayMenu();
        return Validation.CheckMinMax(1, 3);
    }

    void Run(){
        while (true) {
            int n = this.select();
            this.excute(n);
        }
    }

    public static void main(String[] args) {
        Controller ctrl = new Controller();
        ctrl.Run();
    }
}
