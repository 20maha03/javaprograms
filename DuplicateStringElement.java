import java.util.Scanner;
public class DuplicateStringElement{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter size:");
        int size=input.nextInt();
        String[] array=new String[size];
        System.out.println("enter array element");
        for(int i=0;i<array.length;i++){
            array[i]=input.next();
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        Arrays.sort(array);
        String result=new String[array.length];
        int k=0;
        for(int i=0;i<array.length-1;i++){
            if(array[i]!=array[i+1]){
            result[k++]=array[i];
            }
        }
        result[k++]=array[array.length-1];
        for(int j=0;j<result.length;j++){
            System.out.println(result[j]+" ");
        }


    }
}