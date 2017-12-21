package academy.elqoo.structural.facade.improved;

public class BillingSystem {

	public Bill createBill(Integer amount){

		// Let's assume some advanced logic happens here;
		return new Bill(amount);

	}

}
