package saydullin.wt_labs.tasks.task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task8Test {

    @Test
    void testTask8() {
        double[] inputA = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] inputB = {1.5, 3.2, 4.8};
        Task8 task = new Task8(inputA, inputB);
        double[] result = task.execute();

        double[] expected = {1, 2, 2};

        Assertions.assertArrayEquals(expected, result);
    }

}