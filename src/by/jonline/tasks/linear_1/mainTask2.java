package by.jonline.tasks.linear_1;

public class mainTask2 {

	public static void main(String[] args) {
		double b;
		double a;
		double c;
		double sum;
		
		a = 52;
		b = 104.2;
		c = -12.7;
		
		sum = (Math.sqrt(Math.pow(b, 2)+4*a*c))/(2*a);
		sum = sum - Math.pow(a,  3) + Math.pow(b,  -2);
		
		System.out.println(sum);	

	}

}
