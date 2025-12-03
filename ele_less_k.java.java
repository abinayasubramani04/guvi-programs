import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            if (value < K) {
                result.add(value);
            }
        }
        if (result.isEmpty()) {
            System.out.println("-1");
            return;
        }
        Collections.sort(result);
        StringBuilder sb = new StringBuilder();
        for (int x : result) {
            sb.append(x).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
