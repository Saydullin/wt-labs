package saydullin.wt_labs.tasks.task15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task15Test {

    @Test
    public void testCompareTo() {
        Task15 book1 = new Task15();
        book1.isbn = "123456789";
        book1.title = "Book 1";
        book1.author = "Author 1";
        book1.price = 10;
        Task15.edition = 1;

        Task15 book2 = new Task15();
        book2.isbn = "987654321";
        book2.title = "Book 2";
        book2.author = "Author 2";
        book2.price = 20;
        Task15.edition = 2;

        int result = book1.compareTo(book2);

        Assertions.assertTrue(result < 0, "Expected a negative value");
    }

}