import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int index = str.indexOf(scan.nextLine());
        System.out.println("Index of word " + index);
    }
}
