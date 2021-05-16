import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class SmokeTest1 {
    private static Logger logger= Logger.getLogger(SmokeTest1.class);


    @Test(groups = {"p2"})
    public void smokeTest1_2() {
        logger.info("Entering to SmokeTest1_2");
        Assert.assertTrue(3>2,"3>2 is true");
        logger.info("Exiting from SmokeTest1_2");
    }
    @Test(groups = {"p1","p2"})
    public void smokeTest1_1() {
        logger.info("Entering to SmokeTest1_1");
        Assert.assertFalse( 1>2,"1>2 is false");
        logger.info("Exiting from SmokeTest1_1");
    }
    @Test(groups = {"p1","p2"})
    public void smokeTest1_3() {
        logger.info("Entering to SmokeTest1_3");
        Assert.assertFalse( 1>2,"1>2 is false");
        logger.info("Exiting from SmokeTest1_3");
    }
    @BeforeSuite
    public void beforeSuit(){
        BasicConfigurator.configure();
        logger.info("Entering to Suite");
    }

}
