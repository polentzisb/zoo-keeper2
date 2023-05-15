package com.polentzi.zookeeper2;

public class Bat extends Mammal {
	
	public Bat() {
	this.energyLevel = 300;
	}
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("flying");
		displayEnergy();
	}
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("namnamnamanamnam");
		displayEnergy();
	}
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("town has been attack");
		displayEnergy();
	}
}