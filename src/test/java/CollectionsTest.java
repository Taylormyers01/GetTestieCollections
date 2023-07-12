import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionsTest {

@Test
public void testHashSetSize(){
    HashSet<String> cars = new HashSet<String>();
    cars.add("VW");
    cars.add("Ford");
    cars.add("Chevy");
    cars.add("Audi");
    int expected = 4;

    int actual = cars.size();

    assertEquals(expected, actual);
}

}