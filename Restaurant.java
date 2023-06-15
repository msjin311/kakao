package net.hb.day0615;

import java.text.DecimalFormat;

public class Restaurant {
	public static void main(String[] args) {
		Menu pizza = new Menu("피자",7500);
		Menu steak = new Menu("T본",9000);
		Menu cola = new Menu("콜라",250);
		Menu[] menuArray = {pizza, steak, cola };
		Order cal = new Order(1200, menuArray);
		
		DecimalFormat df = new DecimalFormat("##,###");
		System.out.println("-------------------");
		//df.format(tax)
		System.out.println("주문합계 " + df.format(cal.totalPrice()) + "원 입니다");
	}//main end
}//Restaurant class END

//고객클래스
class Order{
	int tot=0;
	int orderNum;
	Menu[] menus;
	
	public Order() {
		
	}
	public Order(String kind) {
		
	}
	//생성자 Order더 추가
	public Order(int num,Menu[] menuArray ) {
		this.orderNum =num;
		this.menus =menuArray;
	}
	
	public int totalPrice() {
		//Menu pizza = new Menu("피자", 7500);
		//Menu[] menuArray = {pizza, steak, cola };
		//Order cal = new Order(1200, menuArray);
				for(int i=0; i<menus.length; i++) {
					tot = tot + menus[i].price;
				}
				return tot;
				
	}//end
}//Order class END

	 class Menu{
		String name;
		int price; //접근지정자 생략하면 public
		
		public Menu() { }
		public Menu(String ss, int cc) {
			this.name=ss;
			this.price=cc;
			System.out.println(this.name + " " + this.price+"원 주문성공");
		} 
	}//inner클래스 end

	
	class MyExit{
		
	}// MyExit class END
