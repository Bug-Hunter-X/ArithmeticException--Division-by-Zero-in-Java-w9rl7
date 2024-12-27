public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int result = 0; 
        if (j != 0) { 
            result = i / j; 
        }
        else{
            System.out.println("Cannot divide by zero");
        }
        System.out.println(result);
    }
}