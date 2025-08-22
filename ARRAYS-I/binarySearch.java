// public class binarySearch{
//     public static int search(int arr[], int key){
//         int start=0;
//         int end=arr.length-1;

//         while(start<=end){
//             int mid=(start+end)/2;
//             if(arr[mid]==key){
//                 return mid;
//             }
//             if(arr[mid]<key){
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }
//         }
//         return -1;

//     }
//     public static void main(String[]args){
//         int arr[]={5,6,7,8,176};
//         int key=176;

//         System.out.println("The key found at index:" + search(arr, key));
//     }
// }


public class binarySearch{
    public static int search(int nums[], int key){
        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==key){
                return mid;
        }
        if(nums[mid]<key){
           low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return -1;
}
public static void main(String[]args){
    int nums[]={10,20,30,40,89};
    int key=35;

    System.out.println("The key found at index:" + search(nums, key));
}
}
