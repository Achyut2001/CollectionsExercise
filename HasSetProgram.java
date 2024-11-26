package CollectionsPP;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class HasSetProgram {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);


        /*2. Write a Java program to iterate through all elements in a hash list.*/
        for (Integer num : set) {
            System.out.println(num);
        }

        /*4. Write a Java program to empty an hash set. */

        System.out.println(set);
        set.clear();
        System.out.println("Set After empty" + set);

        /*5. Write a Java program to test if a hash set is empty or not.*/

        System.out.println(set);

        if (set.isEmpty()) {
            System.out.println("Set is Not Empty");
        } else System.out.println("set Is Empty");




        /*6. Write a Java program to clone a hash set to another hash set.*/


        HashSet<Integer> cloneSet = (HashSet<Integer>) set.clone();
        System.out.println("Cloned Set" + cloneSet);



        /* 7. Write a Java program to convert a hash set to an array.*/

        Integer[] array = set.toArray(new Integer[0]);//Converting Set into array

        for (Integer element : array) {
            System.out.println(element);
        }


        /* 8. Write a Java program to convert a hash set to a tree set.*/

        TreeSet<Integer> treeSet = new TreeSet<>(set);//Converting set into treeset
        for (Integer element : treeSet) {
            System.out.println(element);
        }

        /*9. Write a Java program to find numbers less than 7 in a tree set.*/
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(9);
        treeSet.add(10);

        TreeSet<Integer> lessThan = new TreeSet<>(treeSet1.headSet(7));
        for (Integer element : lessThan) {
            System.out.println(element);
        }


        /* 10. Write a Java program to compare two hash set.*/

        HashSet<Integer> compareToset = new HashSet<>();

        if (set.equals(compareToset)) {
            System.out.println("Two set are equals");
        } else {
            System.out.println("Set are Not equals");
        }

        /*11. Write a Java program to compare two sets and retain elements that are the same*/

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(111);
        set1.add(23);
        set1.add(22);

        set.retainAll(set1);
        for (Integer element : set1) {
            System.out.println(element);
        }

        /*12. Write a Java program to remove all elements from.*/

        System.out.println(set);
        set.clear();
        System.out.println("Set After remove all element" + set);

    }
}
