package com.ktds.dojun;

public class Main {

	public void start() {

		Guest guest = new Guest(10000);

		Staff staff = new Staff(50000);
		Chef chef = new Chef(100, 100, 100, 100);

		guest.order(staff, 10000);
		
		if (staff.getDone() > 0) {
	staff.giveList(chef);}
		
			
	}
	
	public static void main(String[] args) {
		new Main().start();
	}

}