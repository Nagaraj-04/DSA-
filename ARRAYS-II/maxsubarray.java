//MAXSUBARRAY SUM USING BRUTE FORCE APPROACH
// public class maxsubarray{
// public static void array(int nums[]){
//     int currSum=0;
//     int maxSum=Integer.MIN_VALUE;
//     for(int i=0;i<nums.length;i++){
//         int start=i;
//         for(int j=i;j<nums.length;j++){
//             int end=j;
//             currSum=0;
//             for(int k=start;k<=end;k++){
//                 currSum+=nums[k];
//                // System.out.println(currSum);
//             }
//             if(maxSum<currSum){
//                 maxSum=currSum;
//             }
//         }
//     }
//     System.out.println("The maxsum is = " +maxSum);
// }
// public static void main(String[]args){
//     int nums[]={2,3,4,6,8,10};
//     array(nums);
// }
// }
//MAXSUBARRAY SUM USING PREFIX SUM APPROACH

// public class maxsubarray{
//     public static void msubarray(int numbers[]){
//     int maxSum=Integer.MIN_VALUE;
//     int currSum=0;
//     int prefix[]=new int[numbers.length];

//     prefix[0]=numbers[0];
//     for(int i=1;i<prefix.length;i++){
//         prefix[i]=prefix[i-1]+numbers[i];
//     }
//     for(int i=0;i<numbers.length;i++){
//         int start=i;
//         for(int j=i;j<numbers.length;j++){
//             int end=j;
//             currSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
//             if(maxSum<currSum){
//                 maxSum=currSum;
//             }
//         }
//     }
//     System.out.println("The maxsum is = " + maxSum);
//     }
//         public static void main(String[]args){
//         int numbers[]={1,-2,6,-1,3};
//         //msubarray(numbers);
//        msubarray(numbers);
//     }
// }

 //OPTIMIZED APPROACH USING KADANES ALGORITHM
    public class maxsubarray{
    public static int kadanes(int numbers[]){
        int ms=numbers[0];
        int cs=numbers[0];

        for(int i=1;i<numbers.length;i++){
            cs=Math.max(numbers[i], cs+numbers[i]);
            ms=Math.max(ms,cs);
        }
        return ms;
    }

       
    public static void main(String[]args){
        int numbers[]={2,4,6,8,10};
        //msubarray(numbers);
       System.out.println(kadanes(numbers));
    }
}