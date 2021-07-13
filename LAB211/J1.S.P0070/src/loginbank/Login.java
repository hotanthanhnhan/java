package loginbank;

import java.util.Random;

public class Login {
    private String Account;
    private String Pass;
    private char[] Captcha = new char[5];

    public String getAccount() {
        return Account;
    }

    public void setAccount(String Account) {
        this.Account = Account;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getCaptcha() {
        return new String(Captcha);
    }

    public void setCaptcha() {
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            this.Captcha[i] = (char) ((char) rd.nextInt(75)+48);
            while ((this.Captcha[i] > 57 && this.Captcha[i] < 65) || (this.Captcha[i] > 90 && this.Captcha[i] < 97)) {
                this.Captcha[i] = (char) ((char) rd.nextInt(75)+48);
            }
        }
    }

    public Login(String Account, String Pass) {
        this.Account = Account;
        this.Pass = Pass;
    }

    public Login() {
    }
    
}
