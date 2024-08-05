package scanner;

import java.util.Scanner;

public class MyScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in = "1 a 10 . 100 1000";
		Scanner s = new Scanner(in);
		int accum = 0;
		for(int x = 0; x<4; x++) {
			accum += s.nextInt();
		}
	}

}
