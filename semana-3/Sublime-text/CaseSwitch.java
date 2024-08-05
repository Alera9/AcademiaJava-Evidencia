class CaseSwitch{
	static final char one = '1', two = '2', three = '3', four = '4', five = '5';
	int optionI;
	char optionS;
	static String result;
	static int oneL = 1;

	public static void main(String[] args){
		CaseSwitch cs = new CaseSwitch();
		cs.setOption(Integer.valueOf(args[0]));
		
		System.out.println(cs.giveWeekDay());
	}

	void setOption(int o){
		optionI = o;
	}
	void setOption (char o){
		optionS = o;
	}

	String giveWeekDay(){
		switch(this.optionI){
		case 1:
			result = "Monday";
			break;
		case 2: 
			result="Tuesday";
			break;
		case 3:
			result="Wednesday";
			break;
		case 4:
			result = "Thursday";
			break;
		case 5:
			result = "Friday";
			break;

		}
		return result;
	}

	String giveWeekDay2(){
		switch(this.optionS){
		case one :
			result = "Monday";
			break;
		case two: 
			result="Tuesday";
			break;
		case three:
			result="Wednesday";
			break;
		case four:
			result = "Thursday";
			break;
		case five:
			result = "Friday";
			break;

		}
		
		return result;
	}
}