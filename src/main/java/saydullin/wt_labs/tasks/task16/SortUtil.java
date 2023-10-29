package saydullin.wt_labs.tasks.task16;

import java.util.ArrayList;
import java.util.Comparator;

public class SortUtil {

    public static ArrayList<Book> execute(ArrayList<Book> array, Comparator<Book> comparator) {
        int h = 1;
        int length = array.size();

        while (h < length / 3) {
            h = h * 3 + 1;
        }

        while (h >= 1) {
            for (int i = h; i < length; i++) {
                int j = i;
                while (j >= h && comparator.compare(array.get(j), array.get(j - h)) < 0) {
                    swap(array, j, j - h);
                    j = j - h;
                }
            }
            h = h / 3;
        }

        return array;
    }

    private static void swap(ArrayList<Book> array, int i, int j) {
        Book temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

}
