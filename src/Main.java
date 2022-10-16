public class Main {
    public static void main(String[] args) {

        Author author = new Author("Джером", "Сэлинджер");
        Book book = new Book("Над пропастью во ржи",  author, 2005);

        Author author2 = new Author ("Антон", "Чехов");
        Book book2 = new Book ("Вишневый сад", author2 , 1965 );
        System.out.println("Название первой книги: " + book.getBookName() +
                " , автор: " + author.getAuthorName() + " " +
                author.getAuthorSurname() +
                " , год издания: " + book.getYearOfPublication());
        System.out.println("Название второй книги: " + book2.getBookName() +
                " , автор: " + author2.getAuthorName() + " " + author2.getAuthorSurname() +
                " , год издания: " + book2.getYearOfPublication() );

        book.setYearOfPublication(2010);
        System.out.println("Книга " + book.getBookName() + " была переиздана в " + book.getYearOfPublication() + " году");


        System.out.println(author.toString());
        System.out.println(book.toString ());
        System.out.println (author.hashCode());
        System.out.println (book.hashCode());
        System.out.println(book.getBookName().equals(book2.getBookName()));
        System.out.println(author.getAuthorName().equals(author2.getAuthorName()));



        }



    }
