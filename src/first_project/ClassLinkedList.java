package first_project;
import java.util.LinkedList;
import java.util.Iterator;
public class ClassLinkedList {

	public static void main(String[] args) {
		LinkedList<String> linkList = new LinkedList<>();
		
		linkList.add("Tokyo");
		linkList.add("London");
		linkList.add("Vietnam");
		
		System.out.println("Cac phan tu trong list");
		for (int i=0; i< linkList.size(); i++) {
			System.out.println(linkList.get(i));
		}
		System.out.println("Vong lap for cai tien");
		for (String item: linkList) {
			System.out.println(item);
		}
		
		System.out.println("Su dung iterator");
		Iterator<String> iterator = linkList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
