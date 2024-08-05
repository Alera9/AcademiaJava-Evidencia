package herencia.finalmethods;

public class BigBang  extends Bang{

    public int base =1;
    public double height = 3.0;
    private final double ANGLE;
     
    
    

	public BigBang(double aNGLE) {
		super();
		System.out.println(base + height);
		ANGLE = aNGLE;
	}
	
	
	//void h() {};
	// static Integer i = 0;// no apuntarian al mismo objeto cada uno crearía una instancia de Integer
	void d() {i++;};
	public static void main(String[] args) {
		Bang bigbangInBang =  new BigBang(9.0);
		BigBang  bigbangInBigbang = (BigBang) bigbangInBang;
		 bigbangInBigbang.d();
		 System.out.println(BigBang.i == Bang.i);//
		System.out.println(Bang.i);//0
		System.out.println(BigBang.i);//
		
	}
}
