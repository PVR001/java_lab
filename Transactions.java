import java.util.Date;

public class Transactions {
    //static variables
    public static String paymentGateway;
    private static String error101;
    private static String error102;
    private static String error103;

    //static block
    static{
        paymentGateway = " Google Pay";
        error101 = "Cannot connect to gateway";
        error102 = "Cannot connect to bank";
        error103 = "Wrong OTP";
    }

    String TranID;
    String WID;
    String BkID;
    Date tranTime;
    int tranAmount;
    String tranType;
    String tranStatus = "error 101"; //error 101: Bank account not linked.

    Transactions(){
        System.out.println("Please link bank account.");
    }

    Transactions(String TranID, String tranStatus){
        this.TranID = TranID;
        this.tranStatus = tranStatus;
        System.out.println("Transaction ID: "+ this.TranID);
        System.out.println("Transaction status: "+ this.tranStatus);
    }

    Transactions(Transactions obj){
        this(obj.TranID, obj.tranStatus);
    }

    //static methods
    static int getPaymentGateway(){
        System.out.println("Payment Gateway: "+ paymentGateway);
        return 0;
    }
    //overloading static methods
    static int printErrors(){
        System.out.println("Error 101: "+ error101);
        System.out.println("Error 102: "+ error102);
        System.out.println("Error 103: "+ error103);
        return 0;
    }
    static int printErrors(String error){
        if(error == "error 101"){
            System.out.println(error +": "+ error101);
        }
        else if(error == "error 102"){
            System.out.println(error +": "+ error102);
        }
        else if(error == "error 103"){
            System.out.println(error +": "+ error103);
        }
        else{
            System.out.println("Unknown error");
        }
        return 0;
    }

    public int fetchTransaction() { return 0;}

    //nested static class
    static class FailedTransaction
    {
        void generateReport(){
            System.out.println("Report generated for transaction failure.\nPayment Gateway: "+paymentGateway+"\nError: "+error101);
        }
    }
}
