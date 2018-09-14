package Countwords_Package;
import java.util.HashMap;


public class Prog_Countwords {

   // Functionality written in a base class. Hashmap is used for word counting login.
	
   public  HashMap<String,Integer> BaseMethod(String Inputstr) {
	   int count;
       
       String[] Arr1= Inputstr.split(";");
       
       HashMap<String, Integer> HMCS= new HashMap<>();
       for(int i =0 ; i<Arr1.length ; i++) {
       	System.out.println(Arr1[i]);
       	
       if(Arr1[i].matches("[A-Za-z]+")== true) {
       	
       	System.out.println("Word Accepted ");
       	
       	if(HMCS.containsKey(Arr1[i])) {
       		
       		count= HMCS.get(Arr1[i]);
       		HMCS.put(Arr1[i], count+1);
       		
       	}
       	else {
       		
       		HMCS.put(Arr1[i], 1);
       		
       	}
          
       }
       else {
       	 System.out.println("Nope, that's not acceptable");
  	
       }
       
      
       }
       return HMCS;
		
	}
   
	// Method one  to test Case sensitivity of a string
	public   HashMap<String,Integer> CountWords_Casesensitive(String Inputstr) {
		
		Prog_Countwords obj= new Prog_Countwords();
		return obj.BaseMethod(Inputstr);
		
	}
	
	// Method two to test Case Insensitivity of a string
	public  HashMap<String,Integer> CountWords_CaseInsensitive(String Inputstr) {
		String LcaseString = Inputstr.toLowerCase();
		
		Prog_Countwords obj= new Prog_Countwords();
		return obj.BaseMethod(LcaseString);
	
	}
	
}
