package HomeWork12;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Дмитрий ", "Рус");
        Book book = new Book("Играть чтобы жить", author, 2013);
        System.out.println("Книга: " + book.getPublisher());
        System.out.println("Автор: " + author.getName() + author.getSurName());
        System.out.println("год издания: " + book.getPublicationYear());
        book.setPublicationYear(2014);
        System.out.println("год издания продолжения: " + book.getPublicationYear());

        System.out.println("~~~~~~~~~~~~~~~");

        Author author1 = new Author("Анджей ", "Ясинский");
        Book book1 = new Book("НИК", author1,  2009);
        System.out.println("Книга: " + book1.getPublisher());
        System.out.println("Автор: " + author1.getName() + author1.getSurName());
        System.out.println("Год издания: " + book1.getPublicationYear());
    }
}
