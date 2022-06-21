package ch03;

public class VIPCustomer extends Customer {



	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		bonusRatio = 0.05;
		customerGrade ="VIP";
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) call");
	}

	double salesRatio;
	String agentID;
	
//	public VIPCustomer() {
//		
//		super(0, "no-name");
//		bonusRatio = 0.05;
//		customerGrade ="VIP";
//		salesRatio = 0.1;
//		
//		System.out.println("VIPCustomer() call");
//	}
	



	public String getAgentID() {
		return agentID;
	}

	@Override
	public int calcPrice(int price) {

		return 0;
	}
}
