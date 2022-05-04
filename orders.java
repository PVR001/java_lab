import java.time.LocalDate; 


class orders{

    int order_id,qty;
    String order_status,item_name;

    orders( int order_id,String item_name,int qty,String order_status)
    {

        this.order_id=order_id;
        this.item_name=item_name;
        this.qty=qty;
        this.order_status=order_status; 

    }



}

class customer
{

String cus_name,add;
int cus_id,ph;
Orders or;

customer(int cus_id,string cus_name,String add,orders or)
{
    this.cus_id=cus_id;
    this.cus_name=cus_name;
    this.add=add;
    this.or=or;



}

public static void main(String[] args)
{
    orders  or  = new orders(101,"pizza",3,"ordered");
    customer cus = new customer(2076,"sweta","basaveshwaranagar");
    System.out.println("----------Order Details:------------");
    System.out.println("Order ID: " + or.order_id);
    System.out.println("Item Name: " + or.item_name);
    System.out.println("Item Quantity: " + or.qty);
    System.out.println("Order Status: " + or.order_status);
    System.out.println("----------Customer details-------");
    System.out.println("Customer ID :" + cus.or.cus_id);
    System.out.println("Customer Name: " + cus.or.cus_name);
    System.out.println("Customer Address: " +cus.or.add);
  }
}




