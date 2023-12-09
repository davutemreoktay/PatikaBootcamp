import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("library");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();

        transaction.begin();
        Author author=new Author();
        author.setName("Sabahattin Ali");
        author.setBirthday(LocalDate.parse("1977-02-27"));
        author.setCountry("Bulgaristan");
        entityManager.persist(author);

        Publisher publisher=new Publisher();
        publisher.setName("Can Yayınları");
        publisher.setEstablishmentYear(1981);
        publisher.setAddress("İstanbul");
        entityManager.persist(publisher);

        Book book=new Book();
        book.setName("İçimizdeki Şeytan");
        book.setStock(2000);
        book.setAuthor(author);
        book.setPublisher(publisher);
        entityManager.persist(book);

        BookBorrowwing bookBorrowwing=new BookBorrowwing();
        bookBorrowwing.setBorrowerName("Davut Emre Oktay");
        bookBorrowwing.setBorrowingDate(LocalDate.parse("2023-11-05"));
        bookBorrowwing.setBook(book);
        entityManager.persist(bookBorrowwing);

        Category category=new Category();
        category.setName("Kurgu");
        category.setDescription("Kurgu");
        Category category1 = new Category();
        category1.setName("Siyasi");
        category1.setDescription("Siyasi Konular");
        Category category2 = new Category();
        category2.setName("Kültürel");
        category2.setDescription("Kültürel Konular");
        Category category3 = new Category();
        category3.setName("Gizem");
        category3.setDescription("Dedektiflik Konuları");
        Category category4 = new Category();
        category4.setName("Aşk");
        category4.setDescription("Aşk Konuları");
        Category category5 = new Category();
        category5.setName("Entrika");
        category5.setDescription("Entrika konuları");

        entityManager.persist(category);
        entityManager.persist(category1);
        entityManager.persist(category2);
        entityManager.persist(category3);
        entityManager.persist(category4);
        entityManager.persist(category5);


        List<Category> categoryList1 = new ArrayList<>();
        categoryList1.add(category);
        categoryList1.add(category1);
        book.setCategoryList(categoryList1);





        transaction.commit();

    }
}
