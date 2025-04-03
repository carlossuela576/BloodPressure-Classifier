import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getCategory pt = new getCategory();

        try {
            while (true) { 
                System.out.println("BLOOD PRESSURE ANNALYZER");
                System.out.println("-------------------------");
                System.out.println("Please enter the given");
                System.out.print("Systolic: ");
                int usSys = sc.nextInt();
                System.out.print("Diastolic: ");
                int usDias = sc.nextInt();
                try {
                    pt.decisionCateg(usSys, usDias);
                    pt.classifyCateg();
                } 
                catch (NullPointerException e) {
                    System.out.println("Your systolic and diastolic didn't match \nreturning no value....");
                    System.out.println();
                }
                
            }
        } 
        catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Something went wrong");
            System.out.println("Please enter correct inputs");
        }
        
    }
}
