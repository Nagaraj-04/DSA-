// public class trappedRainWater{

//     public static int trw(int height[]){

//         int n=height.length;
//         //calculate left max boundary- array
//         int leftMax[]=new int[n];
//         leftMax[0]=height[0];
//         for(int i=1;i<n;i++){
//             leftMax[i]=Math.max(height[i], leftMax[i-1]);

//         }
//         //calculate right max oundary- array
//         int rightMax[]=new int[n];
//         rightMax[n-1]=height[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightMax[i]=Math.max(height[i], rightMax[i+1]);
//         } 
//         int trappedWater=0;
//         //loop
//         for(int i=0;i<n;i++){
//             //waterLevel = min(leftmax bound, rightamxbound)
        
//            int waterLevel=Math.min(leftMax[i], rightMax[i]);

//             //trapped water = waterLevel - height[i]
//             trappedWater +=waterLevel-height[i] ;  

//         }
//         return trappedWater;
//     }
//     public static void main(String[]args){
//         int height[]={4,2,0,6,3,2,5};
//         System.out.println(trw(height));
//     }
//     }

public class trappeRaindWater{
    public static int trap(int height[]){ 
        int n=height.length;
        //left max sub array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        //right max sub array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater=0;
        //loop
        for(int i=0;i<n;i++){
           int waterLevel=Math.min(leftMax[i], rightMax[i]);
            //formula
            trappedWater+=(waterLevel-height[i]);
        }
        return trappedWater;
    }
public static void main(String[]args){
    int height[]={5,6,2,8,1,5};
    System.out.println(trap(height));
}
}