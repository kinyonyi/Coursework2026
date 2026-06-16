import java.util.Random;
import java.util.Scanner;

public class PracticeAddition {
    public static void main(String[] args) {
        // generating the two random numbers
        Random rand = new Random(); 
        int num1 = rand.nextInt(0, 10);
        int num2 = rand.nextInt(0, 10);
        int total = num1 + num2;
        // Create the input object 
        Scanner input = new Scanner(System.in);
        System.out.print(num1 + " + " + num2 + " = ? ");
        int user_input = input.nextInt();
        String message = (total == user_input) ? "You Passed" : "You Failed";
        System.out.println(message);
        input.close();
    }
}

