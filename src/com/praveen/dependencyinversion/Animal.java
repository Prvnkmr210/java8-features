package com.praveen.dependencyinversion;

public abstract class Animal {
	
	void eat() {
		System.out.println("Animal eats");;
	}
	
	abstract void sleep();

}
