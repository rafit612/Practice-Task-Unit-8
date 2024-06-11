package org.examples;


import java.util.ArrayList;
import java.util.List;

public class TestOne {
    public static void main(String[] args) {
        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(11);
        arrayList1.add(25);
        arrayList1.add(30);
        arrayList1.add(40);
        arrayList1.add(42);

//        for(int i = 0; i < arrayList1.size(); i++){
//            System.out.println(arrayList1.get(i));
//        }

//        for (Integer number : arrayList1) {
//            System.out.println(number);
//        }

//        arrayList1.forEach(System.out::println);

        arrayList1.stream().filter(oddNumber -> oddNumber % 2 != 0).forEach(System.out::println);

    }

}
