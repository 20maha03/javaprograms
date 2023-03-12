import java.util.Scanner;
public class MinAndMaxElements{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter size");
        int size=input.nextInt();
        System.out.println("enter array element");
        int[] array=new int[size];
        for(int j=0;j<array.length;j++){
            array[j]=input.nextInt();
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        int min=array[0];
        int max=array[0];
        for(int k=0;k<array.length;k++){
            if(array[k]<min){
                min=array[k];
            }
            else if(array[k]>max){
                max=array[k];
            }
        }
        System.out.println("max is:"+max);
        System.out.println("min is:"+min);
    }
}