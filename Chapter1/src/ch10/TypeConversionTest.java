package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {

		int iNum = 255;
		byte bNum = (byte)iNum; // ����Ʈ ������ �Ѿ�µ� ���� ĳ�����ϸ鼭 -1�̶�� �̻��� ���� ����
		
		double dNum =3.14;
		int inum =(int)dNum;
		
		System.out.println(bNum);
		System.out.println(inum);
		
		double dnum = 1.2;
		float fnum = 0.9F;
		
		int num1 = (int)dnum + (int)fnum;
		int num2 = (int)(dnum+fnum);
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
