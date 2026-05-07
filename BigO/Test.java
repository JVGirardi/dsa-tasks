import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] boxes = {1,2,3,4,5};
        int target = 5;

        for (int i = 0; i < boxes.length; i++) {
            for (int j = i + 1; j < boxes.length; j++) {
                if (boxes[i] + boxes[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }



    }
}
