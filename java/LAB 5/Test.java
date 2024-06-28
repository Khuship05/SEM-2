class Object { 
  
    static int noOfObjects = 0; 

    Object() {
        noOfObjects += 1; 
    } 
    Object(int n) { 
        noOfObjects += 1; 
    } 
    Object(String s) {
        noOfObjects += 1; 
    } 
    Object(Float f){
        noOfObjects += 1; 
    }
    }
    public class Test{
    public static void main(String args[]) 
    { 
        Object t1 = new Object(); 
        Object t2 = new Object(); 
        Object t3 = new Object(); 
        Object t4 = new Object();
        Object t5 = new Object();
        Object t6 = new Object();
        Object t7 = new Object();

        System.out.println(Object.noOfObjects); 
    } 
} 