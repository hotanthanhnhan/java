
package managementcandidates;

import java.util.Scanner;

public class Management {
    Scanner sc = new Scanner(System.in);
    CandidatesList ls = new CandidatesList();
    int show(){
        System.out.println("*******************************");
        System.out.println("| CANDIDATE MANAGEMENT SYSTEM |");
        System.out.println("| 1 - Add candidates          |");
        System.out.println("| 2 - Searching               |");
        System.out.println("| 3 - Exit                    |");
        System.out.println("*******************************");
        System.out.print("Your choice: ");
        int choice = Integer.valueOf(sc.nextLine());
        while (choice != 1 && choice != 2 && choice != 3) {
            System.out.println("No invalid. Please choose again!");
            System.out.print("Your choice: ");
            choice = Integer.valueOf(sc.nextLine());
        }
        return choice;
    }
    void menu(){
        int choose = this.show();
        while(choose != 3){
            switch (choose) {
                case 1:{
                    while (true) {
                        System.out.print("Please choose(0 - Experience, 1 - Fresher, 2 - Internship): ");
                        int t = Integer.valueOf(sc.nextLine());                     
                        while (t != 0 && t != 1 && t != 2) {
                            System.out.println("No invalid. Please choose again!");
                            System.out.print("Please choose(0 - Experience, 1 - Fresher, 2 - Internship): ");
                            t = Integer.valueOf(sc.nextLine()); 
                        }
                        ls.addCandidates(t);
                        System.out.print("Continue?(Y/N): ");
                        char choice = sc.next().charAt(0);
                        sc.nextLine();
                        while (choice != 'y' && choice != 'Y' && choice != 'N' && choice != 'n') {
                            System.out.println("Wrong input! Try again!");
                            System.out.print("Continue?(Y/N): ");
                            choice = sc.next().charAt(0);
                            sc.nextLine();
                        }
                        if(choice != 'Y' && choice != 'y') break;
                    }
                    break;
                }
                case 2:{
                    if(ls.getList().isEmpty()) {
                        System.out.println("List is empty.");
                        break;
                    } else{
                        System.out.print("Enter name to find: ");
                        ls.searchName(sc.nextLine());
                        break;
                    }
                }      
                default: System.out.println("No invalid.");
            }
            choose = this.show();
        }
        System.out.println("Exit the program by user!");
    }
}
