package numberformat;

import java.text.NumberFormat;
import java.text.ParseException;

public class Align {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String[] sa = { "111.234", "222.5678" } ;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(3);
		for(String s : sa) {
			System.out.println(nf.parse(s));
		}
	}

}
