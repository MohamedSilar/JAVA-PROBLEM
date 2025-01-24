package basicprob;
import java.util.Scanner;

public class countletters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the letters: ");
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(input.charAt(i - 1)).append(count); 
                count = 1; 
            }
        }
        result.append(input.charAt(input.length() - 1)).append(count);
        System.out.println(result.toString());
    }
}
