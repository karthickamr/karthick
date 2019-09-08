package org.testleaf.ZoomCars.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class CarBookPage extends ProjectSpecificMethods{

	public CarBookPage clicksort() {
		driver.findElement(By.xpath("//div[text()=' Price: High to Low ']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return this;

	}

	public CarBookPage getFirstCarName() {
		String gettext = driver.findElement(By.xpath("(//div[@class='details']//h3)[1]")).getText();
		System.out.println(gettext);
		return this;
	}
}
