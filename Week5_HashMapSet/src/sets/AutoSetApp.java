/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets;

import java.util.HashSet;

/**
 *
 * @author bgnmh
 */
public class AutoSetApp {

    static HashSet<Auto> autoos1, autoos2, autoos3, autoos4;

    public static void main(String[] args) {
        autoos1 = new HashSet<Auto>();
        autoos1.add(new Auto("Evander","rood","Suzuki",2002));
        autoos1.add(new Auto("Carlijn","oranje","VW",2012));
        autoos1.add(new Auto("Cas","groen","Ferrari",2020));
        
        


        autoos2 = new HashSet<Auto>();
        autoos2.add(new Auto("Anne","turquoise","Citroen",1234));
        autoos2.add(new Auto("Valerie","rood","Mini Cooper",2008));
        autoos2.add(new Auto("Carleen","geel","Opel",2000));
        autoos2.add(new Auto("Cas","blauwe","Maseratti",2001));
        
        

        System.out.println(autoos1);
        System.out.println(autoos2);

        HashSet verschil1 = new HashSet<Auto>(autoos1);
        verschil1.removeAll(autoos2);

        System.out.println(verschil1);

        HashSet overeenkomst = new HashSet<Auto>(autoos1);
        overeenkomst.addAll(autoos2);
        System.out.println("Add");
        System.out.println(overeenkomst);
    }
}
