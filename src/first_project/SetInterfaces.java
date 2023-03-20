package first_project;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
public class SetInterfaces {

	public static void main(String[] args) {
		Set<String> setString = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		String khoa="";
		
		setString.add("dtvt");
		setString.add("cntt");
		setString.add("khmt");
		
		Iterator<String> iterator = null;
		iterator = setString.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Them 1 khoa");
		khoa = scanner.next();
		Set<String> setStringLater = new HashSet<>();
		setStringLater.add(khoa);
		if(setString.containsAll(setStringLater)) {
			System.out.println("Ten khoa da ton tai");
		} else {
			System.out.println("Them thanh cong");
			setString.add(khoa);
		}
		
		System.out.println(setString);
		
		System.out.println("Nhap khoa can xoa");
		String deleteKhoa = scanner.next();
		Set<String> deleteString = new HashSet<>();
		deleteString.add(deleteKhoa);
		if (setString.containsAll(deleteString)) {
			System.out.println("Xoa thanh cong");
			setString.remove(deleteKhoa);
		} else {
			System.out.println("Xoa khong thanh cong");
		}
		
		System.out.println(setString);
	}
}
