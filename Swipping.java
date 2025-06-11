import java.util.*;
public class Swap {
    public static void main(String[] args){
        System.out.println("Enter the numbers to swap: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a & b: " + a + " & " + b);
        
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a & b: " + a + " & " + b);
        
        sc.close();
    }
}
