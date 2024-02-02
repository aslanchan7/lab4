import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTests {
    @Test
    public void testMerge() {
        List<String> expectedList = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        List<String> input1 = new ArrayList<String>();
        List<String> input2 = new ArrayList<String>();
        input1.add("a");
        input1.add("b");
        input2.add("c");
        input2.add("d");
        input1.add("e");
        input2.add("f");

        assertArrayEquals(expectedList.toArray(), ListExamples.merge(input1, input2).toArray());
    }
}