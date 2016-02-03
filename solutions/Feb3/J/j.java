import java.util.Scanner;

public class j {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ret = 0;
        int max = 0;
        for(int i=1;i<=N;++i) {
            int x,y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            if(x > max) {
                max = x;
                ret = Math.max(y,ret);
            }
        }
        System.out.println(ret);
    }
}