package first_project;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		List<String> listString = new ArrayList<String>();
		
		listString.add("chuoi thu nhat");
		listString.add("Chuoi thu hai");
		listString.add("Chuoi thu ba");
		
		Iterator<String> iterator = null;
		
		iterator = listString.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
