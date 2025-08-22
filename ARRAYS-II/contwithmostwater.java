
//BRUTE FORCE APPROACH WITH O(N^2)
// import java.util.*;
// public class contwithmostwater{
//     public static int most(ArrayList<Integer> height){
//         int maxwater=0;
//         //loop
//         for(int i=0;i<height.size();i++){
//             for(int j=i+1;j<height.size();j++){
//                 int ht=Math.min(height.get(i), height.get(j));
//                 int width=j-i;
//                 int currentwater=ht*width;
//                 maxwater=Math.max(maxwater, currentwater);
//             }
//         }
//         return maxwater;

//     }
//     public static void main(String[]args){
//         ArrayList<Integer> height=new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);
        
//         System.out.println(most(height));
//     }
// }

//TWO POINTER APPROACH WITH O(N)
import java.util.*;
public class contwithmostwater{
public static int most(ArrayList<Integer> height){
    int maxwater=0;
    int n=height.size();
    int left=0;
    int right=n-1;

    while(left<right){
        int ht=Math.min(height.get(left),height.get(right));
        int width=right-left;
        int currentwater=ht*width;
        maxwater=Math.max(maxwater, currentwater);
     // Now decide which pointer to move:
    // Always move the pointer at the shorter line
    if(left<right){
        left++;
    }else{
        right--;
    }
    }
    return maxwater;
}
    public static void main(String[]args){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        System.out.println(most(height));
    }
}
