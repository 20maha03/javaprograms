import java.util.Scanner;
public class AverageArrayElements{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter size");
        int size=input.nextInt();
        int[] arr=new int[size];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
            sum+=arr[i];
        }
        int avg=sum/size;
        System.out.print("average is:"+avg);
    }
}