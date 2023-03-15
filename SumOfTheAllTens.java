import java.util.Scanner;//add all the 10's array element its equal to 30 .
public class SumOfTheAllTens{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter First array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int sum=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==10){
                sum+=arr[j];

            }
        }
        if(sum==30){
            System.out.println("true");
        }
    }
} 