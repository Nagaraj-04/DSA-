public class Loccurence{
    public static int lastOccurence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int f=lastOccurence(arr, key, i+1);
        if(f==-1 && arr[i]==key){
            return i;
        }
        return f;
    }
    public static void main(String[]args){
        int arr[]={1,5,5,5,6,5};
        // int key=5;
        System.out.println(lastOccurence(arr, 5, 0));
}}