import java.util.Scanner;
public class PracticeProblem {
	

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String word = in.nextLine();
		System.out.println(word);
	}

	public static void q2() {
		Scanner in= new Scanner(System.in);
		System.out.print("In: ");
		int num1= in.nextInt();
		in.nextLine();
		System.out.print("In: ");
		int num2 = in.nextInt();
		in.nextLine();
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
	}

	public static void q3() {
		Scanner in= new Scanner(System.in);
		System.out.print("In: ");
		String word= in.nextLine();
		System.out.println(word + " was the text you wrote");
		
	}

	public static void q4() {
		Scanner in= new Scanner(System.in);
		System.out.print("In: ");
		int num1= in.nextInt();
		in.nextLine();
		System.out.println(num1*5);
		
	}

	public static void q5() {
		Scanner in= new Scanner(System.in);
		System.out.print("In: ");
		boolean answer= in.nextBoolean();
		in.nextLine();
		System.out.println(answer + " is a boolean");
		
	}

	public static void q6() {
		Scanner in= new Scanner(System.in);
		System.out.print("In: ");
		double num= in.nextDouble();
		in.nextLine();
		System.out.println(num-3.2);
		
	}

}
