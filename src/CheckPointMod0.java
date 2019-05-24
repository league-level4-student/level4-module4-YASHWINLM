import java.util.Random;

public class CheckPointMod0 {

	
	
	public static void main(String[] args) {
		int[][] D= new int[5][5];
		Random rand= new Random();
		
		for (int i = 0; i < D.length; i++) {
			
			for (int j = 0; j < D[i].length; j++) {
				int random= rand.nextInt(100);
				D[i][j]+=random;
			}
		}
		for (int i = 0; i < D.length; i++) {
			for (int j = 0; j < D[i].length; j++) {
				System.out.print(D[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
}
