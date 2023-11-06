package saydullin.wt_labs.tasks.task12;

public class Task12 {
    public String isbn;
    public String title;
    public String author;
    public int price;
    public static int edition;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Task12 task12 = (Task12) obj;

        return title.equals(task12.title) &&
                author.equals(task12.author) &&
                price == task12.price &&
                edition == task12.edition;
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + price;
        result = 31 * result + edition;
        return result;
    }

    @Override
    public String toString() {
        return "Task12{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", edition=" + edition +
                '}';
    }

}


