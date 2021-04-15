package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test0 {
	@Test
	public void demo() {
		Reporter.log("hello java",true);
		Reporter.log("hello selenium",true);
		Reporter.log("hello python",true);
		Reporter.log("hello appium",true);
		Reporter.log("hello api",true);
	}

}
