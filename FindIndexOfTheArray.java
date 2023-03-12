import java.util.Scanner;
public class FindIndexOfTheArray{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter size");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.print("enter array element");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("enter array element");
        int x=input.nextInt();
        for(int j=0;j<arr.length;j++){
            if(x==arr[j]){
                System.out.println(x+" the element at the position "+j);
            }
        }

    }
}