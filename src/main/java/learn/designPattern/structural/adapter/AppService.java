package learn.designPattern.structural.adapter;

public class AppService {

    private static PaymentGateway paymentGateway;

    public static void main(String[] args) {

        paymentGateway.pay(500);
    }
}
