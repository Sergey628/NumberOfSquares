import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.javaqamvn.services.SQRService;

public class SQRServiceTest {
    @Test
    public void testRange() {
        SQRService service = new SQRService();


        int expected = 3;
        int actual = service.calcSQR(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testZero() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSQR(0, 0);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testNegativeNumbers() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSQR(-200, -300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLimit() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calcSQR(1, 9999);

        Assertions.assertEquals(expected, actual);
    }


}
