package saydullin.wt_labs.tasks.task7;

public class Task7 {
    private double[] array;

    public Task7(double[] array) {
        this.array = array;
    }

    public double[] execute() {
        int length = array.length;
        int gap = length / 2;

        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                double temp = array[i];
                int j = i;

                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = temp;
            }

            gap /= 2;
        }

        return array;
    }

}
