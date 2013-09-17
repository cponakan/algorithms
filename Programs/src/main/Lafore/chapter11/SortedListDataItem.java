package main.Lafore.chapter11;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/20/13
 * Time: 3:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class SortedListDataItem {
    private LinkDataItem first;

    public void insert(LinkDataItem linkDataItem) // insert link, in order
    {
        if(first == null){
            first = linkDataItem;
        } else{
            LinkDataItem current = first;
            int key = linkDataItem.getKey();
            LinkDataItem previous = null;
            while(current!=null && current.getKey()< key){
                previous = current;
                current = current.next;
            }
            previous.next = linkDataItem;
            linkDataItem.next = current;
        }
    }

    public LinkDataItem find(int key){
        LinkDataItem current = first;
        LinkDataItem item = null;
        while(current!= null && current.getKey() <= key){
            if(current.getKey() == key){
                return current;
            }
            current = current.next;

        }

        return null;
    }

    public void remove(int key){
        LinkDataItem current = first;
        LinkDataItem previous = null;
        while(current!= null && current.getKey() <= key){
            previous = current;
            current = current.next;

        }
        if(previous == null){
            // if first node is to be deleted
            first = first.next;
        }
        else{
            if(current.getKey() == key){
                previous.next = current.next;
            }
        }
    }
}
