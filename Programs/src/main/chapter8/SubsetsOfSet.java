package main.chapter8;

import java.util.ArrayList;

/**
 * Return all subsets of a set.
 */
public class SubsetsOfSet {
    static int[] array = {1,2,3};
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<ArrayList<Integer>> allList = recursive(list, 0);
        for(ArrayList<Integer> set : allList){
            String path = "";
            for(int i : set){
                path += i + " ";
            }
            System.out.println(path);
        }

    }

    private static ArrayList<ArrayList<Integer>> recursive(ArrayList<Integer> list, int index){
        ArrayList<ArrayList<Integer>> allsubsets;
        if(list.size() == index){
            allsubsets = new ArrayList<ArrayList<Integer>>();
            list = new ArrayList<Integer>(); //empty set
            allsubsets.add(list);

        }else{
            allsubsets = recursive(list, index+1);
            int element = list.get(index);
            ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
            for(ArrayList<Integer> set : allsubsets){
                ArrayList<Integer> subset = new ArrayList<Integer>();
                subset.addAll(set);
                subset.add(element);
                moresubsets.add(subset);
            }
            allsubsets.addAll(moresubsets);
        }
        return allsubsets;


    }
}
