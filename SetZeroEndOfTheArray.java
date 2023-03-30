import java.util.Scanner;
import java.util.Arrays;
public class SetZeroEndOfTheArray{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter First array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("array is:"+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 && arr[arr.length-1]!=0){
              int temp=arr[arr.length-1];
              arr[arr.length-1]=arr[i];
              arr[i]=temp;
            }
            else
            System.out.println(" ");
        }
        System.out.println("array is:"+Arrays.toString(arr));
        
    }
}