import java.util.Scanner;
public class SumOfAnArray{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        System.out.println("enter array elements");
        int[] arr=new int[size];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
            sum+=arr[i];
        }
        System.out.print("Sum is:"+sum);

    }
}