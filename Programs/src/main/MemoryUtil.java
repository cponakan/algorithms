package main;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/22/13
 * Time: 11:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class MemoryUtil{

    private static final int MegaBytes = 10241024;

    public static void main(String args[]) throws InterruptedException {

        long freeMemory = Runtime.getRuntime().freeMemory()/MegaBytes;
        long totalMemory = Runtime.getRuntime().totalMemory()/MegaBytes;
        long maxMemory = Runtime.getRuntime().maxMemory()/MegaBytes;

        System.out.println("JVM freeMemory: " + freeMemory);
        System.out.println("JVM totalMemory also equals to initial heap size of JVM : "
                + totalMemory);
        System.out.println("JVM maxMemory also equals to maximum heap size of JVM: "
                + maxMemory);

        ArrayList objects = new ArrayList();
        Thread.sleep(45435345);

        for (int i = 0; i < 10000000; i++) {
            objects.add(("" + 10 * 2710));
        }

        freeMemory = Runtime.getRuntime().freeMemory() / MegaBytes;
        totalMemory = Runtime.getRuntime().totalMemory() / MegaBytes;
        maxMemory = Runtime.getRuntime().maxMemory() / MegaBytes;

        System.out.println("Used Memory in JVM: " + (maxMemory - freeMemory));
        System.out.println("freeMemory in JVM: " + freeMemory);
        System.out.println("totalMemory in JVM shows current size of java heap : "
                + totalMemory);
        System.out.println("maxMemory in JVM: " + maxMemory);

    }
}


