import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getCategory pt = new getCategory();

        while(true){
            try {
                System.out.println("BLOOD PRESSURE ANNALYZER");
                System.out.println("-------------------------");
                System.out.println("Please enter the given");
                System.out.print("Systolic: ");
                int usSys = sc.nextInt();
                sc.next();
                System.out.print("Diastolic: ");
                int usDias = sc.nextInt();
                sc.next();

                pt.decisionCateg(usSys, usDias);
                pt.classifyCateg();
            } 
            catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Something went wrong");
                System.out.println("Please enter correct inputs");
            }
        }
        
    }
}
