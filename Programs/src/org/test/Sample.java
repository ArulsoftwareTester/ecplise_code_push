package org.test;

public class Sample {
	static {
		System.out.print("6");
	}
	{
		System.out.print("2");
	}
	public Sample() {
		System.out.print("4");
		System.out.println("5");
		System.out.println("6");
		//TEST
	}

}
