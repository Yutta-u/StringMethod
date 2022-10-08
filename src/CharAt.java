import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char a = str.charAt(scan.nextByte());
        System.out.println(a);
    }
}
