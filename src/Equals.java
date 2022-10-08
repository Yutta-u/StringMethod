import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 = scan.nextLine();
        if (str.equalsIgnoreCase(str1)) {
            System.out.println(str);
        } else {
            System.out.println("-");
        }
    }
}
