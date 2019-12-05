package algorithms.chapter1;

import org.junit.Assert;
import org.junit.Test;

public class GcdDemoTest {

    @Test
    public void gcdTest() {
        Assert.assertEquals(GcdDemo.calc(3, 2), 1);
        Assert.assertEquals(GcdDemo.calc(120, 60), 60);
        Assert.assertEquals(GcdDemo.calc(30, 20), 10);
        Assert.assertEquals(GcdDemo.calc(10, 8), 2);
        Assert.assertEquals(GcdDemo.calc(6, 3), 3);
    }
}
