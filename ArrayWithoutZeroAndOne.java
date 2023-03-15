import java.util.Scanner;

public class ArrayWithoutZeroAndOne{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter First array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 || arr[i]==-1)
            count++;
        
        if(count!=0){
            System.out.println("true");
        }
        }
    }
}    