package academy.elqoo.structural.facade.improved;


public class FinancialSystemFacade {

    private BillingSystem billingSystem;

    private InvoiceCustomerSystem invoiceCustomerSystem;

    public void createInvoice(Integer amount){

        Bill bill = billingSystem.createBill(amount);
        invoiceCustomerSystem.createInvoiceForBill(bill);

    }


    public void setBillingSystem(BillingSystem billingSystem) {
        this.billingSystem = billingSystem;
    }

    public void setInvoiceCustomerSystem(InvoiceCustomerSystem invoiceCustomerSystem) {
        this.invoiceCustomerSystem = invoiceCustomerSystem;
    }
}
