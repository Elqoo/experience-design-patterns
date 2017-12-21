package academy.elqoo.behavioral.chainofresponsibility.improved;


public class PaymentCheckoutHandler extends CheckoutHandler{

    @Override
    public void handlCheckout() {
        System.out.println("Hanling payment of the customer");

        if(nextHandler != null){
            nextHandler.handlCheckout();
        }

    }

}
