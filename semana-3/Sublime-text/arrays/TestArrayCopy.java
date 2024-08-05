import java.util.Arrays;
public class TestArrayCopy{
	  public static void main(String[] args) {

        String [] src     = { "Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String [] dest    = { "January", "February", "March", "April", "May", "June", "July", "August"};
        Integer[] numSrc  = {};
        Integer[] numDest = {};
        //arraycopy(Object src, int srcIndex, Object dest, int destIndex, int len)
        /*
        src: It is the source array.
		srcIndex: It is the starting index of the source array.
		dest: It is the destination array.
		destIndex: It is the starting index of the destination array.
		len: It is the number of elements that need to be copied from the source array to the destination array.*/
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,7);
        System.out.println(Arrays.toString(dest));
    }

}