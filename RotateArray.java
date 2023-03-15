import java.util.Scanner;
import java.util.Arrays;
public class RotateArray{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int a=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
           
        }
        arr[0]=a;

        System.out.println(Arrays.toString(arr));       
    }
}