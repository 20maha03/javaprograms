//write a java program that checks an array is negative dominant or not.if the array is negative dominant return true otherwise false
import java.util.Scanner;
import java.util.Arrays;
public class NegativeDominant{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter First array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("array is:"+Arrays.toString(arr));
        boolean result=test[arr];
        System.out.print(result);
    }
    public static boolean test(int[] arr){    
        arr=Arrays.stream(arr).distinct().toArray();
        long countNeg=Arrays.stream(arr).filter(s->s<0).count();
        long countPos=Arrays.stream(arr).filter(s->s>0).count();
        return countNeg>countPos;
    }
}