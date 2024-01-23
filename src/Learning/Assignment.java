package Learning;

public class Assignment {
 public static void main(String[] args) {
	int[] numbers = {1,2,3,4,5};
try {
	int x = numbers[8];
	System.out.println(x);
} catch(ArrayIndexOutOfBoundsException e) {
	e.printStackTrace();
}
	
}
}
