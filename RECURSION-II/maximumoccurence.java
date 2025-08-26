import java.util.*;
public class maximumoccurence{
    public static int index(int a[]){
        //base case
        // if(arr.length==0){
        //     return;
        // }
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]==key){
        //         System.out.println(i+"");
        //     }

        // }
        // Arrays.sort(a);
// int max, res, count;
// max = 1;
// res = a[0];
// count = 1; // FIX: start with 1, not 0

// for (int i = 1; i < a.length; i++) {
//     if (a[i] == a[i - 1]) {
//         count = count + 1;
//     } else {
//         count = 1;
//     }
//     if (count > max || (count == max && a[i] > res)) {
//         max = count;
//         res = a[i];
//     }
// }
// return res;


        int max,res,count;
        max=Integer.MIN_VALUE;
        Arrays.sort(a);
        res=a[0];count=0;
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1]){
                count=count+1;
            }
            else{
                count=1;
            }
            if(count>max || (count==max && a[i]>res))
            {
                max=count;
                res=a[i];
            }
        }
        return res;
    }
    public static void main(String[]args)
    {
        int[] ar={4,3,2,4,3,4,5,4};
        
        int k=8;
        System.out.println(index(ar));

    }
}