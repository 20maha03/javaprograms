import java.util.Scanner;
public class SumEqualToValue{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("enter value");
        int testValue=input.nextInt();
        System.out.println("combination of four element");
        for(int j=0;j<arr.length-3;j++){
            for(int i=j+1;i<arr.length-2;i++){
                for(int k=i+1;k<arr.length;k++){
                    for(int m=k+1;m<arr.length;m++){
                        if(arr[j]+arr[j]+arr[k]+arr[m]==testValue){
                            System.out.print(" "+arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[m]);
                        }
                    }                }
            }

        }

    }
}