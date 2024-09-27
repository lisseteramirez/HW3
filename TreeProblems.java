/*
 * *** LISSETE / SECTION 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */
import java.util.*;
public class TreeProblems {
    /**
     * Method different()
     *
     * Given two TreeSets of integers, return a TreeSet containing all elements
     * that are NOT in both sets. In other words, return a TreeSet of all the
     * elements that are in one set but not the other.
     */
    public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
        //two temporary sets are created to hold unique elements of each set
        Set<Integer> result = new TreeSet<>(setA);
        Set<Integer> temp = new TreeSet<>(setB);
        //removes common elements from both sets
        result.removeAll(setB);
        temp.removeAll(setA);
        //combines the results of both sets
        result.addAll(temp);
        //returns the union of non-common elements
        return result;
    }
    /**
     * Method removeEven()
     *
     * Given a treeMap with the key as an integer, and the value as a String,
     * remove all <key, value> pairs where the key is even.
     */

    public static void removeEven(Map<Integer, String> treeMap) {
        //removes entries where the key is an even number
        treeMap.keySet().removeIf(key -> key % 2 == 0);
    }
    /**
     * Method treesEqual()
     *
     * Given two treeMaps, each with the key as an integer, and the value as a String,
     * return a boolean value indicating if the two trees are equal or not.
     */

    public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
        //compares both TreeMaps for equality
        return tree1.equals(tree2);
    }

} // end treeProblems class
