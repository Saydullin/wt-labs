package saydullin.wt_labs.tasks.task9;

import java.util.ArrayList;

public class BasketBall {
    private ArrayList<Ball> ballsList;

    BasketBall() {
        this.ballsList = new ArrayList<>();
    }

    public int addBall(Ball ball) {
        ballsList.add(ball);
        return ballsList.size();
    }

    public void deleteBall(Ball ball) {
        ballsList.remove(ball);
    }

    public void deleteBall(int ball) {
        ballsList.remove(ball);
    }

    public int getQuantity() {
        return ballsList.size();
    }

    public ArrayList<Ball> getBallsList() {
        return new ArrayList<>(ballsList);
    }

}


