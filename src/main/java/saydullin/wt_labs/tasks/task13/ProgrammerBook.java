package saydullin.wt_labs.tasks.task13;

public class ProgrammerBook {
    private String language;
    private int level;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ProgrammerBook otherBook = (ProgrammerBook) obj;

        return language.equals(otherBook.language) &&
                level == otherBook.level;
    }

    @Override
    public int hashCode() {
        int result = language.hashCode();
        result = 31 * result + level;
        return result;
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "language='" + language + '\'' +
                ", level=" + level +
                '}';
    }

}


