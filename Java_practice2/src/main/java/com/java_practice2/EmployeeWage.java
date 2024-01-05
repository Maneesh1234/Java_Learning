package com.java_practice2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeWage {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage");
		Scanner sc = new Scanner(System.in);
		double isPresent=Math.random();
		if (isPresent>0.5) {
			System.out.println("Employee is present");
			System.out.println("Enter number for part time 2 and fulltime 1");
			
			int check=sc.nextInt();
			switch (check) {
			case 1:
				System.out.print("Full day wage for Employee is : ");
				System.out.println(8*20);
				break;
			case 2:
				System.out.print("Part day wage for Employee is : ");
				System.out.println(8*20);
				break;

			default:
				System.out.println("Input is not valid");
				break;
			}
		}
		else {
			System.out.println("Employee is not present");
		}
		System.out.println("Enter hour of all days ");
		ArrayList<Integer> hourofDays= new ArrayList<Integer>();
		int i=0;
		int totalhour=0;
		while(i<20 && totalhour<200) {	
			int h=sc.nextInt();
			hourofDays.add(h);
			totalhour+=h;
			i+=1;
		}
		Iterator<Integer> it=hourofDays.iterator();
		totalhour=0;
		while (it.hasNext()) {
			totalhour+=it.next();	
		}
		System.out.println("Total wage is");
		System.out.println(totalhour*20);
		
		
		
//		System.out.println("Enter number of hour employee worked");
//		Scanner sc = new Scanner(System.in);
//		int hour=sc.nextInt();
		
		
	}

}
