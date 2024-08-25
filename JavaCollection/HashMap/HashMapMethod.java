package HashMap;

import java.util.HashMap;

public class HashMapMethod {
	
	public static void main(String[] args) {
	
		HashMap<String, String> hashmap = new HashMap<String, String>();
//		for put method
		hashmap.put("Nepal","Kathmandu");
		hashmap.put("South Korea", "Seoul");
		hashmap.put("China", "Beijing");
		System.out.println("Original Map: " + hashmap);

//		for clone method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.put("China", "Beijing");	
//		HashMap<String, String> copy = (HashMap<String, String>) hashmap.clone();
//		copy.put("japan","");
//		System.out.println("Original Map: " + hashmap);
//	    System.out.println("Cloned Map: " + copy);
		
//		for compute method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.put("China", "Beijing");
//		hashmap.compute("Japan", (k,v)->v + (v == null) != null ? "Tokyo" :"");
//		hashmap.compute("Nepal", (k,v)-> v + "(" + k + ")");
//		hashmap.compute("China", (k,v) -> v + (v == "Beijing") != null ? "Beijing" : "China(Beijing)"  );
//		System.out.println("Original Map: " + hashmap);

//		for computeIfAbsent method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.put("China", "Beijing");
//		hashmap.computeIfAbsent("Japan",(k)-> "Tokyo (" +k+")");
//		System.out.println("Original Map: " + hashmap);
		
//		for computeIfPresent method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		hashmap.computeIfPresent("Japan",(k,v)-> v+ "(" +k+")");
//		System.out.println("Original Map: " + hashmap);
		
//		for containKey method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		System.out.println(hashmap.containsKey("Nepal"));
		
//		for containValue method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		System.out.println(hashmap.containsValue("Seoul"));
		
//		for entrySet method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		System.out.println(hashmap.entrySet());
		
//		for forEach method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		hashmap.forEach((k,v) -> {System.out.println( k + " -> " + v);});
		
//		for get method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		System.out.print(hashmap.get("China"));
		
//		for getOrDefault method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		System.out.print(hashmap.getOrDefault("China","Unkown"));
		
//		for isEmpty method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		System.out.print(hashmap.isEmpty());
		
//		for keySet method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		System.out.print(hashmap.keySet());
		
//		for merge method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.put("China", "Beijing");
//		hashmap.merge("Japan", "Tokyo",(a,b)-> a + "-> " + b );
//		System.out.print(hashmap);
		
//		for put method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		System.out.print(hashmap);
		
//		for putAll method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("South Korea", "Seoul");		
//		HashMap<String, String> hashmap1 = new HashMap<String, String>();
//		hashmap1.put("China", "Beijing");
//		hashmap1.put("Japan", "Tokyo");
//		hashmap.putAll(hashmap1);
//		System.out.print(hashmap);
		
//		for putIfAbsent method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		hashmap.putIfAbsent("South Korea", "Seoul");
//		System.out.print(hashmap);
		
//		for remove method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.remove("Nepal");
//		hashmap.remove("Japan", "Tokyo");
//		System.out.print(hashmap);
		
//		for replace method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.replace("Nepal", "Kathmandu", "Lalitpur");
//		System.out.print(hashmap);
		
//		for replaceAll method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.replaceAll((k,v)->"The capital of " + k +" is " + v );
//		System.out.print(hashmap); 
		
//		for sizes method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.replace("Nepal", "Kathmandu", "Lalitpur");
//		System.out.println(hashmap.size());
		
//		for value method
//		hashmap.put("Nepal","Kathmandu");
//		hashmap.put("China", "Beijing");
//		hashmap.put("Japan", "Tokyo");
//		hashmap.put("South Korea", "Seoul");
//		hashmap.replace("Nepal", "Kathmandu", "Lalitpur");
//		System.out.print(hashmap.values());
		
		
	
	
	
	}
}
