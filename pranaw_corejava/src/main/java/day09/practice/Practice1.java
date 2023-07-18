package day09.practice;

import java.util.*;

public class Practice1 {
	public static void main(String[] args) {
		int[] arr = {8 ,9 ,45 ,12 ,1};
		sortValue(arr);
		
	}
	public static void sortValue(int[] array) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int e : array) {
			arr.add(e);
		}
		Collections.sort(arr);
		System.out.println(arr);
	}
}
