//optimized approach for solving the palindrome
public class pal{
    public static boolean sac(String str){
        int n=str.length();
       for(int i=0;i<n/2;i++){
    
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        String s="kanaka";
        System.out.println(sac(s));
    }
}