package org.javaavance.generics;

public class Main {


    public static void main(String[] args) {
        IGenericSet<Double> myGenericSet = new GenericSet<>(5);
        // add test
        myGenericSet.add(1.0);
        myGenericSet.add(1.1);
        myGenericSet.add(1.2);
        myGenericSet.add(1.3);
        myGenericSet.add(1.3);
        myGenericSet.add(1.4);
        myGenericSet.add(1.5);
        myGenericSet.print(); // [1.0, 1.1, 1.2, 1.3, 1.4]
        System.out.println("size = " + myGenericSet.getSize()); // size = 5

        // get test
        System.out.println("get 0 = " + myGenericSet.get(0)); // get 0 = 1.0
        System.out.println("get 1 = " + myGenericSet.get(1)); // get 1 = 1.1

        // remove test
        System.out.println("removing 1.2");
        myGenericSet.remove(1.2);
        myGenericSet.print(); // [1.0, 1.1, 1.3, 1.4, null]
        System.out.println("size = " + myGenericSet.getSize()); // size = 4

        // contains test
        System.out.println("contains 1.0 = "+ myGenericSet.contains(1.0)); // contains 1.0 = true
        System.out.println("contains 4.0 = "+ myGenericSet.contains(4.0)); // contains 4.0 = false

        // clear test
        System.out.println("clearing");
        myGenericSet.clear();
        myGenericSet.print(); // [null, null, null, null, null]

    }
}
