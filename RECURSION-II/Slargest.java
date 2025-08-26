public class Slargest{
public static int Secondlargest(int arr[]){
    int largest=-1;
    int slargest=-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            slargest=largest;
            largest=arr[i];
        }else if(arr[i]<largest && arr[i]>slargest){
            slargest=arr[i];
        }
    }
    if (slargest == Integer.MIN_VALUE) {
        return -1;
        } else {
        return slargest;
}

}
public static void main(String[]args){
    int arr[]={4,5,6,2,3,9};
    System.out.println(Secondlargest(arr));
}
}