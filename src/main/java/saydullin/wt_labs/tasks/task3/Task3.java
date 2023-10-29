package saydullin.wt_labs.tasks.task3;

public class Task3 {
    private final int a;
    private final int b;
    private final double h;

    Task3(int a, int b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double[][] execute() {
        double[][] res = new double[(int) Math.ceil((b - a + h) / h)][2];
        int i = 0;

        for (double x = a; x <= b; x += h, i++) {
            res[i][0] = x;
            res[i][1] = Math.tan(x);
        }

        return res;
    }

}
