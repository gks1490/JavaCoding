import java.util.HashMap;
import java.util.Scanner;


public class OccurenceOfChar {
	
	public static void main(String[] args) {
		
		System.out.println("enter any string");
		Scanner sc = new Scanner(System.in);
		String str  = sc.next();
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> charHashMap = new HashMap<Character,Integer>();
		for(char c: ch){
			if(charHashMap.containsKey(c)){
				charHashMap.put(c, charHashMap.get(c)+1);
			}
			else{
				charHashMap.put(c, 1);
			}
		}
		System.out.println(charHashMap);
	}

}
