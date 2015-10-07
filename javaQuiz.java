import java.util.Scanner;

class javaQuiz{

	public static void main(String args[]){
	
		int a;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number");
		a = in.nextInt();
		
		for(int count = 0; count <= a; count++) {
			System.out.print( count + ",");
		}
	}

}