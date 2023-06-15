package net.hb.day0615;

import java.util.Random;

public class Test2Random {
	public static void main(String[] args) {
		Random r = new Random();
		int value = r.nextInt(7)+1; //0~6 1~7
//		r.nextInt();
		System.out.println( value ); //1~7
		System.out.println( r.nextInt(7)+1); //0~6 1~7
		
		System.out.println("Test2Random.java 12:17");
		double d = Math.random()*7;
		int com = (int)d+1;
		System.out.println(com);

	}//main end
}//class END
