package ch07;

public class TypeConversionTest {
	public static void main(String[] args) {
		
		byte bNum = 125;
		int iNum = bNum;
		
		int iNum2 = 255;
		byte bNum2 = (byte)iNum2;
		double dNum = 3.14;
		int iNum3 = (int)dNum;
		double dNum2 = 1.2;
		float fNum = 0.9f;
		
		int iNum4 = (int)dNum2 + (int)fNum; // 1 + 0
		int iNum5 = (int)(dNum2 + fNum); // 2

		System.out.println(iNum);
		System.out.println(iNum2);
		System.out.println(bNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		System.out.println(iNum5);
		
	}

}
