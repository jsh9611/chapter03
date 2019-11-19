package chapter03;

public class ArrayUtils {

	public int intToDouble;

	public static double[] intToDouble(int[] a1) {
		int length = a1.length;
		
		double[] result = new double[length];
		for(int i = 0; i < length; i++) {
			result[i] = a1[i];
		}
		return result;
	}

	public static int[] doubleToInt(double[] d2) {
		int length = d2.length;
		
		int[] result = new int[length];
		for(int i = 0; i < length; i++) {
			result[i] = (int)d2[i];
		}
		
		return result;
	}
	
}	
/*	
	// int 배열을 double 배열로 변환
	static double [] intToDouble( int[] source )
	 
	// double 배열을 int 배열로 변환
	static int [] doubleToInt( double[] source )
	 
	// int 배열 두 개를 연결한 새로운 배열 리턴
	static int [] concat( int[] s1, int[] s2 )
*/

