package main;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/18/13
 * Time: 8:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class A extends B {
     int i;
    public A(){
        System.out.print("In A  ");
    }
    public A(int i){

        System.out.println("In A  argument cons ");
    }
    void f2(){System.out.print("hello A f2 ");};
    void f1(){
        System.out.print("hello A  ");
    };

}

