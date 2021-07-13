package contactmanagement;

import java.util.Scanner;

public class Validation extends Exception {
    private final static Scanner sc = new Scanner(System.in);
    String str;
    private static final String PHONE1 = "^\\d{3}[-. ]\\d{3}[-. ]\\d{4}";
    private static final String PHONE2 = "^\\d{10}";
    private static final String PHONE3 = "^\\d{3}[-]\\d{3}[-]\\d{4}+ x+\\d{4}";
    private static final String PHONE4 = "^\\d{3}[-]\\d{3}[-]\\d{4}+ ext+\\d{4}";
    
    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static String checkInputPhone() {
        while (true) {
            String result = checkInputString();
            if (result.matches(PHONE1) || result.matches(PHONE2) || result.matches(PHONE3) || result.matches(PHONE4)) {
                return result;
            } else {
                System.out.println("Please input Phone flow");
                System.out.println("1234567890");
                System.out.println("123-456-7890");
                System.out.println("123-456-7890 x1234");
                System.out.println("123-456-7890 ext1234");
                System.out.println("123.456.7890");
                System.out.println("123 456 7890");
                System.out.print("Enter Phone: ");
            }
        }
    }
    
    public Validation(String str) {
        this.str = str;
    }
    
    static boolean CheckInput(String str) throws Validation{
        if(str == null || str.length() < 0)
            throw new Validation(str);
        str = str.trim();
        if(str.equals(""))
            throw new Validation(str);
        return true;
    }
    
    @Override
    public String toString() {
        return "Wrong input. Please enter again!";
    }
}