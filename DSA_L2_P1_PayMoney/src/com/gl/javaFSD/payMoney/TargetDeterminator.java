package com.gl.javaFSD.payMoney;

import java.util.Arrays;

public class TargetDeterminator {
	private int[] transactions;
	private int dailyTarget;
	private boolean outcome;
	TargetDeterminator(int[] trans, int target){
		this.transactions=trans;
		this.dailyTarget=target;
	}
//	public int[] getTransactions() {
//		return transactions;
//	}
//	public void setTransactions(int[] transactions) {
//		this.transactions = transactions;
//	}
//	public int getDailyTarget() {
//		return dailyTarget;
//	}
//	public void setDailyTarget(int dailyTarget) {
//		this.dailyTarget = dailyTarget;
//	}
//	public boolean isOutcome() {
//		return outcome;
//	}
//	public void setOutcome(boolean outcome) {
//		this.outcome = outcome;
//	}
	
	void determine() {
		int tempSum=0;
		int counter=0;
		for(int i=0;i<transactions.length;i++) {
			int transactionValues=transactions[i];
			tempSum=tempSum+transactionValues;
			if(tempSum>=dailyTarget) {
				outcome=true;
				counter=i+1;
				break;
			}
			
		}
		if(outcome==true) {
			System.out.println(String.format("Daily Target of %d is achieved after"
					+ " %d transactions\nFrom the Transactions List [%s]", dailyTarget,counter,Arrays.toString(transactions)));
		}else {
			System.out.println(String.format("Daily Target of %d cannot be achived "
					+ "\nFrom the Transactions List [%s]",dailyTarget,Arrays.toString(transactions)));
		}
		
	}
}
