package loginbank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation extends Exception {
    static Scanner sc = new Scanner(System.in);
    String str;   
    private static final String ACCOUNT = "^\\d{10}$";

    public Validation(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Wrong input! Try again!";
    }

    static boolean CheckInput(String str) throws Validation {
        if(str == null || str.length() < 0)
            throw new Validation(str);
        str = str.trim();
        if(str.equals(""))
            throw new Validation(str);
        return true;
    }

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    static boolean checkAccount(String Account){
        return Account.matches(ACCOUNT);        
    }

    static boolean checkPass(String Pass){
        return Pass.length() >= 8 && Pass.length() <= 31 && Pattern.matches("[a-zA-Z0-9]+", Pass);
    }

    static int CheckMinMax(int Min, int Max){
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
                } catch (Validation | NumberFormatException ex) {
                    System.err.println("Please enter digit");
                }
            }
            if(n < Min || n > Max)
                System.err.println("Please enter digit from "+Min+" to "+Max);
            else break;
        }
        return n;
    }
}