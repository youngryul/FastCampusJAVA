package ch08;

public class Food {

	public long OrderNumber;
	public int PhoneNumber;
	public String address;
	public int date;
	public int hour;
	public int price;
	public int foodNumber;
	
	public Food(long OrderNumber, int PhoneNumber, String address, 
			int date, int hour, int price, int foodNumber )
	{
		this.OrderNumber = OrderNumber;
		this.PhoneNumber = PhoneNumber;
		this.address = address;
		this.date = date;
		this.hour = hour;
		this.price = price;
		this.foodNumber = foodNumber;
	}
	
	public void ShowFoodOrder() {
		System.out.println("주문 접수 번호 : " + OrderNumber );
		System.out.println("주문 핸드폰 번호 : " + PhoneNumber );
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : "+ date);
		System.out.println("주문 시간 : " + hour );
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + foodNumber);
	}
	
}
