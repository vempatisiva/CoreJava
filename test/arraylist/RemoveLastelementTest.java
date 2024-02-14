package arraylist;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
//import collections.RemoveArrayListItem;
public class RemoveLastelementTest {

    @Test
    public void testRemoveLastElement() {
        // Create an ArrayList of Strings
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(45);
        integerList.add(78);
        integerList.add(15);
        integerList.add(89);
        integerList.add(9);
        integerList.add(78);
        integerList.add(15);
        integerList.add(89);
        integerList.add(9);
        // Create an instance of the class to test
       // RemoveLastelement removeLastElement = new RemoveLastelement();

        // Test removing the last element
       // System.out.println(integerList.toString());
       
        RemoveLastelement.removeLastElement(integerList);
//        System.out.println(integerList.toString());
//        System.out.println("[5, 45, 78, 15, 89]");
        StringBuilder expectedString = new StringBuilder("[");
        for (int i = 0; i < integerList.size(); i++) {
            expectedString.append(integerList.get(i));
            if (i < integerList.size() - 1) {
                expectedString.append(", ");
            }
        }
        expectedString.append("]");
        
        
        assertEquals(expectedString.toString(), integerList.toString());

        // Test removing the last element from an empty list
        integerList.clear();
       
        RemoveLastelement.removeLastElement(integerList);
        assertEquals("[]", integerList.toString());
    }
}