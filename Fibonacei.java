import java.util.*;

public class Fibonacei{
    public static void main(String[] args){
        System.out.print("Enter the number of fibonancei series to be shown: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m=0, n=1, p=0;
        for(int i=0; i<a-1; i++){
            System.out.println(m);
            p = m+n;
            m=n;
            n=p;
        }
        sc.close();
    }
}
