package ArraysExercises;

public class ReversingString {
    static void main() {
        String string = "Hi My name is Andrei";
        System.out.println(reverseString(string));
        StringBuilder stringReversed = new StringBuilder(string).reverse();
        System.out.println(stringReversed);
    }
    //create a function that reverses a string
    //"Hi My name is Andrei" should be:
    //"ierdnA si eman yM iH"

    public static String reverseString(String string) {
        if (string == null || string.isEmpty() || string.length() == 1) return " ";

        char[] stringParsedToChar = string.toCharArray();
        int firstIndex = 0;
        int lastIndex = stringParsedToChar.length - 1;

        while (firstIndex < lastIndex) {
            switchLetters(stringParsedToChar, firstIndex, lastIndex);
            firstIndex++;
            lastIndex--;
        }
        return new String(stringParsedToChar);
    }

    private static void switchLetters(char[] charArray, int first, int last) {
        char temp = charArray[first];
        charArray[first] = charArray[last];
        charArray[last] = temp;
    }

    public static String reverseString2(String string) {
        if (string == null || string.isEmpty() || string.length() == 1) return "Vazio";

        String[] stringArray = string.split("");
        int leftIndex = 0;
        int rightIndex = stringArray.length-1;

        while (leftIndex < rightIndex) {
            String letraTemp = stringArray[leftIndex];
            stringArray[leftIndex] = stringArray[rightIndex];
            stringArray[rightIndex] = letraTemp;
            leftIndex++;
            rightIndex--;
        }
        return String.join("",stringArray);
    }
}
