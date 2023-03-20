package first_project;
import java.util.ArrayList;
import java.util.List;
public class ListInterfaces {

	public static void main(String[] args) {
		List<String> listString = new ArrayList<String>();
		listString.add("one");
		listString.add("two");
		System.out.println(listString);
		System.out.println("Cac phan tu co trong listString");
		for (String element : listString) {
			System.out.println(element);
		}
	}
}
