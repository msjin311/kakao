package net.hb.day0615;

import java.util.Scanner;

public class UserTest {
	
	public UserTest() {
		//User ob = new User();
		//System.out.println(ob.getpwd());
		//System.out.println(ob.getemail());
	}
	
	
	public static void main(String[] args) {
		//ㄴ public static void main(String[] args) {
		// Scanner클래스
		// 비번입력 >>> a=sc.~~(); 자릿수4~8
		// 메일입력 >>> b=sc.~~(); @체크
        // User ob = new User(a,b);
		// ob.check();
		String pwd;
		String email;
		//int pwd=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("비번을 입력해주세요");
		pwd = scan.nextLine();
		//int pwd=Integer.parseInt(scan.nextLine());
		System.out.println("이메일을 입력해주세요");
		email = scan.nextLine();
		
		User  uu = new User(pwd,email);
		uu.check();
		
	}
}
