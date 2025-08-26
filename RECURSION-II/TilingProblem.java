public class TilingProblem{
    public static int tiling(int n){
        if(n==0||n==1){
            return 1;
        }
       //vertical placing
       int fnm1=tiling(n-1);

       //horizontal choice
       int fnm2=tiling(n-2);

       int total=fnm1+fnm2;
       return total;
    }
    public static void main(String[]args){
        System.out.println(tiling(4));
    }
}