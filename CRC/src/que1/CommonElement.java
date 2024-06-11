package que1;

import java.util.ArrayList;
import java.util.List;

public class CommonElement {

	public static void main(String[] args) {
		int[] L1= {56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 88, 72, 73, 74, 75, 76, 77, 78, 79, 80};
		int[] L2= {81,56, 82, 83, 1, 84, 85, 86, 87, 88, 60, 89, 90,1, 91, 92, 93};
		
		List<Integer> commonElements = new ArrayList<>();
	      for (int i = 0; i < L1.length; i++) {
	         for (int j = 0; j < L2.length; j++) {
	            if (L1[i] == L2[j]) {
	               commonElements.add(L1[i]);
	               break;
	            }
	         }
	      }
	      
		System.out.println(commonElements);
			
		
	}

}
