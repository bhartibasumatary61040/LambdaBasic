package org.example.work;

import org.example.work.MyInter;
import org.example.work.MyInterImple;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


//        MyInter myInter = new MyInterImple();
//        myInter.sayHello();

        MyInter i = ()->
            System.out.println(" This is first time i am using lambda");
        i.sayHello();

        SumInter sumInter = ( a, b)->a + b;
        System.out.println( sumInter.sum(5,7));
        System.out.println(sumInter.sum(8,9));

        LengthInter lengthInter = (str -> str.length());
        System.out.println(lengthInter.getLength("jojo bharti "));
    }
}