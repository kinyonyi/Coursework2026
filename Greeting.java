public class Greeting {
    // definition of our method
    public static String greet(String message){
        return message;
    }

    /*  modify the max method to use the ternary operator and return the
        the max of any two numbers passed to it.  
    */

    public static void main(String[] args) {
        // call the greet method and pass to it the actual parameter
        String response = greet("Hello Java");
        System.out.println(response);
    }
}
