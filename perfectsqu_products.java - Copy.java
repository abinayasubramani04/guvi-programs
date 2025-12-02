import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int c = n * m;
        double sqrt = Math.sqrt(c);   
        int root = (int) sqrt;        

        if (root * root == c) {      
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
