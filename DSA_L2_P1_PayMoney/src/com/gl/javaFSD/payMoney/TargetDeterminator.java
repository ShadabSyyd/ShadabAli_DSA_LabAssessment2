package com.gl.javaFSD.payMoney;

public class TargetDeterminator {
	private int[] transactions;
	private int dailyTarget;
	private boolean outcome;
	TargetDeterminator(int[] trans, int target){
		this.transactions=trans;
		this.dailyTarget=target;
	}
	public int[] getTransactions() {
		return transactions;
	}
	public void setTransactions(int[] transactions) {
		this.transactions = transactions;
	}
	public int getDailyTarget() {
		return dailyTarget;
	}
	public void setDailyTarget(int dailyTarget) {
		this.dailyTarget = dailyTarget;
	}
	public boolean isOutcome() {
		return outcome;
	}
	public void setOutcome(boolean outcome) {
		this.outcome = outcome;
	}
	
}
