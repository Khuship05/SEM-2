
import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.print("enter number");
       int n = sc.nextInt();

       for (int i = 2; i<= Math.sqrt(n); i++){
        if (n%i == 0){
            System.out.println("Number is NON-PRIME");
        }
        else{
            System.out.println("Number is PRIME");
        }
       }
    }
}