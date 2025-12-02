import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        if (N < 2) {
            System.out.println(-1);
            return;
        }
        long first = Long.MAX_VALUE;
        long second = Long.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            long num = sc.nextLong();

            if (num < first) {
                second = first;
                first = num;
            } else if (num > first && num < second) {
                second = num;
            }
        }
        if (second == Long.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(second);
        }
    }
}
