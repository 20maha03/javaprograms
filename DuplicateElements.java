import java.util.Scanner;
import java.util.Arrays;
public class DuplicateElements{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        int result[]=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                result[k++]=arr[i];
            }
        }
        result[k++]=arr[arr.length-1];
        for(int i=0;i<result.length;i++){
           System.out.print(); 
           System.out.print(result[i]);
        }
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=result[j]){
              System.out.print(arr[i]+" ");
            }
        }
    }
}