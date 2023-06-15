package net.hb.day0615;

public class Empjumin {

	public static void main(String[] args) {
		String jumin="971030-1981647";
		
		String star="";
		for(int i=0; i<6; i++) {star = star + "*";}
		
		int pos = jumin.indexOf("-");
//		System.out.println("- 위치 " + pos+1 + "번째");
		String data1 = jumin.substring(pos+1); //7번째부터 마지막 가져옴
		String data2 = jumin.substring(jumin.indexOf("-")+1 ); //7번째부터 마지막 가져옴
//		System.out.println(data);
		
		
		System.out.println(star + (jumin.substring(6)) );
		System.out.println(star + "-" + (jumin.substring(jumin.indexOf("-")+1)) );
		System.out.println(star + "-" + data2 );
	}//main end
}//class End
