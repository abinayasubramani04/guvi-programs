import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int d = 1;

        while (N % 2 == 0) {
            d *= 2;
            N /= 2;
        }

        System.out.println(d);
    }
}

