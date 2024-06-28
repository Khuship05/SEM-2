import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String newstr="";
        for( int i=str.length()-1;i>=0;i--){
            newstr=newstr + str.charAt(i);
        }
        if(str.equals(newstr)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }

    }
    
}
