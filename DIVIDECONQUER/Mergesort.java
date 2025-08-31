public class Mergesort{
    public static void mergeSort(int arr[], int si, int ei){
        //basecase
        if(si>=ei){
            return;
        }
        //finding mid
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid); //left part
        mergeSort(arr, mid+1, ei); //right part
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si;     //Iteration for left part
        int j=mid+1;     //Iteration for right part
        int k=0;      //Iteration for temporary array

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        //Left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //Right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp arr to original array
        for (int a = 0, b = si; a < temp.length; a++, b++) {
            arr[b] = temp[a];
        }
    }
    public static void main(String[]args){
        int arr[]={45,23,67,89,28,45};
        mergeSort(arr, 0, arr.length - 1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
