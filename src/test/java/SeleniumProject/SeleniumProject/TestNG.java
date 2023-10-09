package SeleniumProject.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {
	public WebDriver driver;

	@Test(enabled = true)
	public void hardAssertionTest() {

		// Assertion Passing
		Assert.assertTrue(1 + 2 == 3);
		System.out.println("Passing 1");
		System.out.println("Assertion Passed and execution of code countinue");

		// Assertion failing
		Assert.fail("Failing second assertion");
		System.out.println("Failing 2");
		System.out.println("Assertion Failed and execution of code Exit");

	}

	@Test(enabled = false)
	public void verifyORsoftAssertionTest() {

		// Creating softAssert object
		SoftAssert softAssert = new SoftAssert();

		// Assertion failing
		softAssert.fail("softAssert Failing first assertion");
		System.out.println("softAssert Failing 1");
		System.out.println("softAssert Assertion Failed and execution of code countinue");

		// Assertion failing
		softAssert.fail("softAssert Failing second assertion");
		System.out.println("softAssert Failing 2");
		System.out.println("softAssert Assertion Failed and execution of code countinue");
		// Collates the assertion results and marks test as pass or fail
		softAssert.assertAll();
	}

	@Test(enabled = false)
	public void verifyORsoftAssertionTest1() {
		SoftAssert softAssert = new SoftAssert();

		// Assertion failing
		softAssert.fail();
		System.out.println("Failing");
		// Assertion passing
		softAssert.assertEquals(1, 1);
		System.out.println("Passing");
		// Collates test results and marks them pass or fail
		// softAssert.assertAll();
	}

	@Test(enabled = false)
	public void softAssertion() {
		try {
			SoftAssert softAssert = new SoftAssert();

			softAssert.assertTrue(2 > 1);
			System.out.println("Assertion passed in Test 1");

			softAssert.assertFalse(1 < 2);
			System.out.println("Assertion passed in Test 2");

			softAssert.assertEquals("Sample", "Sample");
			System.out.println("Assertion Passed in Test 3");
			// softAssert.assertAll();
		} catch (AssertionError ae) {
			ae.printStackTrace();
		}

	}

// How to fail a testNG test if it doesn’t get executed within a specified time?
	@Test(timeOut = 1000, enabled = false)
	public void timeOutTest() throws InterruptedException {
		// Sleep for 2sec so that test will fail
		Thread.sleep(2000);
		System.out.println("Will throw Timeout exception!");
	}

// How can we skip a test case conditionally?
	@Test(enabled = false)
	public void skipException() {
		if (1 + 2 == 3)
			System.out.println("if else block");
		throw new SkipException("Skipping the test");
		// System.out.println("Skipped");
	}

// How can we make one test method dependent on others using TestNG?	
	@Test(dependsOnMethods = { "methodB" }, enabled = false)
	public void methpdA() {
		if (1 + 2 == 3)
			System.out.println("Condition True");
		System.out.println("Method A");

	}

	@Test(enabled = false)
	public void methodB() {

		System.out.println("Method B");
		System.out.println("Skipped");
	}

// How can we run the same test multiple times?
	@Test(invocationCount = 10, enabled = false)
	public void invocationCountTest() {

		int a = 5;
		System.out.println(a * 2);

	}
// How can we use the threadPoolSize
	/*
	 * The threadPoolSize is an attribute of the @Test annotation. This attribute
	 * informs TestNG how many threads should testng spawn for the current @Test
	 * annotated test method. This attribute is relevant only when you use the
	 * invocationCount attribute of the @Test annotation
	 */

	@Test(threadPoolSize = 5, invocationCount = 10, enabled = false)
	public void threadPoolTest() {
		System.out.println("Thread");
	}

	@Test(invocationCount = 10, threadPoolSize = 5, enabled = false)
	public void loadTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		this.driver = new ChromeDriver(options);
		options.addArguments("--disable-notification");
		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
		driver.get("http://www.google.com");
		System.out.println("\n Page Title is " + driver.getTitle());
		Thread.sleep(1000);
		System.out.printf("%n[END] Thread Id : %s", Thread.currentThread().getId());
		driver.close();

	}

	/*
	 * Why we use parameter annotation in test ? Parameters are freely configurable
	 * input values that can be assigned to different test types and used in a
	 * variety of ways. They help to define tests by defining test data.
	 */
	@Test(enabled = false)
	@Parameters({ "a", "b" })
	public void add(int a, int b) {

		a = a + b;
		System.out.println("SUM is " + a);

	}

	@Test(enabled = false)
	@Parameters({ "a", "b" })
	public void sub(int a, int b) {

		a = a - b;
		System.out.println("SUB is " + a);

	}

	@Test(enabled = false)
	@Parameters({ "a", "b" })
	public void mul(int a, int b) {

		a = a * b;
		System.out.println("MUL is " + a);

	}

	/*
	 * How can we create data-driven framework using TestNG? Data provider returning
	 * 2D array of matrix DataProvider helps with data-driven test cases that carry
	 * the same methods but can be run multiple times with different data sets. It
	 * also helps in providing complex parameters to the test methods
	 */
	@DataProvider(name = "dataProvider1")
	public Object[][] dataProviderMethod1() {
		return new Object[][] { { "Susil", "Agrawal" }, { "k1", "r1" }, { "k2", "r2" } };
	}

	/*
	 * This method is bound to the above data provider returning 2D array of 3*2
	 * matrix The test case will run 3 times with different set of values
	 **/
	@Test(dataProvider = "dataProvider1", enabled = false)
	public void sampleTest(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}
}
