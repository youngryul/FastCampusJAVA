package ch02;

public class VIPCustomer extends Customer{


	double salesRatio;
	String agentID;
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		customerGrade ="VIP";
		salesRatio = 0.1;
	}

	public String getAgentID() {
		return agentID;
	}


	
	
	
	
}
