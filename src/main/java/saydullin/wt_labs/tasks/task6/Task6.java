package saydullin.wt_labs.tasks.task6;

public class Task6 {
    private double[] els;

    Task6(double[] els) {
        this.els = els;
    }

    public double[][] execute() {
        double[][] res = new double[els.length][els.length];
        int y = 0;

        for (int i = 0; i < els.length; i++) {
            for (int j = i; j < els.length; j++) {
                res[i][y] = els[j];
                y++;
            }
            for (int k = 0; k < i; k++) {
                res[i][y] = els[k];
                y++;
            }
        }

        return res;
    }

}


