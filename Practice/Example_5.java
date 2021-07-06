package Practice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_5 {
	public static void main(String[] args){
		Opensite os = new Opensite();
		WebDriver driver = os.Open();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement Radio_example = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"basic\"]/div/a[3]")));
		Radio_example.click();
		List <WebElement> radio_1 =  driver.findElements(By.xpath("//div[@class=\"col-md-6 text-left\"]//input[@name=\"optradio\"]"));
	    Scanner ob = new Scanner(System.in);
		int size = radio_1.size(),i;
	    String gender,value,S_age,value_1;
	    int age;
	    System.out.println("Enter your gender(Male/Female)");
	    gender = ob.nextLine();
	    for(i=0;i<size;i++) {
			value = radio_1.get(i).getAttribute("value");
			if(value.equalsIgnoreCase(gender)) {
				radio_1.get(i).click();
			}
		}
	  WebElement checkall = driver.findElement(By.xpath("//button[@id=\"buttoncheck\"]"));
	  checkall.click();
//--------------------------------------------------------------------------------------------------------------------------------------
	   List <WebElement> gender_radio =  driver.findElements(By.xpath("//div//input[@name=\"gender\"]"));
	   List <WebElement> age_radio =  driver.findElements(By.xpath("//div//input[@name=\"ageGroup\"]"));
	   int g_size = gender_radio.size(),a_size = age_radio.size();
	   System.out.println("Enter your gender(Male/Female)");
	   gender = ob.nextLine();
	   System.out.println("Enter Your Age");
	   age = ob.nextInt();
	   if(0 < age && age < 5) {
		   S_age = "0 - 5";
	   }
	   else if(5 <= age && age < 15) {
		   S_age = "5 - 15";
	   }
	   else {
		   S_age = "15 - 50";
	   }
	   for(i=0;i<g_size;i++) {
		 value = gender_radio.get(i).getAttribute("value");
		 
		 if(value.equalsIgnoreCase(gender)) {
			gender_radio.get(i).click();
		 }
	   }
	   for(i=0;i<a_size;i++) {
		 value_1=age_radio.get(i).getAttribute("value");
		 if(value_1.equalsIgnoreCase(S_age)){
			age_radio.get(i).click();
		 }
		}
	   List <WebElement> submit_2 =  driver.findElements(By.xpath("//button[@class=\"btn btn-default\"]"));
	   submit_2.get(1).click();	
	}
}
