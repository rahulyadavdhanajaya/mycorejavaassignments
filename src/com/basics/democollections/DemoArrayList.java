package com.basics.democollections;

import com.DemoJava8.Functional.Customer;
import com.DemoJava8.Functional.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List<Customer> mydata = new ArrayList<Customer>();

        mydata.add(new Customer(25,3,"lk","raj",5,"male"));
        mydata.add(new Customer(26,6,"ja","bob",10,"female"));
        mydata.add(new Customer(35,4,"is","sud",15,"female"));
        mydata.add(new Customer(30,5,"po","henry",12,"male"));


        System.out.println(mydata.stream().noneMatch(Customer->Customer.getFirstName().startsWith("l")));










    }
}
   //    mydata.add(32);
//       mydata.add(12);
//       mydata.add(5);
//       mydata.add(22);
//       mydata.add(32);
//       mydata.add(null);
//       mydata.add(38);
//       mydata.add(38);
//
//        Collections.synchronizedList(mydata); // to synchronize the data
//
//       for(int i=0;i<mydata.size();i++){
//           System.out.println(mydata.get(i));


  //      System.out.println(mydata);
  //     }
 //   }

// it allows null as a value.
//it allows duplicate value.
//not sorted by default.
// it doesn't have any fixed size.
//maintains the insertion order.