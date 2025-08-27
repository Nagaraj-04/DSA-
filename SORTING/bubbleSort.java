// public class bubbleSort{
//     public static void sort(int arr[]){
//         for(int turn=0;turn<arr.length-1;turn++){
//             for(int j=0;j<arr.length-1-turn;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }


//     public static void main(String[]args){
//         int arr[]={1,2,3,4,5,6};
//         sort(arr);

//         //printing the sorted array manually
//          for(int i=0;i<arr.length;i++){
//              System.out.print(arr[i]+" ");
//         }
//          System.out.println();

//     }
// }

public class bubbleSort{
public static void sort(int arr[]){
    int n=arr.length;
for(int i=0;i<n-1;i++){
    int swaps=0;
    for(int j=0;j<n-1-i;j++){
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            swaps++;
        }
    }
}
}
public static void main(String[]args){
    int arr[]={1,2,3,4,5,6,7};
   //printing the array
   sort(arr);
      for(int i=0;i<=arr.length-1;i++){
    System.out.print(arr[i]+ " ");
   }
}
}