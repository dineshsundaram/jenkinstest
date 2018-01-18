package Hue;

import cucumber.api.java.en.When;

public class step {

	@When("^Invoke Hue$")
	public void checka() throws InterruptedException
	{
		sample1 s1=new sample1();
		s1.check();
	}
}
