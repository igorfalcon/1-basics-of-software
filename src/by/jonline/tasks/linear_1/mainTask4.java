package by.jonline.tasks.linear_1;

public class mainTask4 {

	public static void main(String[] args) {
		double d1;
		double d2;
		int nnn;
		int ddd;
		double result;

		d1 = 245.679;

		nnn = (int) d1;
		ddd = (int) ((d1 - nnn) * 1000);
		d2 = nnn / 1000.0;
		result = ddd + d2;

		System.out.println(result);

	}

}
