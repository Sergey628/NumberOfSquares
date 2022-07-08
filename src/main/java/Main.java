import ru.netology.sqr.javaqamvn.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int squares = service.calcSQR(200, 300);
        System.out.println("Количество квадратов в заданном диапазоне " + squares);

    }

}

