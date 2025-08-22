public class pairs{
    public static void printPairs(int nums[]){
        int tp=0;
        for(int i=0;i<nums.length;i++){
            int cur=nums[i];//2,4,5,6,7,8,9
            for(int j=i+1;j<nums.length;j++){
                System.out.print("("+ cur +","+ nums[j] +")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total no of pairs = " +tp);
    }
    public static void main(String[]args){
        int nums[]={2,4,6,7,8,9};
        printPairs(nums);
    }
}