import java.util.Scanner;
//test array contain specific value of 65,77
public class TestArrContainsSpecificValue{
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
        for(int j=0;j<arr.length;j++){
           if(arr[j]==65 || arr[j]==77){
               count++;
           }
            
        }
        if(count!=0){
             System.out.println("true");
        }
    }
}