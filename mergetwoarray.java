import java.util.*;
public class Main{
    public static void main(String[] args){
        int [] arr1 = {1,3,2,4,5};
        int [] arr2 = {6,7,8,9,10};
        
        int merged[] = new int[arr1.length + arr2.length];
        
        for(int i=0; i<arr1.length;i++)
        {
            merged[i] = arr1[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            merged[arr1.length+i] =  arr2[i];
        }
        System.out.println("Merged array: "+ Arrays.toString(merged));
        
        
    
    }
}
