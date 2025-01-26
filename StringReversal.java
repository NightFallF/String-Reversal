import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a word to Reverse: ");
            String word = scan.nextLine();
            int size = word.length();
            String output = "";
            System.out.printf("Given String is: %s", word);
            for (int x = size - 1; x >= 0; x--) {
                output = output + word.charAt(x);
            }
            System.out.printf("\nReversed Word: %s", output);
        }
    }
}