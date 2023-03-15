import java.util.Scanner;
public class SetZeroEndOfTheArray{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter First array elements:");
        int i=0;
        for( i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int l;
        System.out.println("array is");
        for(int i=0,l=arr.length;i<l;){
            if(arr[i]==0){
             i++;
            }
            else{
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
                i++;
            }
        }
        
        
        while( i<arr.length)
           arr[i++]=0;
        System.out.print("after changes");
        for( i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        
        
    }
}