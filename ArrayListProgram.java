package CollectionsPP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListProgram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> colors = new ArrayList<>();

        //1. Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        /*2. Write a Java program to iterate through all elements in an array list.*/
        for (String s : colors) {
            System.out.println(s);
        }
        System.out.println("==================");


        //*   3. Write a Java program to insert an element into the array list at the first position.*//*

        colors.add(0, "Blue");
        System.out.println("======================");
        //*4 Write a Java program to retrieve an element (at a specified in dex) from a given array list.*//*
        System.out.println("Provide index");
        int index = scanner.nextInt();
        if (index >= 0 && index < colors.size()) {
            String element = colors.get(index);
            System.out.println("Element at index" + element);
        } else System.out.println("invalid Index");

        System.out.println("=====================================");
        //* 5. Write a Java program to update an array element by the given element.*//*
        System.out.print("Enter the index of the element to update:\n ");
        int index1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Provide index");
        String newElement = scanner.nextLine();
        if (index >= 0 && index < colors.size()) {
            String element = colors.set(index1, newElement);
            System.out.println("Element at index" + element);
        }
        System.out.println(colors);


        //*6 Write a Java program to remove the third element from an array list.*//*
        colors.remove(3);
        System.out.println("Item Removed" + colors);


        System.out.println("=========================");

        /* 7 Write a Java program to search for an element in an array list.*/
        System.out.println("ArrayList: " + colors);

        System.out.print("Enter the element to search for: ");
        String searchElement = scanner.nextLine();

        if (colors.contains(searchElement)) {
            System.out.println("Element '" + searchElement + "' found at index: " + colors.indexOf(searchElement));
        } else {
            System.out.println("Element '" + searchElement + "' not found in the ArrayList.");
        }
        /* 8. Write a Java program to sort a given array list.*/
        System.out.println("Array before sorting");
        System.out.println(colors);

        System.out.println("Array After sorting");
        Collections.sort(colors);


        /*9. Write a Java program to copy one array list into another.*/

        System.out.println(colors);

        System.out.println("Copy array in new list");
        List<String> newList = new ArrayList<>(colors);


        /*10. Write a Java program to shuffle elements in an array list.*/

        System.out.println("Original ArrayList " + colors);

        Collections.shuffle(colors);
        System.out.println("Arraylist After shuffle " + colors);


        /*11. Write a Java program to reverse elements in an array list.*/

        System.out.println("ArrayList Before reverse" + colors);

        Collections.reverse(colors);
        System.out.println("ArrayList After reverse" + colors);




        /*12. Write a Java program to extract a portion of an array list.*/

        List<String> subList = new ArrayList<>();

        System.out.println("Sub List\n" + colors.subList(2, 4));

        System.out.println(subList);





        /*13. Write a Java program to compare two array lists.*/
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");
        list2.add(" Apple");
        list2.add("Banana");
        ArrayList<String> comparisonResult = new ArrayList<>();
        if (list2.equals(list2)) {
            System.out.println("The ArrayLists are equal.");
        } else {
            System.out.println("The ArrayLists are not equal.");
        }

        /*14. Write a Java program that swaps two elements in an array list.*/

        System.out.println("Collection before Swap" + colors);

        Collections.swap(colors, 3, 1);
        System.out.println("Collection After Swap" + colors);


        /*15. Write a Java program to join two array lists.*/

        System.out.println("Colors ArrayList" + colors);
        System.out.println("List 2 " + list2);

        colors.addAll(list2);

        System.out.println(colors);


        /*16. Write a Java program to clone an array list to another array list.*/


        /*17. Write a Java program to empty an array list.*/

        System.out.println(colors);
        colors.clear();
        System.out.println("ArrayList After Empty: \n" + colors);

        System.out.println("===============  ");


        /*18. Write a Java program to test whether an array list is empty or not.*/
        System.out.println(colors);

        if (colors.isEmpty()) {
            System.out.println("ArrayList is Empty");
        } else System.out.println("ArrayList Not Empty");

        /*19. Write a Java program for trimming the capacity of an array list.*/

        ArrayList<String> trimlist = new ArrayList<>(20);
        System.out.println("List Before Trim");

        trimlist.trimToSize();
        System.out.println("List After Trim \n" + trimlist);

        /*20. Write a Java program to increase an array list size.*/


        System.out.println(trimlist);

        trimlist.ensureCapacity(trimlist.size() * 2);
        System.out.println("ArrayList After increase" + trimlist);

        /*21. Write a Java program to replace the second element of an ArrayList with the specified element.*/
        System.out.println("Before Inserting: \n" + colors);
        colors.set(1, "Purple");
        System.out.println("After Inserting: \n" + colors);
        System.out.println();

        /*22. Write a Java program to print all the elements of an ArrayList using the elements position.*/

        System.out.println("ArrayList elements with their indices:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Index " + i + ": " + colors.get(i));
        }
    }

}
