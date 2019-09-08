package org.testleaf.ZoomCars.pages;

import org.openqa.selenium.By;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class PickupPage extends ProjectSpecificMethods{

	public PickupPage clickTomorrow()
	{
		driver.findElement(By.xpath("//div[contains(@class,'day picked')]")).click();
		return this;
	}
	
	public DropofPage clickNext()
	{
		driver.findElement(By.className("proceed")).click();
		return new DropofPage();
	}

}
