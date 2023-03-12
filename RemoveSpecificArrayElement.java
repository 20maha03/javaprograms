import java.util.Scanner;
public class RemoveSpecificArrayElement{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter size");
        int size=input.nextInt();
        System.out.println("enter array element");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int[] arr2=new int[size];
        int j=0;
        int x=input.nextInt();
        for(int i=0;i<arr.length;i++){
            int count=0;
            if(x!=arr[i]){
                arr2[j++]=arr[i];
            }
        }
        for( j=0;j<arr2.length;j++){
            System.out.println();
            System.out.println(arr2[j]);
        }
    }
}