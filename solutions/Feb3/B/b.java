
import java.util.HashMap;
import java.util.Scanner;

public class Strings {
    static String transform(String a) {
        StringBuilder builder = new StringBuilder();
        HashMap<Character, Character> hm = new HashMap<>();
        int num = Character.getNumericValue('a');
        for(int i=0;i<a.length();++i) {
            if(hm.get(a.charAt(i)) == null) {
                hm.put(a.charAt(i), (char) num);
                ++num;
            }
            builder.append(hm.get(a.charAt(i)));
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long ret = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i=1;i<=N;++i) {
            String a = transform(scanner.next());
            int num = hashMap.get(a) == null ? 0 : hashMap.get(a);
            hashMap.put(a,num+1);
        }
        for(String a : hashMap.keySet()) {
            long num = hashMap.get(a);
            ret += (num) * (num-1) / 2;
        }
        System.out.println(ret);
    }
}