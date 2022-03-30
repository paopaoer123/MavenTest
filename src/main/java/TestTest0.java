


import org.testng.annotations.Test;
public class TestTest0 {

    @Test(timeOut = 5000) // time in mulliseconds
    public void testThisShouldPass() throws InterruptedException {
        Thread.sleep(4000);
    }

    @Test(timeOut = 6000)
    public void testThisShouldFail() throws InterruptedException {
        Thread.sleep(4000);
    }
}


