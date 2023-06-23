package com.basics.democollections;

//LinkedHashset
// It maintains the insertion order.
//remaining all similar like hashset.

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLinkedHashset {
    public static void main(String[] args) {
        Set mydata= new LinkedHashSet();

        mydata.add(32);
        mydata.add(20);
        mydata.add(32);
        mydata.add(9);
        mydata.add(null);
        mydata.add(66);
        mydata.add(18);


        Collections.synchronizedSet(mydata);
        Iterator iterator= mydata.iterator();
        while(iterator.hasNext()){
            System.out.println( " "+iterator.next()+" ");

        }
    }
}
