package Arrays;

public class LongestWord {
//    Have the function LongestWord(sen) take the sen parameter being passed and
//    return the longest word in the string. If there are two or more words that
//    are the same length, return the first word from the string with that length.
//    Ignore punctuation and assume sen will not be empty. Words may also contain numbers,for
//    example "Hello world123 567"
static void main() {
        String string = "I love dogs";
        System.out.println(LongestWord.longestWord(string));
}

    public static String longestWord(String string) {
        String stringWithoutPunctuation = string.replaceAll("[!.&]", "");

        String[] words = stringWithoutPunctuation.split(" ");
        String bigger = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > bigger.length()) {
                bigger = words[i];
            }
        }
        return bigger;
    }

}


