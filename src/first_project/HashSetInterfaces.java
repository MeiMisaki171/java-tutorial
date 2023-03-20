package first_project;
import java.util.HashSet;
import java.util.TreeSet;
public class HashSetInterfaces {

	public static void main(String[] args) {
		// khai bao 1 HashSet
		HashSet<Integer> hashSet = new HashSet<>();
		
		//khai baos 1 HashSet co kich thuong khoi tao = 32
		HashSet<Character> hashSetChar = new HashSet<>(32);
		
		// khai bao 1 HashSet co kich thuoc khoi tao = 16
		// va he so tai la 0.75f
		HashSet<String> hashSetString = new HashSet<>(16, 0.75f);
		
		// khai bao tu 1 Collection khac
		HashSet<Float> hashSetFloat = new HashSet<>(new TreeSet<>());
		
		hashSetString.add("Tokyo");
		hashSetString.add("London");
		hashSetString.add("Hanoi");
		hashSetString.add("Berlin");
		System.out.println("cac phan tu trong hashSetString");
		System.out.println(hashSetString);
	}

}
