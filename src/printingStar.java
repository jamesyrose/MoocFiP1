import java.util.Arrays;

public class printingStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ps(10); 
		ps(3); 
		ps(6); 
	}
	public static void ps(int n) {
		char star = '*';
	    char[] arr = new char[n];
	    Arrays.fill(arr, star);
	    String printer =  new String(arr);
		System.out.println(printer);
				
	}

}
