package objects;

import java.util.ArrayList;

// Wrapper class for ArrayList so we can sort shit
public class SortedArrayList {
	
	ArrayList<Object> list;
	
	public SortedArrayList(ArrayList<Object> list) {
		
	}
	
	/**
	 * @pre			obj can be compared	
	 * @param list	the list we want to insert obj in
	 * @param obj	the obj we want to insert into list
	 * @return		the sorted list with added object
	 */
	public static ArrayList<Object> sortedAdd(ArrayList<Object> list, Object obj) {
		for(Object o: list) {
			if (obj.compareTo(o))
		}
	}
	
}
