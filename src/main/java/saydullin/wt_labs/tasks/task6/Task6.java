package saydullin.wt_labs.tasks.task6;

public class Task6 {
    private double[] els;

    Task6(double[] els) {
        this.els = els;
    }

    public double[][] execute() {
        double[][] res = new double[els.length][els.length];

        for (int i = 0; i < els.length; i++) {
            int y = i;
            for (int j = 0; j < els.length; j++) {
                res[i][j] = els[y];
                y = (y + 1) % els.length;
            }
        }

        return res;
    }

}


