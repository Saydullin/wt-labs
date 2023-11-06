package saydullin.wt_labs.tasks.task7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task7Test {

    @Test
    public void testTask7() {
        double[] input = {3.5, 2.0, 1.0, 4.5, 2.5};
        Task7 task = new Task7(input);
        double[] result = task.execute();

        double[] expected = {1.0, 2.0, 2.5, 3.5, 4.5};

        Assertions.assertArrayEquals(expected, result);
    }

}