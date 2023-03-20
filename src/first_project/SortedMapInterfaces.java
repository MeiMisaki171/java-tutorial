package first_project;
import java.util.SortedMap;
import java.util.TreeMap;
public class SortedMapInterfaces {

	public static void main(String[] args) {
		SortedMap<String, String> sortedMap = new TreeMap<>();
		sortedMap.put(".com", "gmail");
		sortedMap.put(".vn", "educaition");
		
		System.out.println("Cac entry co trong sortedMap la:");
		sortedMap.forEach((key, value) -> System.out.println("key=" + key + " value=" + value));
	}

}
