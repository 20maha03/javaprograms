// Write a Java program to find maximum difference between two elements in a given array of integers such that smaller element appears before larger element.
import java.util.Scanner;
import java.util.Arrays;
public class ProductArray{
    public static void main(String args[]){
        int i,j;
        int result[];
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array elements:");
        for(i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("array is:"+Arrays.toString(arr));
       
        System.out.println("array is:"+diffArray(arr));

    }
    public static int diffArray(int[] arr){
        int diff=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                diff=Integer.max(diff,arr[j]-arr[i]);
            }
        }
        return diff;
    }
}