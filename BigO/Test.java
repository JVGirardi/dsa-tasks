import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //Log all pairs of array
        int[] boxes = {1,2,3,4,5};
        ArrayList<Integer[]> array = new ArrayList<>();

        for(int i= 0; i < boxes.length; i++) {
            for(int j= 0; j <boxes.length; j++) {
                array.add(new Integer[]{boxes[i], boxes[j]});
            }
        }

        for (Integer[] a : array) {
            System.out.println(Arrays.toString(a));
        }
    }
}
