package lists;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListDemo {
	
	int max;
	int min;

	public ListDemo(int max, int min) {
		this.max = max;
		this.min = min;
	}
	
	/**
	 * Adds to a List<Integer> a specified number of random integers.
	 * random.nextInt((max - min) + 1) + min takes the max and min variables,
	 * and says (max - min) will be the highest value it can go, and + 1 will tell
	 * the object instead of 0 through (max - min) to be 1 through (max - min).
	 * min is added on at the end to increase the lowest value it can be.
	 * 
	 * @param amount - int
	 * @param list - List<Integer>
	 */
	public void getNumbers(int amount, List<Integer> list) {
	
		Random random = new Random();
		
		for(int i = 0; i < amount; i++) {
			int num = random.nextInt((max - min) + 1 ) + min;
			list.add(num);
		}
		
	}
	
	/**
	 * Returns the smallest value in the List<Integer>.
	 * It uses an Iterator to traverse the List using next() and hasNext() methods.
	 * 
	 * @param list
	 * @return current - int
	 */
	public int getSmallest(List<Integer> list) {
		Iterator iterator = list.iterator();
		int current = (int) iterator.next();
		
		while (iterator.hasNext()) {
			int nextValue = (int) iterator.next();
			
			if (nextValue < current) {
				current = nextValue;
			}	
		}
		
		return current;
	}
	
	/**
	 * Return the max.
	 * 
	 * @return max
	 */
	public int getMax() {
		return max;
	}
	
	/**
	 * Sets the max variable.
	 * 
	 * @param max - int
	 */
	public void setMax(int max) {
		this.max = max;
	}
	
	/**
	 * Return the min.
	 * 
	 * @return min
	 */
	public int getMin() {
		return min;
	}
	
	/**
	 * Sets the min variable.
	 * 
	 * @param min
	 */
	public void setMin(int min) {
		this.min = min;
	}
}
