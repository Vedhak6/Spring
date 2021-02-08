package com.xworkz.projector.custom;

import java.util.ArrayList;

public class EmployeeAL {
	private ArrayList<Employee> empAL;

	public void setEmpAL(ArrayList<Employee> empAL) {
		this.empAL = empAL;
	}

	@Override
	public String toString() {
		return "EmployeeAL [empAL=" + empAL + "]";
	}

}
