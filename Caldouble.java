
import java.util.InputMismatchException;
import java.util.Scanner;

public class Caldouble {
    
    public static double Addition(double A,double B) {return A+B;}
    public static double Subtraction(double A,double B) {return A-B;}
    public static double Multiplication(double A,double B) {return A*B;}
    public static double Division(double A,double B) {return A/B;}

    public static void main(String[] args) {
        try(Scanner scan=new Scanner(System.in)){
            System.out.println("----Calculator----");

        while (true) {
         printMenu();
         int user=readint(scan,"Hi, Choose what you want to do:");

         if(user==5){
            System.out.println("Thanks for calculating with us! Bye!");
            break;
         }
        
        double A=readint(scan, "Enter a value for A:");
        double B=readint(scan, "Enter a value for B:");

        try {
           double result = switch (user) {
                case 1->Addition(A, B);
                case 2->Subtraction(A, B);
                case 3->Multiplication(A, B);
                case 4->Division(A, B);  
                default->{
                    System.out.println("Invalid option.Try again");
                    yield Double.NaN;
            }
        };
             if(!Double.isNaN(result)){
                  System.out.printf("Result: %.6f%n%n", result);
                     } 
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error"+e.getMessage()+"\n");
        }
        }
    }
    }
    private static void printMenu()
    {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exist");

    }
    private static int readint(Scanner scan,String userinput){
        while (true) {
            System.out.println(userinput);
            try{
                return scan.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Enter a valid number");
                scan.nextLine();
            }
        }
    }
    private static int resdDouble(Scanner scan,String userinput){
        while (true) {
            System.out.println(userinput);
            try{
                return scan.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Enter a valid number");
                scan.nextLine();
            }
        }
        
    }
}
