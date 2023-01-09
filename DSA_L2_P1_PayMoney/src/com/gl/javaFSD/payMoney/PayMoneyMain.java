package com.gl.javaFSD.payMoney;
import java.util.Scanner;
public class PayMoneyMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size=sc.nextInt();
		System.out.println("Enter the values of array");
		int arrr[]=new int[size];

		for(int i=0;i<size;i++) {
			arrr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int times=sc.nextInt();
		for(int i=0;i<times;i++) {
		System.out.println("Enter the value of target "+(i+1));
		int targ=sc.nextInt();
		
		TargetDeterminator nw= new TargetDeterminator(arrr,targ);
		nw.determine();
		}
		sc.close();
	}
}
