package saydullin.wt_labs.tasks.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task5Test {

    @Test
    public void testTask5() {
        int[] input1 = {1, 2, 3, 4, 5};
        Task5 task1 = new Task5(input1);
        int result1 = task1.execute();
        Assertions.assertEquals(0, result1);

        int[] input2 = {5, 4, 3, 2, 1};
        Task5 task2 = new Task5(input2);
        int result2 = task2.execute();
        Assertions.assertEquals(4, result2);

        int[] input3 = {2, 6, 1, 9, 4, 3, 7};
        Task5 task3 = new Task5(input3);
        int result3 = task3.execute();
        Assertions.assertEquals(4, result3);

        int[] input4 = {1, 2, 3, 2, 1};
        Task5 task4 = new Task5(input4);
        int result4 = task4.execute();
        Assertions.assertEquals(2, result4);
    }

}