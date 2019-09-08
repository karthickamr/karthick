package org.testleaf.ZoomCars.pages;

import org.openqa.selenium.By;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class DropofPage extends ProjectSpecificMethods {
	
public CarBookPage clickDone()
	
	{
		driver.findElement(By.className("proceed")).click();
		return new CarBookPage();
		
	}
	
	

}
