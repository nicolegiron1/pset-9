import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		} else if (a.get(0) == b.get(0) || a.get(a.size()-1) == b.get(b.size()-1)) {
			return true;
		}
		return false;
	}

	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		if (values == null || values.size() < n || n < 1) {
			ArrayList empty = new ArrayList();
 			return empty;
 		} else {
			ArrayList newArray = new ArrayList(n*2);
 			int x = n;
 			for(int i = 0; i < n; i++) {
 				newArray.add(values.get(i));
 			}
 			for(int i = values.size()-n; i < values.size(); i++) {
 				newArray.add(values.get(i));
 				x++;
 			}
 			return newArray;
 		}
	}

	public int difference(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 1) {
			return -1;
		} else {
			int max = numbers.get(0);
			int min = numbers.get(0);
			for (int i = 1; i < numbers.size(); i++) {
	             if (numbers.get(i) > max) {
	            	 max = numbers.get(i);
	             }
	             if (numbers.get(i) < min) {
	            	 min = numbers.get(i);
	             }
			}
			return max-min;
		}
	}

	public double biggest(ArrayList<Double> numbers) {
		if (numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0) {
			return -1;
		} else {
			for(int i = 0; i < numbers.size(); i++) {
				if(numbers.get(i) < 0) {
					return -1;
				}
			}
			double first = numbers.get(0);
			double middle = numbers.get(numbers.size()/2);
			double last = numbers.get(numbers.size()-1);
			if(first > middle && first > last) {
				return first;
			} else if (middle > first && middle > last) {
				return middle;
			} else if (last > first && last > middle) {
				return last;
			} else if (first == middle && middle == last) {
				return first;
			}
		}
		return -1;
	}

	public ArrayList<String> middle(ArrayList<String> values) {
		String[] empty = new String[0];
		if (values == null || values.length < 3 || values.length % 2 == 0) {
			return empty;
		} else {
			for(int i = 0; i < values.length; i++) {
				if(values[i] == null) {
					return empty;
				}
			}
			int middleInt = (values.length-1);
			String first = values[middleInt/2-1];
			String middle = values[middleInt/2];
			String last = values[middleInt/2+1];
			String[] newArray = new String[3];
			newArray[0] = first;
			newArray[1] = middle;
			newArray[2] = last;
			return newArray;
		}
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(ArrayList<String> values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}
