package ch08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class 사장{
	public void work() {
		System.out.println("사장이 직원에게 일을 시킵니다.");
	}
}

class 팀장A extends 사장{

	@Override
	public void work() {
		System.out.println("팀장A가 사장에게 일을 받았습니다.");
	}
	
	public void coffee() {
		System.out.println("커피를 마십니다.");
	}
	
	public void meeting() {
		System.out.println("회의를 합니다.");
	}
}

class 사원1 extends 팀장A{

	@Override
	public void work() {
		System.out.println("사원1이 팀장A에게 일을 받았습니다.");
	}
	
	public void 일() {
		System.out.println("일을 합니다.");
	}
	
	public void 눈치() {
		System.out.println("눈치를 봅니다.");
	}
	
}

class 사원2 extends 팀장A{

	@Override
	public void work() {
		System.out.println("사원2가 팀장A에게 일을 받았습니다.");
	}
	
	public void 일() {
		System.out.println("일을 합니다.");
	}
	
	public void 눈치() {
		System.out.println("눈치를 봅니다.");
	}
	
}

class 팀장B extends 사장{

	@Override
	public void work() {
		System.out.println("팀장B가 사장에게 일을 받았습니다.");
	}
	
	public void coffee() {
		System.out.println("커피를 마십니다.");
	}
	
	public void meeting() {
		System.out.println("회의를 합니다.");
	}
}

class 사원3 extends 팀장B {
	@Override
	public void work() {
		System.out.println("사원3이 팀장B에게 일을 받았습니다.");
	}
	
	public void 일() {
		System.out.println("일을 합니다.");
	}
	
	public void 눈치() {
		System.out.println("눈치를 봅니다.");
	}
}

class 사원4 extends 팀장B {
	@Override
	public void work() {
		System.out.println("사원4가 팀장B에게 일을 받았습니다.");
	}
	
	public void 일() {
		System.out.println("일을 합니다.");
	}
	
	public void 눈치() {
		System.out.println("눈치를 봅니다.");
	}
}

public class KKingKKangTest01 {

	public static void main(String[] args) {
		
		사장 managerA = new 팀장A();
		사장 managerB = new 팀장B();
		
		사장 employee1 = new 사원1();
		사장 employee2 = new 사원2();
		사장 employee3 = new 사원3();
		사장 employee4 = new 사원4();
		
		ArrayList<사장> company = new ArrayList<>();
		company.add(managerA);
		company.add(managerB);
		company.add(employee1);
		company.add(employee2);
		company.add(employee3);
		company.add(employee4);
		
		company.forEach(E -> {
			E.work();
		});
		
		Map<String, String> map = new HashMap<>();
		map.put("사랑해", "이영률");
		map.put("사랑해요", "김근록");
		map.put("낑깡이", "유리");
		
		map.forEach((K, V) -> {
			System.out.println(K + V);
			if (K.equals(V)) System.out.println("에헤헿");
		});

		for (사장 e : company) {
			e.work();
			if (e instanceof 사원1) {
				((사원1) e).일();
				((사원1) e).눈치();
			}
			else if (e instanceof 사원2) {
				((사원2) e).일();
				((사원2) e).눈치();
			}
			else if (e instanceof 팀장A) {
				((팀장A) e).coffee();
				((팀장A) e).meeting();
			}
			else if (e instanceof 팀장B) {
				((팀장B) e).coffee();
				((팀장B) e).meeting();
			}
		}
	}
}
