package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectImplementation{

	@Test(dataProvider="CreateLead")
	public  void runCreateLead(String cname,String firstname, String lastname) {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(name="CreateLead")
	public String[][] sendData() {
		
		String[][] data=new String[2][3];
		
		data[0][0]="TestLeaf";
		data[0][1]="Hari";
		data[0][2]="R";
		
		data[1][0]="Oasys";
		data[1][1]="jenni";
		data[1][2]="jason";
		return data;		
				
	}
	
	
	
}






