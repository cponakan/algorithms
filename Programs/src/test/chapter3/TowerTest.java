package test.chapter3;

import junit.framework.Assert;
import main.chapter3.Tower;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/22/13
 * Time: 3:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class TowerTest {

    @Test
    public void testTowerOfHanoii(){
        Tower[] towers = new Tower[3];
        for (int i = 0; i < 3; i++) {
            towers[i] = new Tower(i);
        }
        int n =12;
        for (int i = n-1; i >= 0; i--) {
            towers[0].add(i);
        }
        towers[0].moveDisks(n, towers[2], towers[1]);
        for (int i = 0; i <n; i++) {
            Assert.assertEquals(i, towers[2].remove());
        }
    }
}
