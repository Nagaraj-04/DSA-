public class IsSorted {
    public static boolean sort(int arr[], int i) {
        if (i == arr.length - 1) { // Base case
            return true;
        }
        if (arr[i] > arr[i + 1]) { // Check current pair
            return false;
        }
        return sort(arr, i + 1); // Recursive call
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(sort(arr, 0)); // Start from index 0
    }
}
