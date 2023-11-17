import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //TreeSet to order the name of books
        TreeSet<Book> books = new TreeSet<>(new OrderNameComparator());
        //TreeSet to order the total page number of books (big to small)
        TreeSet<Book> booksOrderTotalPages = new TreeSet<>(new OrderTotalPagesComparator().reversed());

        books.add(new Book("Kürk Mantolu Madonna", "Sabahattin Ali", 160, 1943));
        books.add(new Book("Hayvan Çiftliği", "George Orwell", 152, 1945));
        books.add(new Book("Satranç", "Stefan Zweig", 83, 1941));
        books.add(new Book("Küçük Prens", "Antoine de Saint-Exupery", 112, 1943));
        books.add(new Book("Şeker Portakalı", "Jose Mauro de Vasconcelos", 184, 1968));

        System.out.println("Adına göre sırlanmış hali:");
        System.out.println("--------------------------");
        for (Book book : books) {
            System.out.println(book.getName());
        }

        System.out.println("######################");
        System.out.println("Sayfa sayına göre sıralanmış hali:");
        System.out.println("----------------------------------");
        //The same books list added to new TreeSet for ordering total pages of books
        booksOrderTotalPages.addAll(books);
        for(Book bookPage : booksOrderTotalPages){
            System.out.println(bookPage.getName());
        }
    }
}