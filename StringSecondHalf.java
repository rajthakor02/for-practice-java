import java.util.Scanner;

public class StringSecondHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();

        System.out.println("The string is " + str.length() + " characters long.");

        System.out.println("The second half of the string is: ");
        // Start from the middle of the string and loop through to the end
        for (int i = str.length() / 2; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}
