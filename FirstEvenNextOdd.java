import java.util.Scanner;
import java.util.Arrays;
public class FirstEvenNextOdd{
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
        result=Seperate(arr);
        System.out.println("array is:"+Arrays.toString(result));
    }
    public static int[] Seperate(int arr[]){
        int left=0,right=arr.length-1;
        while(left<right){
            while(arr[left]%2==0 && left<right){
                left++;
            }
            while(arr[right]%2==1 && left<right){
                right--;
            }
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        return arr;
    }
}