package com.hashcollections;

import java.util.HashSet;
import java.util.Set;

class Car {
	String model;
	String color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	
	
}

public class Ex1 {
	public static void main(String[] args) {

		Car car1 = new Car("BMW", "white");
		Car car2 = new Car("Audi", "white");

		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());

		System.out.println(car2.equals(car1));

		Set<Car> cars = new HashSet<>();
		cars.add(car1);
		cars.add(car2);

		System.out.println(cars.size());
	}
}
