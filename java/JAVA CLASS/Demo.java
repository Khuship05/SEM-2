public class Demo{
    public static void main(String[] args){
        String str="darshancollege rajkot,gujarat";
        int index=str.indexOf('a');
        System.out.println(index);
        while(index!=-1){
            System.out.println(index);
            index=str.indexOf('a',index+1);
        }
         
    }
}

