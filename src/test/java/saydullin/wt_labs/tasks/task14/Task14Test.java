package saydullin.wt_labs.tasks.task14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task14Test {

    @Test
    public void testClone() {
        Task14 book1 = new Task14();
        book1.title = "Book 1";
        book1.author = "Author 1";
        book1.price = 10;
        Task14.edition = 1;

        Task14 book2 = book1.clone();

        Assertions.assertNotNull(book2);
        Assertions.assertNotSame(book1, book2);
        Assertions.assertEquals(book1.title, book2.title);
        Assertions.assertEquals(book1.author, book2.author);
        Assertions.assertEquals(book1.price, book2.price);
        Assertions.assertEquals(book1.edition, book2.edition);
    }

}