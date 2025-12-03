import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int val = sc.nextInt();
            if (val < N) {
                list.add(val);
            }
        }
        if (list.isEmpty()) {
            System.out.println("-1");
            return;
        }
        Collections.sort(list, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int x : list) {
            sb.append(x).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
