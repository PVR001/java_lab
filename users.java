
import java.util.*; 

class users

{ 
    int user_id;
    int ph;
    String  user_name;


    users(int user_id,int ph, String user_name)
    {
        this.user_id=user_id;
        this.ph=ph;
        this.user_name=user_name;

    }

    
	public void FrequentWord(String array[]) 
	{ 
		// Insert all unique strings and update count if a string is not unique.
		Map<String,Integer> hshmap = new HashMap<String, Integer>(); 
		for (String str : array) 
		{ 
			if (hshmap.keySet().contains(str)) // if already exists then update count. 
				hshmap.put(str, hshmap.get(str) + 1); 
			else
				hshmap.put(str, 1); // else insert it in the map.
		} 
    	// Traverse the map for the maximum value.
		String maxStr = ""; 
    	int maxVal = 0; 
		for (Map.Entry<String,Integer> entry : hshmap.entrySet()) 
		{ 
			String key = entry.getKey(); 
			Integer count = entry.getValue(); 
			if (count > maxVal) 
			{ 
				maxVal = count; 
				maxStr = key; 
			} 
      		// Condition for the tie.
			else if (count == maxVal){ 
				if (key.length() < maxStr.length())
					maxStr = key; 
			}
		} 
		System.out.println("Most frequently ordered customer: "+ maxStr);
		System.out.println("number of time " +maxStr+ " has ordered : " +maxVal); 
	} 


    // public void userslist(int user_id,int ph, String user_name)
    // {
    //     this.user_id=user_id;
    //     this.ph=ph;
    //     this.user_name=user_name;
    // }

    void showusers()
    {
        System.out.println(" \nuser details :\n");
        System.out.println("username ::"+user_name+"\n"+"user_id ::"+user_id+"\n"+"phone number::"+ph);
    }
}
// Main

class derived{

 

    public static void main(String[] args) 
	{ 
        System.out.println("\t\t\t ZOMATO \n\n");
        // System.out.println(" hello "+args[0]+" ! welcome\n\n ");
    users ux=new users(101,81111,"raj");
     derived d=new derived();
	  String[] arr = { "raji", "sweta", "sirvi" , "smith", "smith","smith","smith" }; 
        ux.FrequentWord(arr);
        // ux.userslist(101,861889671,"smith");
        ux.showusers();
    
	} 
}

