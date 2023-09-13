package saydullin.wt_labs.tasks.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void task1Check() {
        Task1 task1 = new Task1(5, 7);

        assertEquals(task1.execute(), 4.658708828828142);
    }

}