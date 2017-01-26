package com.ktds.dojun;

public class OilBank {

	private int oilStock;

	private int pricePerLiter;

	private int budget;

	public void setOilStock(int oilStock) {
		this.oilStock = oilStock;
	}

	public int getOilStock() {
		return oilStock;
	}

	public void setPricePerLiter(int pricePerLiter) {
		this.pricePerLiter = pricePerLiter;
	}

	public int getPricePerLiter() {
		return pricePerLiter;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getBudget() {
		return budget;
	}

	public void fill(Car car) {// car는 car 인스턴스(메인에서 만들어줌)

		this.oilStock -= car.getOilTankVolume();
		System.out.println(this);
		car.fillOill(this); // oilBank인 나를 넘기겠다.
		this.budget += (pricePerLiter * car.getOilTankVolume());

	}

}
