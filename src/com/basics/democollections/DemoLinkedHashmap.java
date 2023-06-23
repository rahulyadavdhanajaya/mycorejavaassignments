package com.basics.democollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashmap {
    public static void main(String[] args) {
        Map<Integer,Integer> mydata= new LinkedHashMap<Integer,Integer>();

        mydata.put(3,12);
        mydata.put(12,28);
        mydata.put(null,43);
        mydata.put(8,null);
        mydata.put(9,null);
        mydata.put(12,8);
        mydata.put(21,7);


        Iterator iterator = mydata.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
