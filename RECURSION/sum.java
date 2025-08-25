public class sum{
    public static int sumn(int n){
        if(n==1){
            return n;
        }
        else{
            return n+sumn(n-1);
        }
    }
    public static void main(String[]args){
        int n=5;
        System.out.println(sumn(n));
    }
}