package CollectionsPP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasMapProgram implements Cloneable {
    public static void main(String[] args) {
        /*1. Write a Java program to append the specified element to the end of a hash set.*/

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Black");
        map.put(3, "Purple");
        map.put(4, "White");
        map.put(5, "Green");




        /*2. Write a Java program to iterate through all elements in a hash list.*/
        for (Map.Entry<Integer, String> map1 : map.entrySet()) {
            System.out.println("Keys\t:" + map1.getKey() + " " + "Values\t:" + map1.getValue());
        }

        /*3. Write a Java program to copy all mappings from the specified map to another map.*/

        Map<Integer, String> newmap = new HashMap<>(map);
        System.out.println(newmap);



        /*4. Write a Java program to remove all mappings from a map.*/

        System.out.println(map);
        //  map.clear();
        System.out.println("Map After remove all Mapping" + map);

        /*5. Write a Java program to check whether a map contains key-value mappings (empty) or not.*/
        if (map.isEmpty()) {
            System.out.println("Map is Not Empty");
        } else System.out.println("Map is Empty");

        /*6. Write a Java program to get a shallow copy of a HashMap instance.*/
        System.out.println("Clone");
        HashMap<Integer, String> clone = (HashMap<Integer, String>) ((HashMap<Integer, String>) map).clone();
        //   System.out.println("Map After Clone"+clone);


        /*7. Write a Java program to test if a map contains a mapping for the specified key.*/

        System.out.println(map);
        if (map.containsKey(1)) {
            System.out.println("Mapping is Present ");
        } else System.out.println("Mapping not Present for key");



        /*8. Write a Java program to test if a map contains a mapping for the specified value.*/
        System.out.println(map);
        if (map.containsValue("Red")) {
            System.out.println("Value Present In map");
        } else
            System.out.println("Value not Present");


        /*9. Write a Java program to create a set view of the mappings contained in a map.*/
        System.out.println(" Write a Java program to create a set view of the mappings contained in a map ");
        Set<Map.Entry<Integer, String>> setView = map.entrySet();
        System.out.println("Set view of map: \n" + setView);



        /*10. Write a Java program to get the value of a specified key in a map.*/
        int key = 4;
        System.out.println("Get Value associated with given Key " + key + " is " + map.get(4));
        System.out.println();

        /*11. Write a Java program to get a set view of the keys contained in this map.*/
        System.out.println("Write a Java program to get a set view of the keys contained in this map");
        Set<Integer> set = map.keySet();
        System.out.println("Set view of Keys in map: \n" + set);
        System.out.println();



        /* 12. Write a Java program to get a collection view of the values contained map. */

        Collection<String> collection = map.values();
        System.out.println("Collection view of map: \n" + collection);

    }

}
