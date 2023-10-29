package saydullin.wt_labs.tasks.task14;

public class Task14 {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public Task14 clone() {
        try {
            Task14 clonedBook = (Task14) super.clone();
            clonedBook.title = new String(this.title);
            clonedBook.author = new String(this.author);
            return clonedBook;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}


