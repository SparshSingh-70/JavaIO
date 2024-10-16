import java.util.Arrays;

public class RevCharArr {

	public static void reverseString(char [] s) {
		int end = s.length - 1;

        for(int i = 0; i < s.length/2; i++){
            swap(s,i,end);
            end--;
        }
	}
	
	public static void swap(char arr[], int start, int end ){
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char arr [] = {'s','p','a','r','s','h'};
		reverseString(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
