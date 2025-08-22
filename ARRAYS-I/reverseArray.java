public class reverseArray{
    public static void reverse(int nums[]){
        int low=0;
        int high=nums.length-1;
        while(low<high){
            //temp variable
            int temp=nums[high];
            nums[high]=nums[low];
            nums[low]=temp;

            low++;
            high--;
    }
}
public static void main(String[]args){
    int nums[]={10,9,8,7,6,5};
    reverse(nums);
    for(int i=0;i<nums.length;i++){
         System.out.print(nums[i]+" ");
    }
System.out.println();
}
}