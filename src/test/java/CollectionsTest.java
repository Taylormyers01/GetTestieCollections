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
    @Test
    public void testLinkedListClean(){
        Queue<Integer> number = new LinkedList<>();
        for(int i = 1; i <= 50; i++){
            number.add(i);
        }
        int expected = 0;
        number.clear();
        int actual = number.size();

        assertEquals(expected, actual);
    }

    @Test
    public void testArrayDeque(){
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        for (int i = 1; i <= 50; i++){
            numbers.add(i);
        }
        int expected = 50;
        int actual = numbers.size();

        assertEquals(expected, actual);
        assertTrue(numbers.contains(24));

        expected = 0;
        numbers.clear();
        actual = numbers.size();
        assertEquals(expected, actual);

        expected = 1;
        numbers.add(expected);
        actual = numbers.pollFirst();
        assertEquals(expected, actual);

    }

    @Test
    public void testVector(){
        Vector<Integer> test = new Vector<>();
        for (int i = 1; i <= 50; i++){
            test.add(i);
        }
        int expected = 50;
        int actual = test.lastElement();
        assertEquals(expected, actual);
        actual = test.size();
        assertEquals(expected,actual);
        assertTrue(test.contains(22));
        test.clear();
        assertTrue(test.isEmpty());


    }
    @Test
    public void testTreeMap(){
        TreeMap<String, Integer> patients = new TreeMap<>();
        String[] hold = {"Otis", "Norma", "Frances", "Taylor", "Erin", "Todd", "Heather"};
        int i = 0;
        for(String s: hold){
            patients.put(s, i);
            i++;
        }
        String expected = "Erin";
        String actual = patients.firstKey();
        assertEquals(expected, actual);
        int actual1 = patients.size();
        assertEquals(7,actual1);
        assertTrue(patients.containsValue(5));
        assertTrue(patients.containsKey("Taylor"));
        assertFalse(patients.containsKey("Jimbob"));
        patients.clear();
        assertTrue(patients.isEmpty());


    }
//    @Test
//    public void testIterator(){
//        List<Integer> num = new ArrayList<>();
//        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
//
//        String expected = "Erin";
//        String actual = patients.firstKey();
//        assertEquals(expected, actual);
//        int actual1 = patients.size();
//        assertEquals(7,actual1);
//        assertTrue(patients.containsValue(5));
//        assertTrue(patients.containsKey("Taylor"));
//        assertFalse(patients.containsKey("Jimbob"));
//        patients.clear();
//        assertTrue(patients.isEmpty());
//
//
//    }

}