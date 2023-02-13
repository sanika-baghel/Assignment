package assignmentIII;
import java.util.*;
public class ArrayListprogram {
   public static void main(String[] args) {

      ArrayList<String> arr = new ArrayList<String>();
      arr.add("apple");
      arr.add("fig");
      arr.add("papaya");
      arr.add("orange");

      System.out.println("For Loop");
      for (int counter = 0; counter < arr.size(); counter++) { 		      
          System.out.println(arr.get(counter)); 		
      }   		
	
      System.out.println("Advanced For Loop"); 		
      for (String s : arr) { 		      
           System.out.println(s); 		
      }
		
      System.out.println("While Loop"); 		
      int count = 0; 		
      while (arr.size() > count) {
	 System.out.println(arr.get(count));
         count++;
      }

      System.out.println("Iterator");
      Iterator iter = arr.iterator();
      while (iter.hasNext()) {
         System.out.println(iter.next());
      }
   }
}