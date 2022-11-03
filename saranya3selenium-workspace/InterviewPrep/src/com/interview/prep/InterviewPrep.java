package com.interview.prep;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class InterviewPrep {
	
	int i,j;
	public static void main(String args[]) throws FileNotFoundException {
		String s= "Nikita,Vivaan,Saranya,Uday";
		String[] s1 = s.split(",");
		for (String str : s1) {
		System.out.println(str);
		}
		String a = "aaa";
		String b = "bbb";
		String c = "ccc";
		System.out.println(a.concat(b).concat(c));
		InterviewPrep obj = new InterviewPrep();
		obj.arrlst();
		obj.hsset();
		obj.hsmap();
		obj.hstable();
		obj.scanner();
		obj.setup();
	
}
	public void arrlst() {
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("apple");
		lst.add("banana");
		lst.add("orange");
		lst.add("kiwi");
		lst.add("grapes");
		lst.add("kiwi");
		lst.add("banana");
		System.out.println("Arraylist contains:"+lst);
		for(i=0;i<lst.size();i++) {
			for(j=i+1;j<lst.size();j++) {
				if (lst.get(i).equalsIgnoreCase(lst.get(j))) {
				System.out.println("Duplicates are:"+lst.get(i));
				}
			}
		}
	}
	
	public void hsset() {
		HashSet<String> lst1 = new HashSet<String>();
		lst1.add("apple");
		lst1.add("banana");
		lst1.add("orange");
		lst1.add("kiwi");
		lst1.add("grapes");
		lst1.add("kiwi");
		lst1.add("banana");
		System.out.println("Hashset contains:"+lst1);
	}
	public void hsmap() {
		HashMap<String,Integer> lst2= new HashMap<String,Integer>();
		lst2.put("apple",20);
		lst2.put("banana",30);
		lst2.put("orange",25);
		lst2.put("kiwi",40);
		lst2.put("grapes",50);
		lst2.put("kiwi",40);
		lst2.put("banana",40);
		lst2.put(null, null);
		System.out.println("HashMap contains:"+lst2);
	}
	public void hstable() {
		Hashtable<String,Integer> lst3= new Hashtable<String,Integer>();
		lst3.put("apple",20);
		lst3.put("banana",30);
		lst3.put("orange",25);
		lst3.put("kiwi",40);
		lst3.put("grapes",50);
		lst3.put("kiwi",40);
		lst3.put("banana",40);
		//lst3.put(null, null); throws exception as it does not accept null value
		System.out.println("HashTable contains:"+lst3);
	}
	public void scanner() {
		
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter the name, gender,age and address");
		
		for(i=0;i<4;i++) {
			String str = reader.next();
			System.out.println("\n"+str);
		}
		
		/*String name = reader.next();
		String address= reader.next();
		int age = reader.nextInt();
		String gender= reader.next();
		
		
		System.out.println("The details are:" +name);
		System.out.println("\n"+address);
		System.out.println("\n" +age);
		System.out.println("\n"+gender);*/
		//}
		int a = reader.nextInt();
		System.out.println("Enter value b:");
		int b = reader.nextInt();
		int c = a+b;
		System.out.println("Sum is:"+c);
		
	}
	public void setup() throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileReader("C:\\Software Testing\\config.txt"));
		Map<String, String> hmapconf = new LinkedHashMap<String, String>();
		String line;

		while (scanner.hasNext()) {
			line = scanner.next();
			if (!line.isEmpty()) {
				String[] columns = line.split("=");

				hmapconf.put(columns[0], columns[1]);
			}
			System.out.println(hmapconf.get("Website_link_Homepage"));
			
		}
	}
}
