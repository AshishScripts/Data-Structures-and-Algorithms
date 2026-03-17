package arrays_and_hashing;

import java.util.HashSet;

/* A HashSet is a collection of elements where every element is unique.
 It is part of the java.util package and implements the Set interface.

A HashSet in Java is a collection from the java.util package that stores unique elements in no particular order, using a hashtable (specifically a HashMap) to achieve high performance.

hashsets    are unordered.

It provides constant-time complexity on average for basic operations like adding, removing, and checking for existence.

 */
public class HashSetImplementation {
    public static void main(String[] args) {

        // instantiating a HashSet object
        HashSet<Integer> set = new HashSet<>();

        // Adding hashset elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        // checking size
        System.out.println("The size of the set is:" + set.size());

        // displaying the elements of the hashset
        System.out.println(set);

        // checking the existence or searching
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }

        if (!set.contains(6)) {
            System.out.println("Set doesnt contains 6");
        }

        // removing an element of the hashset
        set.remove(1);

        if (!set.contains(1)) {
            System.out.println("1 is removed!");
        }

        // Iterating over hash set

        // method 1: using for each
        for (int item : set) {
            System.out.println("hash item : " + item);
        }
    }
}
