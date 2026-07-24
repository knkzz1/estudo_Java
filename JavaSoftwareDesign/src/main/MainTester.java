package main;

import auxiliary.AuxClass;

public class MainTester {
    public static void main(String[] args) {
        //Roteiro 1
        ConcClass1 cc1 = new ConcClass1();
        ConcClass2 cc2 = new ConcClass2();

        System.out.println(cc1.getKey());
        System.out.println(cc2.getKey());

        cc1.setKey(1111);
        cc2.setKey(2222);

        System.out.println(cc1.getKey());
        System.out.println(cc2.getKey());

        //Roteiro 2
        AbstClass ac = new ConcClass();
        AbstClass cc = new ConcClass();
        AuxClass aux = new AuxClass();


        System.out.println(ac.key);

        //roteiro 4
        System.out.println(ac.INTERFACE_VAR);
        System.out.println(cc.INTERFACE_VAR);

        ac.interfaceMethod1();
        cc.interfaceMethod1();
        aux.interfaceMethod1();

    }
}