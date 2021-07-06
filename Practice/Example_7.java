package Practice;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_7 {
	public static void main(String [] args){
		Scanner ob = new Scanner(System.in);
		Opensite os = new Opensite();
		WebDriver driver = os.Open();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement dropdown_example = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"basic\"]/div/a[4]")));
		dropdown_example.click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"select-demo\"]"));
		Select option = new Select(dropdown);
		System.out.println("Enter today's day");
		String day = ob.nextLine();
		option.selectByValue(day);
		
	}
}
