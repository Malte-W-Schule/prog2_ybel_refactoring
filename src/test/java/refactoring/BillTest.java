package refactoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class BillTest {

    private Bill bill;

    @BeforeEach
    void setUp() {
        Date testDate = new Date(1990, 5, 15);
        bill = new Bill("Max Mustermann", "Maxi", "Musterstraße", "42", 12345, testDate, "max@test.de", "Musterstadt");
    }

    @Test
    void testBromptonPricing() {
        Brompton brompton = new Brompton("Brompton", 1000.0, 25, 3, 2);
        bill.addArticle(new Article(brompton, 3));

        String details = bill.getDetails();
        double expectedPrice = 1000.0 * 3 + (3 - 1) * 1000.0 / 2;
        assertTrue(details.contains(String.valueOf(expectedPrice)));
    }

    @Test
    void testEBikePricing() {
        EBike eBike = new EBike("E-Bike", 800.0, 35, 7, 3, 500);
        bill.addArticle(new Article(eBike, 2));

        String details = bill.getDetails();
        assertTrue(details.contains("1600.0"));
    }

    @Test
    void testMountainbikePricing() {
        Mountainbike mountainbike = new Mountainbike("Mountain", 600.0, 30, 8, 3);
        bill.addArticle(new Article(mountainbike, 4));

        String details = bill.getDetails();
        double expectedPrice = 4 * 600.0 * 9 / 10;
        assertTrue(details.contains(String.valueOf(expectedPrice)));
    }

    @Test
    void testHighValueDiscount() {
        EBike eBike = new EBike("Premium", 1200.0, 35, 7, 3, 500);
        bill.addArticle(new Article(eBike, 1));

        String details = bill.getDetails();
        double expectedPrice = 1200.0 * 0.8;
        assertTrue(details.contains(String.valueOf(expectedPrice)));
    }

    @Test
    void testBillDetailsFormat() {
        String details = bill.getDetails();
        assertTrue(details.contains("Max Mustermann"));
        assertTrue(details.contains("Musterstraße 42"));
        assertTrue(details.contains("Total price:"));
    }

    @Test
    void testMultipleArticles() {
        bill.addArticle(new Article(new EBike("E1", 500.0, 35, 7, 3, 500), 1));
        bill.addArticle(new Article(new Brompton("B1", 600.0, 25, 3, 2), 1));

        String details = bill.getDetails();
        assertTrue(details.contains("Total price:\t1100.0"));
    }
}
