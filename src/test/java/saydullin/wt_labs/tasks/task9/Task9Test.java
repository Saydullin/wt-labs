package saydullin.wt_labs.tasks.task9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

class Task9Test {

    private Task9 task;
    private BasketBall basketBall;

    @BeforeEach
    public void setUp() {
        basketBall = new BasketBall();
        task = new Task9(basketBall);
    }

    @Test
    public void testExecuteBallsQuantity() {
        basketBall.addBall(new Ball(1, Color.RED));
        basketBall.addBall(new Ball(2, Color.BLUE));
        int len = basketBall.addBall(new Ball(3, Color.GREEN));

        int result = task.executeBallsQuantity();

        int expected = 3;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testExecuteBlueBalls() {
        basketBall.addBall(new Ball(1, Color.RED));
        basketBall.addBall(new Ball(2, Color.BLUE));
        basketBall.addBall(new Ball(3, Color.BLUE));
        basketBall.addBall(new Ball(4, Color.GREEN));

        int result = task.executeBlueBalls();

        int expected = 2;

        Assertions.assertEquals(expected, result);
    }

}