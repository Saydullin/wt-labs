package saydullin.wt_labs.tasks.task1;

public class Task1 {
    private final int x;
    private final int y;

    Task1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double execute() {
        double denominator = 1 + Math.pow(Math.sin(x + y), 2);
        double numerator = 2 + Math.abs(x - (2 * x / (1 + x^2 * y^2)));

        return numerator / denominator;
    }

}
