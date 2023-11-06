package saydullin.wt_labs.tasks.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Task6Test {

    @Test
    void testTask6() {
        double[] input = {1.0, 2.0, 3.0};
        Task6 task = new Task6(input);
        double[][] result = task.execute();

        double[][] expected = {
                {1.0, 2.0, 3.0},
                {2.0, 3.0, 1.0},
                {3.0, 1.0, 2.0}
        };
        Assertions.assertTrue(Arrays.deepEquals(expected, result));
    }

}