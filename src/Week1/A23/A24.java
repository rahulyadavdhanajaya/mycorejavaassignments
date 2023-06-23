package Week1.A23;
import java.util.ArrayList;
import java.util.List;
//Create an ArrayList which will be able to store only numbers like int,float,double,etc, but not any other data type.


class MyArrayList<E> extends ArrayList<E> {

    public boolean add(E e) {
        if (e instanceof Integer || e instanceof Float || e instanceof Double) {
            super.add(e);
            return true;
        } else {
            throw new ClassCastException("Only Integer, Float, and Double are supported.");
        }
    }
}

public class A24{

    public static void main(String[] args) {
        List<Object> list = new MyArrayList<>();

        try {
            list.add(15);
            list.add(1.2F);
            list.add(3.1415D);
            list.add("Test");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(list);

    }

}
//import java.util.ArrayList;
//import java.util.List;
//
//public class A24 {
//    public static void main(String[] args) {
//            List<Number> numberList = new ArrayList<>();
//
//            // Adding numbers to the list
//            numberList.add(10);            // int
//            numberList.add(3.14f);         // float
//            numberList.add(3.14159);       // double
//
//            // Accessing numbers from the list
//            int intValue = numberList.get(0).intValue();
//            float floatValue = numberList.get(1).floatValue();
//            double doubleValue = numberList.get(2).doubleValue();
//
//            System.out.println("Integer value: " + intValue);
//            System.out.println("Float value: " + floatValue);
//            System.out.println("Double value: " + doubleValue);
//        }
//    }

