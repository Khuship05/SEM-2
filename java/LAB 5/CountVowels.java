import java.util.Scanner;

class Vowel{
	Scanner sc = new Scanner(System.in);
	String str1 = "quit";
	int count;
	int i=0;
    int c=0;
	public void countVowels(){
		System.out.println("Just enter quit if you want to end the program....");
		while(i>=0){
	    System.out.print("Enter sentence no. " + (i+1) + " :- ");		
		String str=sc.nextLine();
		if(str.equals(str1)){
			break;
		}
		else{
			for (int j=0;j<str.length();j++) {
			if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'){
				count++;
			}
            else{
                c++;
            }
		   }
		}
		i++;
	  }
	System.out.println("Total Vowels used in all sentences are = "+count);
    System.out.println("Total consonants used in all sentences are = "+c);
   }
}


public class CountVowels{
	public static void main(String[] args) {
		Vowel vc = new Vowel();
        vc.countVowels();
	}
}