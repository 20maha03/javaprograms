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
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println("duplicate element removed array is:"+arr[i]);
            }
        }
    }
}