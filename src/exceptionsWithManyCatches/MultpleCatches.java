package exceptionsWithManyCatches;

public class MultpleCatches {

	public static void main(String[] args) {
	int a[] = {10,15,20,14,12,13,15,17,18,19};
	try {
		System.out.println(a[12]);
		return;
	}catch(ArithmeticException e) {
		e.printStackTrace();
		return;
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		return;
	}catch(Exception e) {
		e.printStackTrace();
		return;
	}finally {
		System.out.println("The end");
	}

	}

}
