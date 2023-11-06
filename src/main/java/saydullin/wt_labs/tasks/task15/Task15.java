package saydullin.wt_labs.tasks.task15;

public class Task15 implements Comparable<Task15> {
    String isbn;
    String title;
    String author;
    int price;
    static int edition;

    @Override
    public int compareTo(Task15 o) {
        return this.isbn.compareTo(o.isbn);
    }

}


