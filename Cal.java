
import java.util.Scanner;

public class Cal {
    
    public static void CheckNumber(Scanner scan){
       while(!scan.hasNextInt()){
   System.out.println("invalied input. Enter only a number");
   scan.next();
 } 
    }
public static void main(String[]args){
     Scanner scan=new Scanner(System.in);

    System.out.println("enter A value");                                                                                
    CheckNumber(scan);
  int A=scan.nextInt();
    System.out.println("enter B value");
    CheckNumber(scan);
  int B=scan.nextInt();

 System.out.println("Choose your option");
 System.out.println("1.Addition");
 System.out.println("2.Subtraction");
 System.out.println("3.Multiplication");
 System.out.println("4.Division");

 int user=scan.nextInt();
 switch (user) {
    case 1:
        System.out.println("Result:"+(A+B));
        break;
    case 2:
        System.out.println("Result:"+(A-B));
        break;
    case 3:
        System.out.println("Result:"+(A*B));
        break;
    case 4:
        if(B!=0){
        System.out.println("ERROR: Division by zero");
        }else{
           System.out.println("Result:"+(A/B));
        }
        break;    
    default:
        System.out.println("Enter only a number");
        break;
 }

}
}
