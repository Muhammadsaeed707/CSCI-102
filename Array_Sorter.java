import java.util.Random; 
import java.util.Arrays;
public class Exercise5 {
    public static void main(String[] args) {
    	int numbers[][] = new int[7][7];
    	Random rand = new Random(); 
    	for (int i = 0; i < 7; i++){
    		for (int j = 0; j < 7; j++){
    			numbers[i][j] = ((rand.nextInt(100)) + 1); 
    		}
    	}
    	sortArrayRows(numbers); 
    	printArray(numbers);
    	sortArray(numbers);
    	printArray(numbers);
    }
    public static void sortArrayRows(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i].length - j - 1; k++) { 
                    if (m[i][k] > m[i][k + 1]) {
                        int t = m[i][k]; 
                        m[i][k] = m[i][k + 1]; 
                        m[i][k + 1] = t; 
                    } 
                } 
            } 
        }
    }
    public static void sortArray(int[][] m) {
    	int[] big_one = new int[49];
    	int k = 0;
    	for (int i = 0; i < 7; i++) {
    		for(int j = 0; j < 7; j++) {
    			big_one[k] = m[i][j];
    			k++;
    		}
    	}
    	Arrays.sort(big_one);
    	k = 0;
    	for (int i = 0; i < 7; i++) {
    		for(int j = 0; j < 7; j++) {
    			m[i][j] = big_one[k];
    			k++;
    		}
		}
	}
    public static void printArray(int[][] m) {
    	for (int i = 0; i < m.length; i++) { 
            for (int j = 0; j < m[i].length; j++) 
                System.out.print(m[i][j] + " "); 
            System.out.println(); 
        }
    }
}
