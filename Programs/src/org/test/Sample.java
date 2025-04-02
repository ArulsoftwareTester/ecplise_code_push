package org.test;

public class Sample {
	static {
		System.out.print("6");
	}
	{
		System.out.print("2");
	}
	public Sample() {
		System.out.print("3");
	}

}
