import java.util.Scanner;

public class ToUpperLowerCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        int a = str1.charAt(0);
        char c = (char) a;
        System.out.println(str1.toLowerCase() + " " + str1.toUpperCase());
    }
}
