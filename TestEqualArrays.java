import java.util.Scanner;
public class TestEqualArrays{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter First array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int[] num=new int[size];
        System.out.println("enter Second Array");
        for(int j=0;j<num.length;j++){
            num[j]=input.nextInt();
        }
        boolean equalOrNot=true;
        if(arr.length==num.length){
            for(int k=0;k<num.length;k++){
                if(arr[k]!=num[k]){
                    equalOrNot=false;
                }
            }

        }
        else{
            equalOrNot=false;

        }
        if(equalOrNot){
            System.out.println("two arrays are equal");

        }
        else{
            System.out.println("two arrays are not equal");

            
        }
           

    }
}