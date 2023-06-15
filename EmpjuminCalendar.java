package net.hb.day0615;

import java.util.Calendar;

public class EmpjuminCalendar {

	public static void main(String[] args) {
		String jumin="971030-1981647";
		System.out.println(jumin);
		
		Calendar cal = Calendar.getInstance();
		int nowyear = cal.get(Calendar.YEAR);//2023-2000=나이
		char gender = jumin.charAt(7);
		int myyear = Integer.parseInt(jumin.substring(0,2)); //"97"형태를 숫자 97
		
		int age=1;
		switch(gender) {
			case '1': age=nowyear-(1900+myyear) ; break;
			case '2': age=nowyear-(1900+myyear) ; break;
			case '3': age=nowyear-(2000+myyear) ; break;
			case '4': age=nowyear-(2000+myyear) ; break;
//			default: break;
		}
		System.out.println("당신의 나이는" + age + "세 입니다");
		
		 
		
		
		//문제1
		//if, switch
	}//main end
}//class End
