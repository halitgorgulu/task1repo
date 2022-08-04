import org.junit.Assert;
import org.junit.Test;

public class Task1Test {
    @Test //1 layer test
    public void testTreeWithStars() {
        Assert.assertEquals("*\n",Task1.treeWithStars("1"));
    }


    @Test //2 layer test
    public void testTreeWithStars2() {
        Assert.assertEquals(" *\n***\n",Task1.treeWithStars("2"));
    }

    @Test //string input test
    public void testTreeWithStars3() {
        Assert.assertEquals("That's wrong input!!",Task1.treeWithStars("a"));
    }

    @Test //q test
    public void testTreeWithStars4() {
        Assert.assertEquals("Program terminating..",Task1.treeWithStars("q"));
    }

    @Test //quit test
    public void testTreeWithStars5() {
        Assert.assertEquals("Program terminating..",Task1.treeWithStars("quit"));
    }

    @Test //negative integer test
    public void testTreeWithStars6() {
        Assert.assertEquals("That's wrong input!!",Task1.treeWithStars("-1"));
    }
}

