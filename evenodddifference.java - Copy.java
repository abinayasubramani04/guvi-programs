import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int res = n - m;
        if(res % 2 == 0)
        {
            System.out.println("even");
        }
      else{
           System.out.println("odd");
      }
    }
}