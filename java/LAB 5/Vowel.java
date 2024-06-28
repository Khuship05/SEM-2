import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int c = 0, a = 0, e = 0, i = 0, o = 0, u = 0;
        char ch;
        s = sc.nextLine();
        String s1 = s.toLowerCase();
        while (!s1.equals(quit))
        System.out.println("Enter a string \n Note: 'quit' will end program.");
           s=sc.nextLine();
           s1=s
        while (!s1.equals("quit")){ 
            
            for (int j = 0; j<(s1.length()); j++){
                ch = s1.charAt(j);
                switch(ch){
                    case 'a':
                    a++;
                    c++;
                    break;
                    case 'e':
                    e++;
                    c++;
                    break;
                    case 'i':
                    i++;
                    c++;
                    break;
                    case 'o':
                    o++;
                    c++;
                    break;
                    case 'u':
                    u++;
                    c++;
                    break;
                }
            }
        }
        System.out.println("Vowels: "+c);
        System.out.println("number of a: "+a);
        System.out.println("number of e: "+e);
        System.out.println("number of i: "+i);
        System.out.println("number of o: "+o);
        System.out.println("number of u: "+u);
        }
    }
