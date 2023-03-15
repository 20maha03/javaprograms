import java.util.Scanner;
import java.util.Arrays;
public class FirstZerosAndNextOnes{
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
        result=Seperate(arr,size);
        System.out.println("array is:"+Arrays.toString(result));
    }
    public static int[] Seperate(int arr[],int size){
        int count=0;
        for(int j=0;j<size;j++){
            if(arr[j]==0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            arr[i]=0;
        }
        for(int i=count;i<size;i++){
            arr[i]=1;
        }
        return arr;
    }
}