package test.cases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void passTestCase() {
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void failTestCase() {
		Assert.assertEquals(true,true);
	}
}
