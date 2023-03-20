package first_project;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MapInterfaces {

	public static void main(String[] args) {
		Map<Integer, Character> mapString = new TreeMap<>();
		Scanner scanner = new Scanner(System.in);
		String str;
		Set<Character> setChar;
		
		System.out.println("Nhap vao chuoi bat ky");
		str = scanner.next();
		
		char[] charStr = str.toCharArray();
		setChar = new TreeSet<>();
		for(char ch : charStr) {
			setChar.add(ch);
		}
		
		System.out.println("Do dai cua chuoi la: " + charStr.length);
		System.out.println("Cac ky tu trong chuoi la :");
		for (char ch : setChar ) {
			mapString.put(str.length(), ch);
			System.out.print(mapString.keySet() + "=>" + mapString.values()+"\n");
		}
	}

}
