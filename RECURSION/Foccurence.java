public class Foccurence{
    public static int foccur(int arr[], int key, int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return foccur(arr, key, i+1);
    }
     public static void main(String[]args){
        int arr[]={1,2,3,5,8,5,9,10};
        int key=5;
        System.out.println(foccur(arr, key, 0));
    }
}