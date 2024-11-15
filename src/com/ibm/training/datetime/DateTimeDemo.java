package com.ibm.training.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeDemo {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println("Today is "+today.getDayOfWeek()+" "+today.getDayOfMonth()+" of "+today.getMonth().name());
		System.out.println("Today is "+today.getDayOfYear()+" day of the year");
		
		System.out.println(today.format(DateTimeFormatter.ofPattern("E dd/MM/yyyy")));
		
		LocalDate aMonthFromToday = today.plusMonths(1);
		System.out.println("A month from today will be "+aMonthFromToday.getDayOfWeek()+" "+aMonthFromToday.getDayOfMonth()+" of "+aMonthFromToday.getMonth().name());
		System.out.println("A month from today will be "+aMonthFromToday.getDayOfYear()+" day of the year");

		Scanner kb = new Scanner(System.in);
		//System.out.println("Enter your birthday (yyyy-MM-dd): ");
		System.out.println("Enter your birthday (dd/MM/yyyy): ");
		String strBDay = kb.nextLine();
		
		LocalDate birthDay = LocalDate.parse(strBDay,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println("You were born on "+birthDay.getDayOfWeek()+" "+birthDay.getDayOfMonth()+" of "+birthDay.getMonth().name());
		System.out.println("You were born on "+birthDay.getDayOfYear()+" day of the year");
		
		Period p = Period.between(birthDay, today);
		
		System.out.println("You are "+p.getYears()+" years, "+p.getMonths()+" months and "+p.getDays()+" days old!");
	}

}
