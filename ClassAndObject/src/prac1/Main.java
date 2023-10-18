package prac1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력 종료(q): ");
			try{
				n = sc.nextInt();
			}
			catch(InputMismatchException e){
				char quit = sc.next().charAt(0);
				if(quit == 'q') {
					System.out.println("main 메소드 종료");
					break;
				}
				
				System.out.println("문자가 아닌 숫자 입력할 것.");
				continue;
			}
			
			System.out.println("숫자 + 54 : " + (n+54));
		}
	}

}
