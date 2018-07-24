import java.util.*;
public class AddAll {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Rahul");
		al.add("Raj");
		al.add("Ram");
		
		ArrayList<String>al2=new ArrayList<String>();
		al2.add("Rahul");
		al2.add("Damru");
		
		al.retainAll(al2);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		

	}

}
