import org.junit.Assert;
import org.junit.Test;


public class ListTest {

    @Test
    public void testAddToEndList(){
        CustomList<Integer> integerList = new CustomList<>();
        integerList.addToEnd(1);
        integerList.addToEnd(3);
        integerList.addToEnd(6);
        Assert.assertEquals("1 -> 3 -> 6", integerList.print());
    }

    @Test
    public void testAddToStartList(){
        CustomList<Integer> integerList = new CustomList<>();
        integerList.addToStart(1);
        integerList.addToStart(3);
        integerList.addToStart(6);
        Assert.assertEquals("6 -> 3 -> 1", integerList.print());
    }

    @Test
    public void checkPreMax() throws Exception {
        Assert.assertNull(Premax.premax(new int[]{5,5,5,5,5}));
        Assert.assertNull(Premax.premax(new int[]{1}));
        Assert.assertNull(Premax.premax(new int[10]));
        Assert.assertEquals(5, (int)Premax.premax(new int[]{5,6,5,5,5}));
        Assert.assertEquals(-2, (int)Premax.premax(new int[]{-1,-2,-3,-5,-6}));
        Assert.assertEquals(-3, (int)Premax.premax(new int[]{-6,-5,-4,-3,-2}));
        Assert.assertEquals(1, (int)Premax.premax(new int[]{1, 5, 5}));
        Assert.assertEquals(1, (int)Premax.premax(new int[]{5, 5, 1}));
        Assert.assertEquals(2, (int)Premax.premax(new int[]{1, 2, 3}));
        Assert.assertEquals(2, (int)Premax.premax(new int[]{3, 2, 1}));
        Assert.assertEquals(2, (int)Premax.premax(new int[]{-6,-5,-4, 3, 2}));
    }
}
