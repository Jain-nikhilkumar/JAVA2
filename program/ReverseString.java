public class ReverseString {
    public static String reverseWord(String str) {
        String[] words = str.split("\\s");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        return reversedString;
    }
    public static void main(String[] args) {
        String str = "Face Prep wants you to do great";
        System.out.println(reverseWord(str));
    }
}