import java.util.StringTokenizer;

public class testfile {
	
	public static final String delims = " \t*+-/()[]"; 
	
	public static void main(String[] args){
		
		
		String expr = "a-(b+A[B[2]])*d+3";
		StringTokenizer str = new StringTokenizer(expr,delims);
		while(str.hasMoreTokens()){
			System.out.println(str.nextToken());
		}
	}
}
