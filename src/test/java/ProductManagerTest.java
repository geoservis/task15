import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    public void testAdd() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Childhood", 100, "Tolstoy");
        Book book2 = new Book(1, "Cossacks", 100, "Tolstoy");
        Book book3 = new Book(1, "Three bears", 100, "Tolstoy");
        Smartphone smartphone1 = new Smartphone(1, "A35", 200, "Sansung");
        Smartphone smartphone2 = new Smartphone(1, "IPhone11", 200, "Apple");
        Smartphone smartphone3 = new Smartphone(1, "A25", 200, "Samsung");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, book3, smartphone1, smartphone2, smartphone3};

        Assertions.assertArrayEquals(expected, actual);
    }



}