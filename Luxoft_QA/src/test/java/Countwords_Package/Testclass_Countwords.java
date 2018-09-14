package Countwords_Package;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testclass_Countwords {
	Prog_Countwords obj= new Prog_Countwords();
	
	
	@Test(priority=1) // Test one for case sensitive scenarios with valid words
	public void Test1_Casesensitive_with_validwords() {
	    String InputString="CAT;cat;Cat;cAt;Boy;BOY;Dog";
	    
		HashMap<String, Integer> HM= new HashMap<>();	
		HM= obj.CountWords_Casesensitive(InputString);
		
		HashMap<String, Integer> HMVerify= new HashMap<>();	
		{
			HMVerify.put("CAT", 1);
			HMVerify.put("cat", 1);
			HMVerify.put("Cat", 1);
			HMVerify.put("cAt", 1);
			HMVerify.put("Boy", 1);
			HMVerify.put("BOY", 1);
			HMVerify.put("Dog", 1);	
		}
		
		// Printing hashmap (key & values) in console for better understanding
		for(String s: HM.keySet()){
			System.out.println("word : "+ s + "  count : "+ HM.get(s).intValue());	
		}
		
		Assert.assertEquals(HMVerify, HM);
	}
	
	
	@Test(priority=2) // Test two for case sensitive scenarios with Invalid words
	public void Test2_Casesensitive_with_Invalidwords() {
		String InputString="Do1G;DOG;Cat%^;DOG;#Boy;HG56";
	    
		HashMap<String, Integer> HM= new HashMap<>();	
		HM= obj.CountWords_Casesensitive(InputString);
		
		HashMap<String, Integer> HMVerify= new HashMap<>();	
		{
			HMVerify.put("DOG", 2);
				
		}
		
		// Printing hashmap (key & values) in console for better understanding
		for(String s: HM.keySet()){
			System.out.println("word : "+ s + "  count : "+ HM.get(s).intValue());	
		}
		
		Assert.assertEquals(HMVerify, HM);
		
	}
	
	@Test(priority=3) // Test three for case Insensitive scenarios with valid words
	public void Test3_CaseInsensitive_with_validwords() {
String InputString="CAT;cat;Cat;cAt;Boy;BOY;Dog";
	    
		HashMap<String, Integer> HM= new HashMap<>();	
		HM= obj.CountWords_CaseInsensitive(InputString);
		
		HashMap<String, Integer> HMVerify= new HashMap<>();	
		{
			HMVerify.put("cat", 4);
			HMVerify.put("boy", 2);
			HMVerify.put("dog", 1);	
		}
		
		//Printing hashmap (key & values) in console for better understanding
		for(String s: HM.keySet()){
			System.out.println("word : "+ s + "  count : "+ HM.get(s).intValue());	
		}
		
		Assert.assertEquals(HMVerify, HM);
		
	}
	
	
	@Test(priority=4)  // Test four for case Insensitive scenarios with Invalid words
	public void Test4_CaseInsensitive_with_Invalidwords() {
String InputString="Do1G;DOG;Cat%^;DOG;#Boy;HG56";
	    
		HashMap<String, Integer> HM= new HashMap<>();	
		HM= obj.CountWords_CaseInsensitive(InputString);
		
		HashMap<String, Integer> HMVerify= new HashMap<>();	
		{
			HMVerify.put("dog", 2);
				
		}
		
		
		for(String s: HM.keySet()){
			System.out.println("word : "+ s + "  count : "+ HM.get(s).intValue());	
		}
		
		Assert.assertEquals(HMVerify, HM);
		
		
	}
	
}
