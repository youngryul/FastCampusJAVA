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
		System.out.println("�ֹ� ���� ��ȣ : " + OrderNumber );
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + PhoneNumber );
		System.out.println("�ֹ� �� �ּ� : " + address);
		System.out.println("�ֹ� ��¥ : "+ date);
		System.out.println("�ֹ� �ð� : " + hour );
		System.out.println("�ֹ� ���� : " + price);
		System.out.println("�޴� ��ȣ : " + foodNumber);
	}
	
}
