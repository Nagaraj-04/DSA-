// public class LinearSearch {

//     public static int Search(int arr[], int key) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         int key = 30;

//         int result = Search(arr, key);

//         if (result != -1) {
//             System.out.println("Element found at index: " + result);
//         } else {
//             System.out.println("Element not found.");
//         }
//     }
// }


public class linearSearch{
    public static int search(int nums[], int key){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int nums[]={5,6,8,12,8};
        int key=12;
        int result=search(nums, key);
        if(result== -1){
            System.out.println("Key not found");
        }else{
             System.out.println("The key found at index:" + result);
        }
        
}
}

// class Solution {
//     public static int linearSearch(int nums[], int target) {
// 		//Your code goes here
//     for(int i=0;i<nums.length;i++){
//       if(nums[i]==target){
//           return i;
//       }
//     }
//     return -1;
//     }
//     public static void main(String[]args){
//       int nums[]={2,3,4,5,3};
//       int target=3;
//       System.out.println(linearSearch(nums, target));
//     }
// }