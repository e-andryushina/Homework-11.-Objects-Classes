import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author authorName;
    private int yearOfPublication;

    public Book (String bookName, Author authorName,int yearOfPublication) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookName () {
        return this.bookName;
    }

    public Author getAuthorName () {
        return this.authorName;
    }

    public int getYearOfPublication () {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String toString () {
        return this.bookName + " , автором которой является " + this.authorName + " , была опубликована в " + this.yearOfPublication + " году.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && bookName.equals(book.bookName) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, yearOfPublication);
    }
}
