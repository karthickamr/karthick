package org.testleaf.ZoomCars.pages;

import org.openqa.selenium.By;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class HomePageZoom extends ProjectSpecificMethods {
	public StartPage clickStart()
	 {
		 driver.findElementByClassName("search").click();
		 return new StartPage();
	 }
}
