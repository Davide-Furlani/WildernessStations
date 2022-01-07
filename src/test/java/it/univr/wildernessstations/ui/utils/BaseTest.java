	package it.univr.wildernessstations.ui.utils;

	import java.util.concurrent.TimeUnit;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.runner.RunWith;
	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.firefox.FirefoxDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.firefox.FirefoxOptions;
	import org.openqa.selenium.firefox.FirefoxProfile;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.test.context.junit4.SpringRunner;

	@RunWith(SpringRunner.class)
	@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
	public class BaseTest {

		protected static WebDriver driver;
		// we skip the welcome page
		protected static String URL = "http://localhost:8080/homepage";

		@Before
		public void setUp(){
			driver = getDriver();
			driver.get(URL);
		}

		@After
		public void tearDown() {
			driver.quit();
			driver = null;
		}

		public static WebDriver getDriver() {
			if (driver == null) {
				WebDriverManager.firefoxdriver().setup();

				FirefoxProfile profile = new FirefoxProfile();
				FirefoxOptions firefoxOptions = new FirefoxOptions();
				firefoxOptions.setCapability("marionette", true);
				firefoxOptions.setProfile(profile);
				firefoxOptions.setHeadless(true);

				driver = new FirefoxDriver(firefoxOptions);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
				driver.get(URL);
			}
			return driver;
		}

	}
