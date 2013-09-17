package main;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/16/13
 * Time: 11:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class bits {
    public enum Elvis {
        INSTANCE;
        private final String[] favoriteSongs =
                { "Hound Dog", "Heartbreak Hotel" };
        public void printFavorites() {
            System.out.println("hello charitha this is singleton implemented using enum");
        }
    }



    public static void main(String Args[]) throws InterruptedException {
        Elvis.INSTANCE.printFavorites();
        String s1 = "t";
        s1 = s1.substring(1);
        s1.substring(1);
        char[] testing = {'a','b','c'} ;
        for(char c: testing){
            char t = (char)(c-'a'+'A');
            System.out.println(t);
        }


            int j = Integer.parseInt("0009");
        System.out.println(j);
        Integer i = Integer.valueOf("00009");
        System.out.println(i);

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "abc");
        map.put(1, "def");
        System.out.println("hello: " + map.size());

        A a =  new A(5);
        Atoi atoi = new Atoi();
        a.f1();

    }
}



