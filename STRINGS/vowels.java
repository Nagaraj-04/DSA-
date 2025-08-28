public class vowels{
    public static void nac(String word){
        int count=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                System.out.println(ch);
                count++;
            }
        }
         System.out.println("Vowel count: " + count);
    }
    public static void main(String[]args){
        String word="education";
        nac(word);
    }
}