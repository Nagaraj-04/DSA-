public class selectionSort{

    public static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[minPos]> arr[j]){
                    minPos=j;
                }
            }
        int temp=arr[minPos];
       arr[minPos]=arr[i];
        arr[i]=temp;
    }
    }
    public static void main(String[]args){
        int arr[]={9,5,2,1};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
    }