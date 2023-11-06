package saydullin.wt_labs.tasks.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task3Test {

    @Test
    void testTask3() {
        int a = 0;
        int b = 2;
        double h = 0.5;

        Task3 task = new Task3(a, b, h);
        double[][] result = task.execute();

        Assertions.assertEquals(5, result.length, "Expected 5 rows in the result array");

        Assertions.assertEquals(a, result[0][0], "Expected the first element of the first row to be equal to 'a'");
        Assertions.assertEquals(Math.tan(a), result[0][1], "Expected the second element of the first row to be equal to Math.tan(a)");

        Assertions.assertEquals(a + h, result[1][0], "Expected the first element of the second row to be equal to 'a + h'");
        Assertions.assertEquals(Math.tan(a + h), result[1][1], "Expected the second element of the second row to be equal to Math.tan(a + h)");

        Assertions.assertEquals(b, result[4][0], "Expected the first element of the last row to be equal to 'b'");
        Assertions.assertEquals(Math.tan(b), result[4][1], "Expected the second element of the last row to be equal to Math.tan(b)");
    }

}