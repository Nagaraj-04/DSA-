
//TIME COMPLEXITY USING STRING= O(n^2)
// public class compressString{
//     public static String compress(String str){
//         String newStr="";
//         for(int i=0;i<str.length();i++){
//             Integer count=1;
//             while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             newStr+=str.charAt(i);
        
//         if(count>1){
//             newStr+=count.toString();
//         }
//         }
//         return newStr;
//     }
//     public static void main(String[]args){
//         String str="aabbccdd";
//         System.out.println(compress(str));
//     }
// }


//USING SPRINGBUILDER-Time complexity= O(n)

public class compressString {
    public static String compress(String str) {
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // Count the number of repeating characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr.append(str.charAt(i)); // Append the character

            if (count > 1) {
                newStr.append(count); // Append the count if more than 1
            }
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "aabbccdd";
        System.out.println(compress(str));  // Output: a2b2c2d2
    }
}
