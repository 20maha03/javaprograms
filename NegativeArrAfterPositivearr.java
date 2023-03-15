import java.util.Scanner;
import java.util.Arrays;
public class NegativeArrAfterPositivearr{
    public static void main(String args[]){
        int i,j;
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array elements:");
        for(i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sortNum(arr);
        System.out.println("new arrys:"+Arrays.toString(arr));
    }
    public static void sortNum(int[] arr){
        int pos=0;
        int neg=0;
        int max=Integer.MIN_VALUE,i,j;
        for(i=0;i<arr.length;i++){
            if(arr[i]<0){
                neg++;
            }
            else{
                pos++;
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        max++;
        if(neg==0 || pos==0){
            return;
        }
         i=0;
         j=1;
        while(true){
            while(i<=neg && arr[i]<0){
                i++;
            }
            while(j<arr.length && arr[j]>=0){
                j++;
            }
            if(i>neg || j>=arr.length)
               breaK;

            arr[i]+=max*(i+1);
            swapArr(arr,i,j);
        }
         i=4;
        while(i>=neg){
            int div=arr[i]/max;
            if(div==0){
                i--;
            }
            else{
                arr[i]%=max;
                swapArr(arr,i,neg+div-2);
            }
        }


    }
    private static void swapArr(int[] arr,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

}