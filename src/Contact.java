import java.util.Scanner;

public class Contact {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 = scan.nextLine();
        str1 = str1.concat(str);
        System.out.println(str1);
    }
}
