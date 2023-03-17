//Write a Java program to find the length of the longest consecutive elements sequence from a given unsorted array of integers.
//Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
//import java.util.Scanner;
import java.util.Arrays;
public class ConsecutiveArray{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter array size");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("array elements are:"+Arrays.toString(arr));
        
    }
}