package saydullin.wt_labs.tasks.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void testTask2() {
        Task2 task2 = new Task2(5, -2);

        assertEquals(task2.execute(), true);
    }

}