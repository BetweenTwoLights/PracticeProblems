package com.b2lights.practiceproblems.simplecalc;

public class SimpleCalculations {
	
	private int numb1, numb2;

	public SimpleCalculations(int numb1, int numb2) {
		super();
		this.numb1 = numb1;
		this.numb2 = numb2;
	}

	public int getNumb1() {
		return numb1;
	}

	public void setNumb1(int numb1) {
		this.numb1 = numb1;
	}

	public int getNumb2() {
		return numb2;
	}

	public void setNumb2(int numb2) {
		this.numb2 = numb2;
	}
	
	public int addNums() {
		int solution = numb1 + numb2;
		
		return solution;
	}
	
	public int subNums() {
		int solution = numb1 - numb2;
		
		return solution;
	}
	
	public int multNums() {
		int solution = numb1 * numb2;
		
		return solution;
	}
	
	public int divNums() {
		int solution = numb1 / numb2;
		
		return solution;
	}

	@Override
	public String toString() {
		return "SimpleCalculations [numb1=" + numb1 + ", numb2=" + numb2 + "]";
	}
	
	

}
