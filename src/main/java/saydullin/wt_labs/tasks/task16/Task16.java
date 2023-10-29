package saydullin.wt_labs.tasks.task16;

import saydullin.wt_labs.tasks.task16.comparator.AuthorComparator;
import saydullin.wt_labs.tasks.task16.comparator.NameComparator;
import saydullin.wt_labs.tasks.task16.comparator.PriceComparator;

import java.util.ArrayList;
import java.util.Comparator;

public class Task16 {

    ArrayList<Book> books = new ArrayList<>();
    private final Comparator<Book> nameComparator = new NameComparator();
    private final Comparator<Book> nameAuthorComparator = new NameComparator().thenComparing(new AuthorComparator());
    private final Comparator<Book> authorNameComparator = new AuthorComparator().thenComparing(new NameComparator());
    private final Comparator<Book> authorNamePriceComparator = new AuthorComparator().thenComparing(new NameComparator()).thenComparing(new PriceComparator());

    public Task16() {
        books.add(new Book(
                "Title1",
                "Author1",
                1,
                1
        ));
        books.add(new Book(
                "Title2",
                "Author2",
                2,
                2
        ));
        books.add(new Book(
                "Title3",
                "Author3",
                3,
                3
        ));
    }

    public ArrayList<Book> executeNameComparator() {
        return SortUtil.execute(books, nameComparator);
    }

    public ArrayList<Book> executeNameAuthorComparator() {
        return SortUtil.execute(books, nameAuthorComparator);
    }

    public ArrayList<Book> executeAuthorNameComparator() {
        return SortUtil.execute(books, authorNameComparator);
    }

    public ArrayList<Book> executeAuthorNamePriceComparator() {
        return SortUtil.execute(books, authorNamePriceComparator);
    }

}


