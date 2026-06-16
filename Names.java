import java.util.Scanner;

public class Names{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] names = {"Dave", "Hope", "Mercy", "Emma"};
        System.out.println(names[2]);
        System.out.println(names.length);
        // modify to iterate over the entire array
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // prompt a user to enter either an int or double / string 
        // and save to an array of a predefined length
        int[] numbers = new int[4];
        System.out.println("Enter " + numbers.length + "integer numbers");
        for (int i = 0; i < names.length; i++) {
            int userInput = input.nextInt();
        }

    }
}