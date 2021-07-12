package Task_8;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main(String [] args) throws Exception {
		Randomsite rs = new Randomsite();
		Modifyxlsx mx = new Modifyxlsx();
		
		mx.Create_newSheet();
		
		WebDriver driver = rs.open_site();
		driver = rs.Set_values(driver);
		rs.Get_set(driver);
	}
}
