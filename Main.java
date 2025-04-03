import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    int usSys;
    int usDias;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                promptsInputs();
            } 
            catch (InputMismatchException e) {
                System.out.println("Something went wrong");
                System.out.println("Please enter correct inputs");
                System.out.println(e);
                System.out.println();
            }
        }
        
    }
    static void promptsInputs(){
        Scanner sc = new Scanner(System.in);

        System.out.println("BLOOD PRESSURE ANNALYZER");
        System.out.println("-------------------------");
        System.out.println("Please enter the given");
        System.out.print("Systolic: ");
        int usSys = sc.nextInt();
        System.out.print("Diastolic: ");
        int usDias = sc.nextInt();
    }
}
