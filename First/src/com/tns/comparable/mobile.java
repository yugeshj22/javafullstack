package com.tns.comparable;

public abstract class mobile implements Comparable{
	private String brand ;
	private int cost;
	private  int gen ;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getGen() {
		return gen;
	}
	public void setGen(int gen) {
		this.gen = gen;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", cost=" + cost + ", gen=" + gen + "]";
	}
	
}
