import java.util.Scanner;
public class RemoveDuplicateElements{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int arraySize=input.nextInt();
        System.out.print("enter array elements:");
        int[] arr=new int[arraySize];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int result[]=new int[arr.length];
        int k=0;
        for( int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count!=0){
               arr[i]=result[k++];
               System.out.println(result[k]);
                
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=result[k]){
               System.out.println(result[k]);
            }
        }

    }
}