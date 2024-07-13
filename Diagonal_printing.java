import java.util.*;
public class Diagonal_printing
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();
		char matrix[][] = new char [len][len];
		for (int i = 0; i < len; i++) {
            matrix[i][i] = str.charAt(i); // Primary diagonal
            matrix[i][len - 1 - i] = str.charAt(len - 1 - i); // Secondary diagonal
        }
		for(int k=0;k<len;k++){
		    for(int l=0;l<len;l++){
		        System.out.print(matrix[k][l]+"  ");
		    }
		    System.out.println();
		}
	}
}
