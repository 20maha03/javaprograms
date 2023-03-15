import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class ConvertArrayToArrList{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter string array size");
        int size=input.nextInt();
        System.out.println("array element");
        String[] arr1=new String[size];
        for(int i=0;i<arr1.length;i++){
           arr1[i]=input.next();
        }
        ArrayList<String> list=new ArrayList<String>(Arrays.asList(arr1));
        System.out.println(list);


    }

}