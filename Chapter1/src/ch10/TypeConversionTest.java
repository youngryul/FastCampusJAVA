package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {

		int iNum = 255;
		byte bNum = (byte)iNum; // 바이트 범위가 넘어갔는데 강제 캐스팅하면서 -1이라는 이상한 값이 나옴
		
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
