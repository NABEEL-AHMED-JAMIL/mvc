package com.admaxim.mvc;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.Iterator;
import java.util.Set;

public class Barcod {


    public static void main(String args[]) {

        Multiset<String> multiset = HashMultiset.create();

        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("d");
        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("b");
        multiset.add("b");
        multiset.add("b");

        System.out.println(multiset);
        System.out.println("Occurrence of 'b' : "+multiset.count("b"));
        System.out.println("Total Size : "+multiset.size());
        //get the distinct elements of the multiset as set
        Set<String> set = multiset.elementSet();
        System.out.println(set);

        //display the elements of the set
        System.out.print("Set [");
        for (String s : set) { System.out.print(s + ","); }
        System.out.println("]");

        //display all the elements of the multiset using iterator
        Iterator<String> iterator  = multiset.iterator();
        System.out.print("MultiSet [");
        while(iterator.hasNext()) { System.out.print(iterator.next() + ","); }
        System.out.println("]");

        //display the distinct elements of the multiset with their occurrence count
        System.out.print("MultiSet [");
        for (Multiset.Entry<String> entry : multiset.entrySet()) {
            System.out.println("Element: " + entry.getElement() + ", Occurrence(s): " + entry.getCount());
        }
        System.out.println("]");

        //remove extra occurrences
        multiset.remove("b",2);

        //print the occurrence of an element
        System.out.println("Occurence of 'b' : " + multiset.count("b"));

    }
}
