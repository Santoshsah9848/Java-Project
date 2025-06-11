import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;

        if (m < n) {
            for (int i = m; i <= n; i++) {
                sum += i * i;
            }
            System.out.println("Sum of squares: " + sum);
        } else if (m == n) {
            sum = m * m;
            System.out.println("Sum of squares: " + sum);
        } else {
            System.out.println("Invalid");
        }
    }
}
