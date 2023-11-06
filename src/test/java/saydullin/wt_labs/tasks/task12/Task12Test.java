package saydullin.wt_labs.tasks.task12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task12Test {

    @Test
    void testTask12() {
        Task12 book1 = new Task12();
        book1.title = "Title";
        book1.author = "Author";
        book1.price = 10;
        book1.edition = 1;

        Task12 book2 = new Task12();
        book2.title = "Title";
        book2.author = "Author";
        book2.price = 10;
        book2.edition = 1;

        Task12 book3 = new Task12();
        book3.title = "Different Title";
        book3.author = "Author";
        book3.price = 10;
        book3.edition = 1;

        Assertions.assertEquals(book1, book2);  // Ожидается, что book1 равен book2
        Assertions.assertNotEquals(book1, book3);  // Ожидается, что book1 не равен book3
    }

    @Test
    public void testHashCode() {
        Task12 book1 = new Task12();
        book1.title = "Title";
        book1.author = "Author";
        book1.price = 10;
        book1.edition = 1;

        Task12 book2 = new Task12();
        book2.title = "Title";
        book2.author = "Author";
        book2.price = 10;
        book2.edition = 1;

        Assertions.assertEquals(book1.hashCode(), book2.hashCode());  // Ожидается, что хеш-коды book1 и book2 равны
    }

    @Test
    public void testToString() {
        Task12 book = new Task12();
        book.title = "Title";
        book.author = "Author";
        book.price = 10;
        book.edition = 1;

        String expected = "Task12{title='Title', author='Author', price=10, edition=1}";
        Assertions.assertEquals(expected, book.toString());  // Ожидается, что строковое представление объекта book соответствует ожидаемому значению
    }

}