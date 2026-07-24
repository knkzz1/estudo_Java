package auxiliary;

import main.*;
import sample.animal.ImmutClass;

import java.util.ArrayList;
import java.util.List;

public class AuxTester {
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

        ConcClass cc = new ConcClass();

        System.out.println(ac.key);
        System.out.println(cc.key);

        ac.sayHello();
        cc.sayHello();
        cc.originalSayHello();

        ac.sayHi();
        cc.sayHi();

    //Roteiro 4
        System.out.println(ac.INTERFACE_VAR);
        System.out.println(cc.INTERFACE_VAR);
        AuxClass aux = new AuxClass();
        System.out.println(aux.INTERFACE_VAR);

        ac.interfaceMethod1();
        cc.interfaceMethod1();
        aux.interfaceMethod1();
        ac.interfaceMethod2();
        cc.interfaceMethod2();
        aux.interfaceMethod2();

        //Roteiro 6
        /*Tools t01 = new Tools();
        Tools t02 = new Tools();

        System.out.println(t01.option);
        System.out.println(t02.option);

        Tools.option = 'B';
        System.out.println(t01.option);
        System.out.println(t02.option);*/

        Tools.printOption();
        Tools.option = 'Z';
        //System.out.println(Tools.option);
        Tools.printOption();

        Tools t01 = new Tools();
        t01.printAlternative();

        /*Tools.display("Um texto qualquer!");
        Tools.display(10,11);
        Tools.display(25.0);
        double resultado = Tools.sum(25.84, 48.53);
        System.out.println(resultado);*/

        System.out.println(Tools.sum(25.84, 48.53));

        //Roteiro 7

        //Roteiro 8
        Enumeration test = Enumeration.ENUM_OBJECT_1;
       /* test.value1 = 100;
        System.out.println(test.value1);*/

        System.out.println(test.name());

        System.out.println(Enumeration.ENUM_OBJECT_2);

        //Roteiro 9
        List<String> habitat = new ArrayList<>();
        habitat.addAll(List.of(
                "Florestas Tropicais",
                "Florestas Decíduas",
                "Bosques de Abustos",
                "Terra Firme",
                "Savanas"
                ));

        ImmutClass ic1 = new ImmutClass("Mustela posterius furo",
                                        "Furão",
                                        4,
                                        2.5,
                                                 habitat);

        System.out.println(ic1);

        habitat.add("Oceanos");
    }
}