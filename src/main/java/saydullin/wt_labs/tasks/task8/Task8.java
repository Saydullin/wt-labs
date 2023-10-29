package saydullin.wt_labs.tasks.task8;

public class Task8 {
    private double[] a;
    private double[] b;

    Task8(double[] a, double[] b) {
        this.a = a;
        this.b = b;
    }

    public double[] execute() {
        double[] res = new double[b.length];

        for (int i = 0; i < b.length; i++) {
            res[i] = customBinarySearch(a, 0, b.length - 1, b[i]);
        }

        return res;
    }

    private double customBinarySearch(double[] array, int left, int right, double target) {
        int mid = -1;

        if (target <= array[left])
            return left;
        if (target >= array[right])
            return right;

        while (left <= right) {
            mid = (left + right) / 2;

            if (target >= array[mid] && target < array[mid + 1])
                return mid + 1;

            if (target < array[mid])
                right = mid - 1;

            if (target > array[mid])
                left = mid + 1;
        }

        return mid;
    }

}
