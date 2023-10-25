package arrtoArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Tongue {

	public static void main(String[] args) {
		
		String array[]= {"a","d","f","h"};
		
		List<String> list = Arrays.asList(array);
        
		System.out.println(list);
		
		List<String> list1 =  new ArrayList<String>();
		
		Collections.addAll(list1,array);
	}
  
}
