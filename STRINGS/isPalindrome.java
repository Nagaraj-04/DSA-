public class isPalindrome{
    public static boolean pal(String word){
        word=word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left=0;
        int right=word.length()-1;
        while(left<right){
            if(word.charAt(left)!=word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[]args){
        String word="A man, a plan, a canal: Panama";
        System.out.println(pal(word));
    }
}