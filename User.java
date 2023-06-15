package net.hb.day0615;

public class User {
	//ㄴ 필드 int pwd, String email, int count=0;
	//ㄴ 생성자
	//ㄴ public void check(){ pwd자릿수4~8,메일데이터@ }
    private int pwd, count=0;
	private String email;
//	private String in="@"; //오류1
	private int mailindex;
	

	public User() {
		
	} //기본생성
	
	public User(String pwd,String email) {
		this.pwd = Integer.parseInt(pwd);
		this.email = email;
		this.count = pwd.length();
//        email.indexOf("@"); //오류 1
		this.mailindex = email.indexOf("@");
	}//생성자
	
	//public User(int a, String b){
		//a매개인자 mypwd필드 연결
	    //b매개인자 myemail필드 연결
	//}
	
	public  boolean connect(String port) {
		boolean ok=false;
				
				while(true) {
					if(port=="9900") {
						ok=true;
					}
					else {
						ok=false; break;
					}
				}
				return ok;
	}
	
	
	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	public void check() {
		//a값을 mypwd전달 자릿수를 4~8사이체크
		//b값을 myemail전달 @포함 체크

		System.out.println();
		if(4<=count && count<=8) {
			System.out.println("4~8자리의 유효한 비밀번호");
		}
		else if(pwd<4 || pwd>8) {
			System.out.println("4~8사이의 비밀번호를 설정해주세요");
		}
//		boolean maildata = (email.intern()==in.intern());
//		System.out.println(maildata); //오류1
		if(mailindex!=-1) {
			System.out.println("알맞은 이메일 형식입니다");
		}
		else if(mailindex==-1) {
			System.out.println("맞지 않은 이메일 형식입니다");
		}
		
		
		
	}//check end
	
	

}
