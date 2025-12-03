import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int newLength = Math.max(0, N - K);

        if (newLength == 0) {
            System.out.println();
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < newLength; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
