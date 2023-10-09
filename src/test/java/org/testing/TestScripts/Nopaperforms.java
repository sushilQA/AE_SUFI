package org.testing.TestScripts;

import java.io.IOException;
import org.testing.Base.BaseClass;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.ExcelDataRead;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class Nopaperforms extends BaseClass {

	@Test(enabled = true, priority = 1)
	public void tc1Method() throws InterruptedException, IOException, BiffException {
		Login login = new Login(properties, driver);
		Logout logout = new Logout(properties, driver);
	}

	@AfterClass
	public void afterClass() {
		System.out.println("TC1 Executed Successfully");
	}

}
