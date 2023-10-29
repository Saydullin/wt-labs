package saydullin.wt_labs.tasks.task16.comparator;

import saydullin.wt_labs.tasks.task16.Book;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPrice() - o2.getPrice();
    }

}


