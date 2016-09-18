import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class DuplicateChar {
	public static void main(String[] args) {
		
		System.out.println("enter any string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> charHashMap = new HashMap<Character, Integer>();
		for(char word: ch){
			if(charHashMap.containsKey(word)){
				charHashMap.put(word, charHashMap.get(word)+1);
			}
			else{
				charHashMap.put(word, 1);
			}
		}
		Set<Character> charInString = charHashMap.keySet();
		//System.out.println("duplicate Character In"+);
		for(Character ch1:charInString){
			if(charHashMap.get(ch1)>1){
				System.out.println(ch1+":"+charHashMap.get(ch1));
			}
		}
	}

}
