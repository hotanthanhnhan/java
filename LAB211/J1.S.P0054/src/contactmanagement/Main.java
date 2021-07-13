package contactmanagement;

public class Main {
    public static void main(String[] args){
        Controller ctrl = new Controller();  
        int n = ctrl.setn();
        while (n != 4) {
            ctrl.excute(n);
            n = ctrl.setn();
        }
    }
}
