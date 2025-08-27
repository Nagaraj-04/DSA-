import java.util.Arrays;
public class insertionSort{
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int cur=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=cur;
        }
    }
    public static void main(String[]args){
        int arr[]={8,10,2,7,4};
        sort(arr);
       // Arrays.sort(arr,0,4);
        for(int i=0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
        }
         System.out.println();

        }
    }