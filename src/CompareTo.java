import java.util.Scanner;

public class CompareTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        System.out.println(str.compareTo(str1) + " " + str.compareTo(str2));
    }
}
