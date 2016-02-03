import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String a,b,c;
        a = scanner.next();
        b = scanner.next();
        c = scanner.next();

        for(int i = 0; i < a.length();++i) {
            if(a.charAt(i) == b.charAt(i) || a.charAt(i) == c.charAt(i)) {
                System.out.print(a.charAt(i));
            } else {
                System.out.print(b.charAt(i));
            }
        }
    }
}