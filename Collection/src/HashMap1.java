import java.util.*;
public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(101, "Ankur");
		hm.put(102, "raj");
		hm.put(103, "Ritesh bail");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
