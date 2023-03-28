//write a java program that returns the missing letterr from an array of increasing letters(upper or lower).assume there will always be one letter missing in the array
import java.util.Scanner;
import java.util.Arrays;
public class MissingLetter{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        String[] arr=new String[size];
        System.out.println("enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.next();
        }
        System.out.println("array is:"+Arrays.toString(arr));
        String result=test(arr);
        System.out.print("missing letter is:"+result);
    }
    public static String test(String[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1].charAt(0)-arr[i].charAt(0)>1){
                String result=" "+(char)((int)arr[i].charAt(0)+1);
                return result;
            }
        }
        return " ";

    }

}