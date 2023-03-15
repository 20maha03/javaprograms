import java.util.Scanner;
import java.util.Arrays;
public class MissingArrayElement{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter First array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int n=arr.length+1;
        int sum=(n*(n+1))/2;
        int arrSum=Arrays.stream(arr).sum();
        System.out.println(sum-arrSum);
    }
}