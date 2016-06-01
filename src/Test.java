
public class Test {
	public static void main(String[] args) {
		int[] a = {1, 2};
		// int b = 2;
		swap(a,0,1);
		System.out.println("a[0] = " + a[0]);
		System.out.println("a[1] = " + a[1]);
	}
	
	public static void swap(int[] a, int indexI, int indexJ) {
		int temp;
		temp = a[indexI];
		a[indexI] = a[indexJ];
		a[indexJ] = temp;
	}
}
