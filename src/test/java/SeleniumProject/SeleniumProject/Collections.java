package SeleniumProject.SeleniumProject;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedList;
public class Collections {

	public void javaSetInterface() {
		hashSet();
		linkedHashSet();
		treeSet();
	}
	
	public void javaListInterface() {
		arrayList();
		linkedList();
	}
	
	public void javaMapInterface() {
       hashMap();
       linkedHashMap();
       treeMap();
	}

	public void hashSet() {
		System.out.println("******************** HashSet Class Of Set Interface ********************\n");
		System.out.println("Ponints to be noted for HashSet-->>\n");
		System.out.println("1.HashSet does not allow duplicate values");
		System.out.println("2.HashSet does not maintains order\n");
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(543);
		hashSet.add(121);
		hashSet.add(234);
		hashSet.add(121);
		hashSet.add(744);
		for (Integer i : hashSet) {
			System.out.println(i);
		}
	}

	public void linkedHashSet() {
		System.out.println("******************** LinkedHashSet Class Of Set Interface ********************\n");
		System.out.println("\nPonints to be noted for LinkedHashSet-->>\n");
		System.out.println("1.LinkedHashSet does not allow duplicate values");
		System.out.println("2.LinkedHashSet will maintains order\n");
		LinkedHashSet<Integer> linkedHasSet = new LinkedHashSet<Integer>();
		linkedHasSet.add(543);
		linkedHasSet.add(121);
		linkedHasSet.add(234);
		linkedHasSet.add(121);
		linkedHasSet.add(744);
		for (Integer i : linkedHasSet) {
			System.out.println(i);
		}
	}

	public void treeSet() {
		System.out.println("******************** TreeSet Class Of Set Interface ********************\n");
		System.out.println("\nPonints to be noted for TreeSet-->>\n");
		System.out.println("1.TreeSet does not allow duplicate values");
		System.out.println("2.TreeSet will maintains ascending order \n");
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(543);
		treeSet.add(121);
		treeSet.add(234);
		treeSet.add(121);
		treeSet.add(744);

		for (Integer i : treeSet) {
			System.out.println(i);
		}
	}
	
	public void arrayList() {
		System.out.println("******************** ArrayList Class Of List Interface ********************\n");
		System.out.println("Ponints to be noted for ArrayList-->>\n");
		System.out.println("1.ArrayList allowed duplicate values");
		System.out.println("2.ArrayList will maintains order\n");
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(543);
		arrayList.add(121);
		arrayList.add(234);
		arrayList.add(121);
		arrayList.add(744);
		for (Integer i : arrayList) {
			System.out.println(i);
		}
	}

	public void linkedList() {
		System.out.println("******************** LinkedList Class Of Set Interface ********************\n");
		System.out.println("\nPonints to be noted for LinkedList-->>\n");
		System.out.println("1.LinkedList allowed duplicate values");
		System.out.println("2.LinkedList will maintains order\n");
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(543);
		linkedList.add(121);
		linkedList.add(234);
		linkedList.add(121);
		linkedList.add(744);
		for (Integer i : linkedList) {
			System.out.println(i);
		}
	}
	
	public void hashMap() {
		System.out.println("******************** HashMap Class Of Map Interface ********************\n");
		System.out.println("Ponints to be noted for HashMap-->>\n");
		System.out.println("1.HashMap does not allow duplicate values");
		System.out.println("2.HashMap does not maintains order\n");
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(543, "Sushil");
		hashMap.put(121, "Vimal");
		hashMap.put(234, "Varsha");
		hashMap.put(121, "Govind");
		hashMap.put(744, "Rohit");
		Set<Integer> setKeys = hashMap.keySet();
		for(Integer i : setKeys){
		    System.out.println( "The Key is = "+i+" And The value is ="+hashMap.get(i));
		}
	
	}

	public void linkedHashMap() {
		System.out.println("\n******************** LinkedHashMap Class Of Map Interface ********************\n");
		System.out.println("\nPonints to be noted for LinkedHashMap-->>\n");
		System.out.println("1.LinkedHashMap does not allow duplicate values");
		System.out.println("2.LinkedHashMap will maintains order\n");
		LinkedHashMap<Integer,String> linkedHasMap = new LinkedHashMap<Integer,String>();
		linkedHasMap.put(543, "Sushil");
		linkedHasMap.put(121, "Vimal");
		linkedHasMap.put(234, "Varsha");
		linkedHasMap.put(121, "Govind");
		linkedHasMap.put(744, "Rohit");
		Set<Integer> setKeys = linkedHasMap.keySet();
		for(Integer i : setKeys){
		    System.out.println( "The Key is = "+i+" And The value is ="+linkedHasMap.get(i));
		}
	
	}

	public void treeMap() {
		System.out.println("\n******************** TreeMap Class Of Map Interface ********************\n");
		System.out.println("\nPonints to be noted for TreeMap-->>\n");
		System.out.println("1.TreeMap does not allow duplicate values");
		System.out.println("2.TreeMap will maintains ascending order \n");
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
		treeMap.put(543, "Sushil");
		treeMap.put(121, "Vimal");
		treeMap.put(234, "Varsha");
		treeMap.put(121, "Govind");
		treeMap.put(744, "Rohit");
		Set<Integer> setKeys = treeMap.keySet();
		for(Integer i : setKeys){
		    System.out.println( "The Key is = "+i+" And The value is ="+treeMap.get(i));
		}
		
	}
	

}
