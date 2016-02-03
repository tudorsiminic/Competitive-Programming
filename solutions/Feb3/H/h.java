import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String a,b;
        a = scanner.next();
        b = scanner.next();
        int ret = 0;
        boolean currentXor = false;
        for(int i = 0; i < a.length();++i) {
            if(a.charAt(i) != b.charAt(i)) {
                if(!currentXor) {
                    ret++;
                    currentXor = true;
                }
            } else {
                currentXor = false;
            }
        }
        System.out.println(ret);
    }
}