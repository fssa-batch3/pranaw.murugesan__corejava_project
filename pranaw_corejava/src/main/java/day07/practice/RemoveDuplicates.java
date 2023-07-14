package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
//		adding duplicates
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(6);
		
		System.out.println(arr); // printing arraylist 
		
		System.out.println(removeDuplicates(arr)); // after deleting duplicates
		
		
	}
//	method to delete duplicates in array list
	public static HashSet<Integer> removeDuplicates(ArrayList<Integer> arr){
		HashSet<Integer> unique = new HashSet<Integer>();
		unique.addAll(arr);
		return unique;
	}
}
