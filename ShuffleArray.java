//Write a Java program to shuffle a given array of integers.
import java.util.Scanner;
import java.util.Arrays;
public class ShuffleArray{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("array is:"+Arrays.toString(arr));
      for(int i=0;i<arr.length-1;i++){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
      }
      System.out.println("new array is:"+Arrays.toString(arr));
    }
    }
