import java.util.*;
public class Odd_evev_index
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int len = sc.nextInt();
	    int arr[] = new int[len];
	    for(int i = 0;i<len;i++){
	        arr[i] = sc.nextInt();
	    }
            Arrays.sort(arr);
	    int newarr[] = new int[len];
	    int j = 0;
	    int k  =len-1;
	     for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                newarr[i] = arr[len - 1 - i/2];
            } else {
                newarr[i] = arr[i/2];
            }
        }
	    for(int i = 0;i<len;i++){
	        System.out.print(newarr[i]+" ");
	    }
	}
}
