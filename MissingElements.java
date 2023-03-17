//write a java program for missing array element 
import java.util.Scanner;
import java.util.Arrays;
public class MissingElements{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("array is:"+Arrays.toString(arr));
        
        int n=arr.length+1;
        int sum=(n*(n+1))/2;
        for(int i=0;i<arr.length;i++){
            sum=sum-arr[i];
        }
        System.out.println("missing array element:"+sum);

    }
}