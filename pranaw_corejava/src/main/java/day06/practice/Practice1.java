package day06.practice;
import java.util.*;
public class Practice1 {
	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
//		before deleting the duplicates
		System.out.println("before deleting the duplicates: \n"+cityList);
//Add logic to remove the duplicate Array and 
		List<String> anotherArr = removeDuplicate(cityList);
//store the unique city name is an another ArrayList
		System.out.println("After deleting duplicates: \n"+anotherArr); // after deleting duplicates
	}
	public static ArrayList<String> removeDuplicate(List<String> arr) {
        HashSet<String> set = new HashSet<>(arr);
        ArrayList<String> UniqueValues = new ArrayList<>(set);
      
		return UniqueValues;
        
	}
}
