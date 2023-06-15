package net.hb.day0615;

public class Emp {

	public static void main(String[] args) {
		//https://docs.oracle.com/javase/7/docs/api/index.html
		//469페이지~471페이지 String클래스 메소드
		String jumin="970624-2981647";
		//문제1 7번째숫자 1/3남자 2/4여자 당신은 여자입니다 charAt()
		char gender = jumin.charAt(7);
		char[] men = {'1','3'};
		char[] women = {'2','4'};
		if(gender == '1' || gender== '3') {
			System.out.println("남자입니다");
		}
		else if(gender == '2' || gender== '4') {
			System.out.println("여자입니다");
		}
		else {
			System.out.println("다시입력해주세요");
		}
		
		//문제2 생일 당신의 생일은 06월 24일 입니다. substring()
		String month = jumin.substring(2,4);
		String day = jumin.substring(4,6);
		System.out.println("당신의 생일은 " + month + "월 " + day + "일" + " 입니다");
		
		//문제3 ******-2981647 (문의전화 1588-9987)
		//아닙니다System.out.pirnln("******-2981657");
		String[] privacy = jumin.split("-");
//		System.out.println(privacy[0]);
//		System.out.println(privacy[1]);
		String star= "";
		star = privacy[0].replace(privacy[0],"******");
		System.out.println(star + "-" + privacy[1]);
		
		
		
		//
		
		
			

	}//main end
}//class End
