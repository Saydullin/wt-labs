package saydullin.wt_labs.tasks.task4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void testTask4() {
        ArrayList<Integer> initArr = new ArrayList<>(Arrays.asList(1, 2, 4, 6));
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 13));
        Task4 task4 = new Task4(arr);
        assertEquals(task4.execute(), initArr);
    }

}


