//write a java program to sort a given array
import java.util.Scanner;
import java.util.Arrays;
public class SortingArray{
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
            for( int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("array is:"+Arrays.toString(arr));
      

    }
}