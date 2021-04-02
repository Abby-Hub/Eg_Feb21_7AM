package com.sample;

public class Ball extends Toy {
	@Override
	public void move() {
		System.out.println("Logic to Bouncing up & Down");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Logic to make Ball Sound");
	}
	

}
