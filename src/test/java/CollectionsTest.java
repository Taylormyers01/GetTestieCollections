import org.junit.jupiter.api.Test;

import java.util.*;

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

    @Test
    public void testHashSetContains(){
        HashSet<String> cars = new HashSet<String>();
        cars.add("VW");
        cars.add("Ford");
        cars.add("Chevy");
        cars.add("Audi");




        assertTrue(cars.contains("Ford"));
    }

    @Test
    public void testArrayListSize(){
        List<String> cars = new ArrayList<String>();
        cars.add("VW");
        cars.add("Ford");
        cars.add("Chevy");
        cars.add("Audi");
        int expected = 4;

        int actual = cars.size();

        assertEquals(expected, actual);
    }

    @Test
    public void testArrayListContains(){
        List<String> cars = new ArrayList<String>();
        cars.add("VW");
        cars.add("Ford");
        cars.add("Chevy");
        cars.add("Audi");


        assertTrue(cars.contains("Ford"));
    }


    @Test
    public void testHashMapSize(){
        HashMap<String, Integer> patient = new HashMap<>();
        patient.put("Taylor", 25);
        patient.put("Erin", 26);
        patient.put("Otis", 5);
        patient.put("Norma", 4);

        int expected = 4;

        int actual = patient.size();
        assertEquals(expected, actual);
    }
    @Test
    public void testHashMapGet(){
        HashMap<String, Integer> patient = new HashMap<>();
        patient.put("Taylor", 25);
        patient.put("Erin", 26);
        patient.put("Otis", 5);
        patient.put("Norma", 4);

        int expected = 25;

        int actual = patient.get("Taylor");
        assertEquals(expected, actual);
    }
    @Test
    public void testHashMapClear(){
        HashMap<String, Integer> patient = new HashMap<>();
        patient.put("Taylor", 25);
        patient.put("Erin", 26);
        patient.put("Otis", 5);
        patient.put("Norma", 4);
        patient.clear();

        int expected = 0;

        int actual = patient.size();
        assertEquals(expected, actual);
    }

    @Test
    public void testLinkedListSize(){
        Queue<Integer> number = new LinkedList<>();
        for(int i = 1; i <= 50; i++){
            number.add(i);
        }
        int expected = 50;
        int actual = number.size();

        assertEquals(expected, actual);
    }
    @Test
    public void testLinkedListPoll(){
        Queue<Integer> number = new LinkedList<>();
        for(int i = 1; i <= 50; i++){
            number.add(i);
        }
        int expected = 1;
        int expected2 = 2;
        int actual = number.poll();
        int actual2 = number.poll();

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);
    }
}