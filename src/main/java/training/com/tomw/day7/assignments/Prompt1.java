package training.com.tomw.day7.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Prompt1 {

	public static void main(String[] args) {

		Random random = new Random();
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			arrList.add(random.nextInt());
		}
		System.out.println("ArrayList Example");
		System.out.println(arrList);
		arrList.remove(2);
		System.out.println(arrList);
		Iterator<Integer> itr1 = arrList.iterator();
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("LinkedList Example");
		LinkedList<Integer> linkList = new LinkedList<Integer>();
		for (int i = 0; i < 5; i++) {
			linkList.add(random.nextInt());
		}
		System.out.println(linkList);
		linkList.remove(4);
		System.out.println(linkList);
		Iterator<Integer> itr2 = linkList.iterator();
		while (itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Vector Example");
		Vector<Object> vector = new Vector<Object>();
		String name = "Tommy";
		for (int i = 0; i < 5; i++) {
			vector.add(random.nextDouble());
		}
		vector.add(name);
		vector.add("Element 115");
		System.out.println(vector);
		vector.removeElementAt(3);
		vector.removeElementAt(2);
		System.out.println(vector);
		java.util.Enumeration<Object> e = vector.elements();
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}
		System.out.println();
		System.out.println("First Element in vector: " + vector.firstElement());
		System.out.println();
		System.out.println();
		System.out.println("Stack Example");
		Stack<String> stack = new Stack<String>();
		stack.push("Tommy");
		stack.push("Ashley");
		stack.push("Adam");
		stack.push("Eve");
		System.out.println(stack);
		// Shows the first element of the stack
		System.out.println(stack.peek());
		// Takes the first element and shows it, but removes it from the stack
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);

		System.out.println();
		System.out.println();
		System.out.println("HashSet Example");
		HashSet<String> HashSet = new HashSet<String>();
		HashSet.add("Tiger");
		HashSet.add("Lion");
		HashSet.add("Puma");
		System.out.println(HashSet);
		HashSet.remove("Lion");
		System.out.println(HashSet);
		Iterator<String> itr3 = HashSet.iterator();
		while (itr3.hasNext()) {
			System.out.print(itr3.next() + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("LinkedHashSet Example");
		LinkedHashSet<String> LinkedHashSet = new LinkedHashSet<String>();
		LinkedHashSet.add("Tiger");
		LinkedHashSet.add("Lion");
		LinkedHashSet.add("Puma");
		System.out.println(LinkedHashSet);
		LinkedHashSet.remove("Puma");
		System.out.println(LinkedHashSet);
		Iterator<String> itr4 = LinkedHashSet.iterator();
		while (itr4.hasNext()) {
			System.out.print(itr4.next() + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("TreeSet Example");
		TreeSet<String> TreeSet = new TreeSet<String>();
		TreeSet.add("Tiger");
		TreeSet.add("Lion");
		TreeSet.add("Puma");
		System.out.println(TreeSet);
		TreeSet.remove("Tiger");
		System.out.println(TreeSet);
		Iterator<String> itr5 = TreeSet.iterator();
		while (itr5.hasNext()) {
			System.out.print(itr5.next() + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("HashMap Example");
		HashMap<Integer, Integer> HashMap = new HashMap<Integer, Integer>();
		HashMap.put(1, 100);
		HashMap.put(2, 200);
		HashMap.put(3, 300);
		HashMap.put(4, 400);
		for (Map.Entry<Integer, Integer> entry : HashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " || " + "Value: " + entry.getValue());
		}
		System.out.println();
		HashMap.remove(1);
		for (Map.Entry<Integer, Integer> entry : HashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " || " + "Value: " + entry.getValue());
		}
		Iterator<Map.Entry<Integer, Integer>> itr6 = HashMap.entrySet().iterator();
		while (itr6.hasNext()) {
			System.out.print(itr6.next() + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("LinkedHashMap Example");
		LinkedHashMap<String, Integer> LinkedHashMap = new LinkedHashMap<String, Integer>();
		LinkedHashMap.put("Adam", 1);
		LinkedHashMap.put("Evn", 2);
		LinkedHashMap.put("Tommy", 3);
		LinkedHashMap.put("Ashley", 4);
		for (Map.Entry<String, Integer> entry : LinkedHashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " || " + "Value: " + entry.getValue());
		}
		System.out.println();
		LinkedHashMap.remove("Tommy");
		for (Map.Entry<String, Integer> entry : LinkedHashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " || " + "Value: " + entry.getValue());
		}
		Iterator<Map.Entry<String, Integer>> itr7 = LinkedHashMap.entrySet().iterator();
		while (itr7.hasNext()) {
			System.out.print(itr7.next() + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("TreeMap Example");
		TreeMap<String, Integer> TreeMap = new TreeMap<String, Integer>();
		TreeMap.put("Tommy", 1);
		TreeMap.put("Ashley", 2);
		TreeMap.put("Eve", 3);
		TreeMap.put("Adam", 4);
		for (Map.Entry<String, Integer> entry : TreeMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " || " + "Value: " + entry.getValue());
		}
		Iterator<Map.Entry<String, Integer>> itr8 = TreeMap.entrySet().iterator();
		while (itr8.hasNext()) {
			System.out.print(itr8.next() + " ");
		}
	}

}
