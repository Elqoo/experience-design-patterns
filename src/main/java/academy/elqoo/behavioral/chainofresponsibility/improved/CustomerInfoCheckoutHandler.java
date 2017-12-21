package academy.elqoo.behavioral.chainofresponsibility.improved;


public class CustomerInfoCheckoutHandler extends CheckoutHandler{
    @Override
    public void handlCheckout() {
        System.out.println("Adding extra info to checkout of the customer");

        if(nextHandler != null){
            nextHandler.handlCheckout();
        }
    }
}
