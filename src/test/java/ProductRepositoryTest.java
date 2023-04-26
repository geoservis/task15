import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    @Test
    public void testRepositoryAdd() {
        ProductRepository repo = new ProductRepository();
        Book book1 = new Book(1, "Childhood", 100, "Tolstoy");
        Book book2 = new Book(2, "Cossacks", 100, "Tolstoy");
        Book book3 = new Book(3, "Three bears", 100, "Tolstoy");
        Smartphone smartphone1 = new Smartphone(4, "A35", 200, "Sansung");
        Smartphone smartphone2 = new Smartphone(5, "IPhone11", 200, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "A25", 200, "Samsung");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(smartphone1);
        repo.add(smartphone2);
        repo.add(smartphone3);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, book3, smartphone1, smartphone2, smartphone3};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testRepositoryRemove() {
        ProductRepository repo = new ProductRepository();
        Book book1 = new Book(1, "Childhood", 100, "Tolstoy");
        Book book2 = new Book(2, "Cossacks", 100, "Tolstoy");
        Book book3 = new Book(3, "Three bears", 100, "Tolstoy");
        Smartphone smartphone1 = new Smartphone(4, "A35", 200, "Sansung");
        Smartphone smartphone2 = new Smartphone(5, "IPhone11", 200, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "A25", 200, "Samsung");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(smartphone1);
        repo.add(smartphone2);
        repo.add(smartphone3);
        repo.removeById(2);
        repo.removeById(4);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book3, smartphone2, smartphone3};

        Assertions.assertArrayEquals(expected, actual);
    }


}