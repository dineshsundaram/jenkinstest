package Hue;

import cucumber.api.java.en.When;

public class step1 {

	@When("^Invoke the Hue$")
	public void checka() throws InterruptedException
	{
		sample1 s1=new sample1();
		s1.check();
	}
}
