import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.StyleSheet.ListPainter;

public class App {
    public static void main(String[] args) throws Exception {

        // List<Object> is not the supertype of any list type
        List<Object> myObjs = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<>();

        myObjs = myNumbers; // Compilation error

        // The supertype of any type of list is List<?>. 
        // <?> is a wild card
        List<?> myObjs2 = new ArrayList<>();
        List<Integer> myNumbers2 = new ArrayList<Integer>();
        myObjs2 = myNumbers;
    }
}
