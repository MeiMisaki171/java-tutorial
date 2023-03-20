package first_project;
import java.util.ArrayList;
import java.util.Iterator;
public class ClassArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		
		arrList.add("Tokyo");
		arrList.add("London");
		arrList.add("Hanoi");
		
		System.out.println("Cac phan tu trong mang: "+arrList);
		
		System.out.println("Su dung vong lap for :");
		for (int i=0; i<arrList.size(); i++) {
			System.out.print(arrList.get(i)+"\t");
		}
		
		System.out.println("\n Vong lap for cai tien :");
		for (String e : arrList) {
			System.out.print(e + "\t");
		}
		
		System.out.println("\nSu dung Iterator:");
		Iterator<String> iterator = arrList.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"\t");
		}

		System.out.println("\nChuyen sang Array");
		Object[] arr = arrList.toArray();
		for (int i=0; i<arr.length; i++) {
			System.out.println("Phan tu thu "+i+" la "+arr[i]);
		}
	}

}
