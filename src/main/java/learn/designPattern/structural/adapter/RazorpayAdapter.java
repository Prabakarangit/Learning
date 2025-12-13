package learn.designPattern.structural.adapter;

public class RazorpayAdapter implements PaymentGateway{
    RazorpayAPI razorpayAPI = new RazorpayAPI();

    @Override
    public void pay(int amount) {
        razorpayAPI.makePayment(amount);
    }
}
