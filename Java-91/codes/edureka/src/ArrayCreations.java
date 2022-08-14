import java.util.Arrays;

public class ArrayCreations {

	public static void main(String[] args) {
		int[] marks = new int[10];
		marks[0] = 98;
		marks[1] = 65;
		System.out.println("size of array = " + marks.length);
		for(int i=0; i<marks.length; i++) {
			System.out.print(marks[i] + "   ");
		}
		System.out.println();
		System.out.println(Arrays.toString(marks));
		
		double []salaries = new double[9];
		for(double sal : salaries) {
			System.out.print(sal + "   ");
		}
		System.out.println();
		
		boolean status[] = new boolean[10];
		for(boolean stat : status) {
			System.out.print(stat + "   ");
		}
		System.out.println();
		
		String[] names = new String[10];
		for(String name : names) {
			System.out.print(name + "   ");
		}
		System.out.println();		
	}
}
