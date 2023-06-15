package net.hb.day0615;

import java.util.Calendar;

public class Test4Calender {

	public static void main(String[] args) {
		//추상클래스 Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.toString());
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.DAY_OF_MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH); //5
		int dw = cal.get(Calendar.DAY_OF_WEEK); //5
		System.out.println(year+"년 "+month+"월 "+day+"일 "+dw+"요일");
		
		String msg = "";
		if(dw==1) {
			msg="일요일";
		}
		else if(dw==2) {
			msg="월요일";
		}	
		else if(dw==3) {
			msg="화요일";
		}
		else if(dw==4) {
			msg="수요일";
		}
		else if(dw==5) {
			msg="목요일";
		}
		else if(dw==6) {
			msg="금요일";
		}
		else if(dw==7) {
			msg="토요일";
		}
		else {
			
		}
		
		System.out.println(year+"년 "+month+"월 "+day+"일 "+msg );
		
		
	}//main end
}//class END
