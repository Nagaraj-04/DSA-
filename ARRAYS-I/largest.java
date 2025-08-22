// public class getLargest{
//     public static int getLargest(int nums[]){
//         int largest=Integer.MIN_VALUE;
//         int smallest=Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){
//             if(largest<nums[i]){
//                 largest=nums[i];
//             }
//             if(smallest>nums[i]){
//                 smallest=nums[i];
//             }

//         }
//         System.out.println("The smallest number is:" + smallest);
//         return largest;
//     }
//     public static void main(String[]args){
//         int nums[]={2,5,7,9,10};
//         int result=getLargest(nums);
//         System.out.println("The largest number is:" + result);
//     }
// }

// public class largest{
//     public static int getLargest(int nums[]){
//         int largest=Integer.MIN_VALUE;
//         int smallest=Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){
//             if(largest<nums[i]){
//                 largest=nums[i];
//             }
//             if(smallest>nums[i]){
//                 smallest=nums[i];
//             }
//         }
//         System.out.println("The smallest number in the given array is:" + smallest);
//         return largest;
//     }
//     public static void main(String[]args){
//         int nums[]={45,67,125,789};
//         System.out.println("The largest number in the given array is:" + getLargest(nums));
//     }
// }

public class largest {
    public static int largestElement(int[] nums) {
        int largest=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(largest<nums[i]){
            largest=nums[i];
        }
    }
    return largest;
}
public static void main(String[]args){
    int nums[]={3,3,6,1};
    System.out.println(largestElement(nums));
}
}


