package com.gl.javaFSD.denominations;
public class DenomCalc {
private int[] denominations;
private int paymentAmount;
private boolean outcome;

public DenomCalc(int[] denominations, int paymentAmount) {
	this.denominations = denominations;
	this.paymentAmount = paymentAmount;
}
public void calculate() {
	performSort();
	StringBuilder result = new StringBuilder();
	result.append(String.format("Amount to pay : %d", paymentAmount));
	result.append(System.getProperty("line.separator"));
	int tempAmount = paymentAmount;       
try {
	for (int index=0; index< denominations.length; index++) {
		int quotient;
		int remainder;
		int denominationValue = denominations[index];
//		if(denominationValue==0) {
//			quotient=0;	
//			remainder=0;
//			}else{
				quotient = tempAmount /denominationValue;
				remainder = tempAmount %denominationValue;        
//				}
		if (quotient == 0) {                  
			// This denomination cannot be considered for the final outcome                   
		}else {
			result.append(String.format("Denomination : %d, Count : %d",denominationValue, quotient));
			result.append(System.getProperty("line.separator"));
			tempAmount = remainder;
		}
		if (remainder == 0) {
			this.outcome = true;
			break;
		}
	}  
} catch (ArithmeticException arithmeticException) {
	arithmeticException.printStackTrace();
	}
	if (outcome) {
		System.out.println("Success");
		System.out.println(result);
		}else {
			System.out.println("Failure");
			result.append(String.format("Unable to provide denomination for the balance amount of %d",tempAmount));
			System.out.println(result);
			}
	}
	public void performSort() {
		MergeSorting descSorter = new MergeSorting();
		descSorter.mergeSort(denominations, 0, denominations.length - 1);
		}	
}