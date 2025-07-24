package stepdefinations;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class MovieBooking {

	WebDriver driver;
	WebDriverWait wait;

	@Given("User is on the HomePage of BookMyShow")
	public void user_is_on_the_home_page_of_book_my_show() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://in.bookmyshow.com/");

	}

	@When("User selects city as {string}")
	public void user_selects_city_as(String city) throws TimeoutException {
		// Wait for the animation overlay to disappear
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(
//		    By.xpath("//img[@alt='PUNE']")));
		
		WebElement cityElement = wait.until(ExpectedConditions.elementToBeClickable(
		        By.xpath("//img[@alt='PUNE']")));
		
		try {
			cityElement.click();
		}
 catch (ElementClickInterceptedException e) {
		    System.out.println("⚠️ Click intercepted, using JavaScript fallback for: " + city);
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cityElement);
		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", cityElement);
		}
	}

	@And("User searches for movie {string}")
	public void user_searches_for_movie(String moviename) {

		WebElement searchBox = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Saiyaara')]")));

		searchBox.click();

	}

	@And("User selects the movie from the list")
	public void user_selects_the_movie_from_the_list() {
		WebElement selectMovie = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='sc-1vmod7e-2 ixpVNC'])[1]")));

		selectMovie.click();

	}

	@Then("User should see the show timings")
	public void user_should_see_the_show_timings() {

		WebElement bookTicket = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Book tickets')])[1]")));

		bookTicket.click();
	}
}
