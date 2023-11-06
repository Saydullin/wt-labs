package saydullin.wt_labs.tasks.task9;

import java.awt.*;

public class Task9 {
    private final BasketBall basketBall;

    Task9(BasketBall basketBall) {
        this.basketBall = basketBall;
    }

    public int executeBallsQuantity() {
        return basketBall.getQuantity();
    }

    public int executeBlueBalls() {
        int counter = 0;

        for (Ball ball : basketBall.getBallsList()) {
            if (ball.color == Color.blue) {
                counter ++;
            }
        }

        return counter;
    }

}


