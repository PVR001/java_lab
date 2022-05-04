
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

interface show {

    default void message() {
        System.out.println("\n\t Welcome to Zomato \n");
    }

    public void display1();
    public void display2();
    public bill();
   


}



class restaurants implements show {

    int maxVal=0;
    final int user_id=2147126;
    String user_name;
    public void usermessage()
    {
        System.out.println("\nuser_name : Rajesh"+"\n"+"user_id:"+ +user_id);
    }
    public void display1()
    {
        /// display the list of all hotels

    }

    public void display2()
    {
                //display the list if all the food items
    }
  

    static String findWord(String[] arr) {

        // Create HashMap to store word and it's frequency
        HashMap<String, Integer> hs = new HashMap<String, Integer>();

        // Iterate through array of words
        for (int i = 0; i < arr.length; i++) {
            // If word already exist in HashMap then increase it's count by 1
            if (hs.containsKey(arr[i])) {
                hs.put(arr[i], hs.get(arr[i]) + 1);
            }
            // Otherwise add word to HashMap
            else {
                hs.put(arr[i], 1);
            }
        }

        // Create set to iterate over HashMap
        Set<Map.Entry<String, Integer>> set = hs.entrySet();
        String key = "";
        int value = 0;

        for (Map.Entry<String, Integer> me : set) {
            // Check for word having highest frequency
            if (me.getValue() > value) {
                value = me.getValue();
                key = me.getKey();
            }
        }

        // Return word having highest frequency
        return key;
    }

}

class MostFrequentWord extends restaurants {


    // Function to calculate the most frequent word in the array.
    public  void FrequentWord(String array[]) {
        // Insert all unique strings and update count if a string is not unique.
        Map<String, Integer> hshmap = new HashMap<String, Integer>();
        for (String str : array) {
            if (hshmap.keySet().contains(str)) // if already exists then update count.
                hshmap.put(str, hshmap.get(str) + 1);
            else
                hshmap.put(str, 1); // else insert it in the map.
        }
        // Traverse the map for the maximum value.
        String maxStr = "";
        
        
        for (Map.Entry<String, Integer> entry : hshmap.entrySet()) {
            String key = entry.getKey();
            Integer count = entry.getValue();
            if (count > super.maxVal) {
                super.maxVal = count;
                maxStr = key;
            }
            // Condition for the tie.
            else if (count == super.maxVal) {
                if (key.length() < maxStr.length())
                    maxStr = key;
            }
        }
        super.usermessage();
        System.out.println("\nMost frequent ordered Food Item: " + maxStr);
        System.out.println("Quantity: " + super.maxVal);
    }

          


    // Main
    public static void main(String[] args) {
        
        MostFrequentWord MFW=new MostFrequentWord();
        restaurants res=new restaurants();
        // AccountBill ab=new AccountBill();  unamrk this to demonstrate the use of final class
      
        String[] arr = { "Batman", "idli", "idli", "Flash", "idli" };
        String[] hotel = { "shanthisagar", "mayura", "shanthisagar", "nisarga", "chicken county", "mayura",
                "shanthisagar" };
        res.message();
    
        MFW.FrequentWord(arr);
     
        String sol = findWord(hotel);
        System.out.println("\nMost Frequently Ordered Restaurant:\n" + sol);
        
        res.display1();
        res.display2();

        // ab.bill(); unmark this demonstrate the usage of final class
        
      


    }

}

// final class AccountBill extends MostFrequentWord  unmark this to demomstrate the working of final class
// {

//     float price;
//     float discount;

// public void bill()
// {

//     Scanner sc=new Scanner(System.in);
//     System.out.println("\n\n ******* Calculate Bill ************");
//     System.out.println("\n\n Enter the bill amount:\n");
//     price=sc.nextFloat();
//     System.out.println("Enter Discount % :");
//     discount=sc.nextFloat();

//     float finalprice=(price*discount)/100;
//     System.out.println("Final Price :\n"+finalprice);
// }

    
// }

