package ch08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class ����{
	public void work() {
		System.out.println("������ �������� ���� ��ŵ�ϴ�.");
	}
}

class ����A extends ����{

	@Override
	public void work() {
		System.out.println("����A�� ���忡�� ���� �޾ҽ��ϴ�.");
	}
	
	public void coffee() {
		System.out.println("Ŀ�Ǹ� ���ʴϴ�.");
	}
	
	public void meeting() {
		System.out.println("ȸ�Ǹ� �մϴ�.");
	}
}

class ���1 extends ����A{

	@Override
	public void work() {
		System.out.println("���1�� ����A���� ���� �޾ҽ��ϴ�.");
	}
	
	public void ��() {
		System.out.println("���� �մϴ�.");
	}
	
	public void ��ġ() {
		System.out.println("��ġ�� ���ϴ�.");
	}
	
}

class ���2 extends ����A{

	@Override
	public void work() {
		System.out.println("���2�� ����A���� ���� �޾ҽ��ϴ�.");
	}
	
	public void ��() {
		System.out.println("���� �մϴ�.");
	}
	
	public void ��ġ() {
		System.out.println("��ġ�� ���ϴ�.");
	}
	
}

class ����B extends ����{

	@Override
	public void work() {
		System.out.println("����B�� ���忡�� ���� �޾ҽ��ϴ�.");
	}
	
	public void coffee() {
		System.out.println("Ŀ�Ǹ� ���ʴϴ�.");
	}
	
	public void meeting() {
		System.out.println("ȸ�Ǹ� �մϴ�.");
	}
}

class ���3 extends ����B {
	@Override
	public void work() {
		System.out.println("���3�� ����B���� ���� �޾ҽ��ϴ�.");
	}
	
	public void ��() {
		System.out.println("���� �մϴ�.");
	}
	
	public void ��ġ() {
		System.out.println("��ġ�� ���ϴ�.");
	}
}

class ���4 extends ����B {
	@Override
	public void work() {
		System.out.println("���4�� ����B���� ���� �޾ҽ��ϴ�.");
	}
	
	public void ��() {
		System.out.println("���� �մϴ�.");
	}
	
	public void ��ġ() {
		System.out.println("��ġ�� ���ϴ�.");
	}
}

public class KKingKKangTest01 {

	public static void main(String[] args) {
		
		���� managerA = new ����A();
		���� managerB = new ����B();
		
		���� employee1 = new ���1();
		���� employee2 = new ���2();
		���� employee3 = new ���3();
		���� employee4 = new ���4();
		
		ArrayList<����> company = new ArrayList<>();
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
		map.put("�����", "�̿���");
		map.put("����ؿ�", "��ٷ�");
		map.put("������", "����");
		
		map.forEach((K, V) -> {
			System.out.println(K + V);
			if (K.equals(V)) System.out.println("�����m");
		});

		for (���� e : company) {
			e.work();
			if (e instanceof ���1) {
				((���1) e).��();
				((���1) e).��ġ();
			}
			else if (e instanceof ���2) {
				((���2) e).��();
				((���2) e).��ġ();
			}
			else if (e instanceof ����A) {
				((����A) e).coffee();
				((����A) e).meeting();
			}
			else if (e instanceof ����B) {
				((����B) e).coffee();
				((����B) e).meeting();
			}
		}
	}
}
