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
}
