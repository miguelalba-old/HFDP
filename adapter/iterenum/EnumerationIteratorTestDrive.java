package adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTestDrive {
	
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>(Arrays.asList(args));
		Iterator<?> iterator = new EnumerationIterator(vector.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
