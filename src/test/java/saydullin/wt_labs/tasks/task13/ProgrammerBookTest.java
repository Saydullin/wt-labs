package saydullin.wt_labs.tasks.task13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProgrammerBookTest {

    @Test
    public void testEquals() {
        ProgrammerBook book1 = new ProgrammerBook();
        book1.setLanguage("Java");
        book1.setLevel(3);

        ProgrammerBook book2 = new ProgrammerBook();
        book2.setLanguage("Java");
        book2.setLevel(3);

        ProgrammerBook book3 = new ProgrammerBook();
        book3.setLanguage("Python");
        book3.setLevel(2);

        Assertions.assertEquals(book1, book2, "Expected book1 to be equal to book2");
        Assertions.assertNotEquals(book1, book3, "Expected book1 to be not equal to book3");
    }

    @Test
    public void testHashCode() {
        ProgrammerBook book1 = new ProgrammerBook();
        book1.setLanguage("Java");
        book1.setLevel(3);

        ProgrammerBook book2 = new ProgrammerBook();
        book2.setLanguage("Java");
        book2.setLevel(3);

        Assertions.assertEquals(book1.hashCode(), book2.hashCode(), "Expected the hash codes to be equal");
    }

    @Test
    public void testToString() {
        ProgrammerBook book = new ProgrammerBook();
        book.setLanguage("Java");
        book.setLevel(3);

        String expectedString = "ProgrammerBook{language='Java', level=3}";

        Assertions.assertEquals(expectedString, book.toString());
    }


}