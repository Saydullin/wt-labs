package saydullin.wt_labs.tasks.task16;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class Task16Test {

    @Test
    void testTask16() {
        Task16 task = new Task16();

        System.out.println("Original List:");
        task.books.forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor()));

        System.out.println("\nSorted by Name:");
        ArrayList<Book> sortedByName = task.executeNameComparator();
        sortedByName.forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor()));

        System.out.println("\nSorted by Name, then by Author:");
        ArrayList<Book> sortedByNameAuthor = task.executeNameAuthorComparator();
        sortedByNameAuthor.forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor()));

        System.out.println("\nSorted by Author, then by Name:");
        ArrayList<Book> sortedByAuthorName = task.executeAuthorNameComparator();
        sortedByAuthorName.forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor()));

        System.out.println("\nSorted by Author, then by Name, then by Price:");
        ArrayList<Book> sortedByAuthorNamePrice = task.executeAuthorNamePriceComparator();
        sortedByAuthorNamePrice.forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor() + ", Price: $" + book.getPrice()));
    }

}