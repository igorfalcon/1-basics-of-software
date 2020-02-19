package by.jonline.tasks.linear_1;

public class mainTask5 {

	public static void main(String[] args) {
		int sec;
		int hour;
		int minute;
		
		sec = 22_405_909;
		hour = 3600;
		minute = 60;
		
		hour = sec / hour;
		sec -= hour * 3600;
		minute = sec / 60;
		sec -= minute * 60;
		
		System.out.println( hour + "ч " + minute + "мин " + sec + "с" );
		
	}

}
