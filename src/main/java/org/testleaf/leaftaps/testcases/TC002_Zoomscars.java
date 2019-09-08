package org.testleaf.leaftaps.testcases;

import org.testleaf.ZoomCars.pages.HomePageZoom;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.Test;

public class TC002_Zoomscars extends ProjectSpecificMethods {
	@Test
	public void runTC002() {
		
		new HomePageZoom().clickStart().clickthuraipakkam().clickNext().clickTomorrow().clickNext().clickDone()
		/*.clicksort().getFirstCarName()*/;
	}
	
}
