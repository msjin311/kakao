package net.hb.day0615;

public class Testmsj {
	int car = 1004;
	
	public Testmsj(){
		car= 2004;
		System.out.println(car);
	}

	public static void main(String[] args) {
		Testmsj msj = new Testmsj();
		System.out.println();
		System.out.println(msj.car);
		
		Testmsj1 msj1 = new Testmsj1();
		System.out.println(msj1.car);
		

	}

}
