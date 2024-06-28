import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double sub1=sc.nextDouble(); 
        double sub2=sc.nextDouble(); 
        double sub3=sc.nextDouble(); 
        double sub4=sc.nextDouble(); 
        double sub5=sc.nextDouble();
        double tot=sc.nextDouble();
        double pr=((sub1+sub2+sub3+sub4+sub5)/tot)*100;
        if(pr>=60){
            System.out.println("First Division");
        }
        else if(pr<=59 && pr>=50){
            System.out.println("Second Division");
        } 
        else if(pr<=49 && pr>=40){
            System.out.println("Third Division");
        } 
        else{
            System.out.println("Fail");
        } 
    }
}