import java.util.Scanner;
public class TestSpecificValue{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            System.out.println("array is:"+arr[j]);
        }
        System.out.println("enter a value:");
        int x=input.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.print("yes");
            }
        }
          
        
        
    }
}