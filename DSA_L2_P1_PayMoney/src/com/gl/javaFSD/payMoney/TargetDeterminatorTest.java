package com.gl.javaFSD.payMoney;

public class TargetDeterminatorTest {
	static void test(int[] transactions,int dailytar) {
		System.out.println("------");
		TargetDeterminator ob=new TargetDeterminator(transactions,dailytar);
		ob.determine();
	}
	public static void main(String[] args) {
		test(new int[] {20,12,31},19);
		test(new int[] {100},101);
		test(new int[] {20,70,9},101);
		test(new int[] {5,20,32,12},57);
		test(new int[] {5,20,32,12},58);		
	}
}