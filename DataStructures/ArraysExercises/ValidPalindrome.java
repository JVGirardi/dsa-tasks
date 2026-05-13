package ArraysExercises;

public class ValidPalindrome {
    // A phrase is a palindrome if, after converting all uppercase letters into lowercase
    // letters and removing all non-alphanumeric characters, it reads the same forward
    // and backward. Alphanumeric characters include letters and numbers.
    // Given a string s, return true if it is a palindrome, or false otherwise.

//    Input: s = "A man, a plan, a canal: Panama"
//    Output: true
//    Explanation: "amanaplanacanalpanama" is a palindrome.

    static void main() {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String string) {
        if (string == null) return false;
        string = string.replaceAll("[,;:!./\\s]", "").toUpperCase();
        if (string.length() < 2) return true;
        int leftIndex = 0;
        int rightIndex = string.length() -1;
        while (leftIndex < rightIndex) {
            if (string.charAt(leftIndex) != string.charAt(rightIndex)) return false;
            leftIndex++;
            rightIndex--;
        }
        return true;
    }

    private static boolean isPalindromeBetterImplementation(String string) {
        if (string == null) return false;
        if (string.length() < 2 ) return true;
        int leftIndex = 0;
        int rightIndex = string.length() - 1;

        while (leftIndex < rightIndex) {
            char leftLetter = string.charAt(leftIndex);
            char rightLetter = string.charAt(rightIndex);

            if (!Character.isLetterOrDigit(leftLetter)) {
                leftIndex++;
            } else if (!Character.isLetterOrDigit(rightLetter)) {
                rightIndex--;
            } else {
                if (Character.toLowerCase(leftLetter) != Character.toLowerCase(rightLetter)) {
                    return false;
                }
                leftIndex++;
                rightIndex--;
            }
        }
        return true;
    }

}
