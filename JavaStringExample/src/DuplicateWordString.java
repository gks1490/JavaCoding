import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

  
public class DuplicateWordString {
	public static void main(String[] args) {
		System.out.println(" enter any string");
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		//String[] word = str.split("\\s");
		Set<String> duplicate = duplicateWord(str);
		System.out.println(str);
		System.out.println(duplicate);
	}
	
	public static Set<String> duplicateWord(String input){
		if(input==null|| input.isEmpty()){
			//System.out.println();
			System.out.println(Collections.emptySet());
			return Collections.emptySet();
	}
		Set<String> hasset = new HashSet<String>();
		
		String[] word = input.split("\\s");
		Set<String> set  = new HashSet<String>();
		for (String words : word) {
			if (!set.add(words)) {
				hasset.add(words);
			}

		}
		return hasset;
	}

}
