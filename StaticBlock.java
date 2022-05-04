public class StaticBlock
{
    public static void main(String args[])
    {
        Transactions trans1 = new Transactions("TRAN01", "Success");
        System.out.println("\nAccess Static variable");
        System.out.println("Payment Gateway: " + Transactions.paymentGateway);
        System.out.println("\nAccess Static methods");
        trans1.getPaymentGateway();
        System.out.println("\nOverload static methods");
        trans1.printErrors();
        trans1.printErrors("error 101");
        trans1.printErrors("error 102");

        System.out.println("\nStatic nested class");
        Transactions.FailedTransaction failure1 = new Transactions.FailedTransaction();
        failure1.generateReport();
    }
}