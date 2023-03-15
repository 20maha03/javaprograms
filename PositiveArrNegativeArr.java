import java.util.Scanner;
import java.util.Arrays;
public class PositiveArrNegativeArr{
    public static void main(String args[]){
        int i,j;
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array elements:");
        for(i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int temp;
        for( i=0;i<arr.length;i++){
            j=i;
            while((j>0)&&(arr[j]>0)&&(arr[j-1]<0)){
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        System.out.println("array is:"+Arrays.toString(arr));
    }
}