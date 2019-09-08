package org.testleaf.ZoomCars.pages;

import org.openqa.selenium.By;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class StartPage extends ProjectSpecificMethods {

	public StartPage clickthuraipakkam()
	{
		driver.findElement(By.xpath("(//div[@class='items'])[1]")).click();
		return this;

	}

	public PickupPage clickNext()
	{
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		return new PickupPage();

	}
}
