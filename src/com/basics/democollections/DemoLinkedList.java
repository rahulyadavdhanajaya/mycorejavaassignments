package com.basics.democollections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    public static void main(String[] args) {
        List<Integer> mydata = new LinkedList<Integer>();

        mydata.add(32);
        mydata.add(12);
        mydata.add(5);
        mydata.add(22);
        mydata.add(32);
        mydata.add(null);
        mydata.add(38);
        mydata.add(38);


        Collections.synchronizedList(mydata);

        for(int i = 0; i < mydata.size(); i++) {
            System.out.println(mydata.get(i));
        }
    }
}

//