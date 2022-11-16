package com.training_dgv.spring_demo;

public class Help {
	private Staff staff;
	public Help(Staff staff) {
		this.staff = staff;
	}
	
	public void print() {
		staff.print();
	}

	public Staff getStaff() {
		return staff;
	}	
	
}
