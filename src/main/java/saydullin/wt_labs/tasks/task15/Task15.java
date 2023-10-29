package saydullin.wt_labs.tasks.task15;

import saydullin.wt_labs.tasks.task12.Task12;

public class Task15 implements Comparable<Task12> {
    private String isbn;
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public int compareTo(Task12 o) {
        return this.isbn.compareTo(o.isbn);
    }

}


