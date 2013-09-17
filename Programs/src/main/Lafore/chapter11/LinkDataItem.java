package main.Lafore.chapter11;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/20/13
 * Time: 3:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkDataItem {
    private int key;
    public LinkDataItem next;

    public LinkDataItem(int key){
        this.key = key;
    }

    public int getKey(){
        return this.key;
    }
}
