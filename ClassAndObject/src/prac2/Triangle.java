package prac2;

import java.util.Scanner;

public class Triangle {
	private int base;
	private int heigth;
	
	public Triangle(int iBase, int iHeigth) {
		this.base = iBase;
		this.heigth = iHeigth;
	}
	
	public double getArea() {
		return 0.5 * this.base * this.heigth;
	}
	
	public static void main(String[] args) {
		Triangle[] t = new Triangle[2];
		int b, h;
		double[] areas = new double[2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 2; ++i) {
			System.out.print("삼각형"+(i+1)+" 밑변: ");
			b = sc.nextInt();
			
			System.out.print("삼각형"+(i+1)+" 높이: ");
			h = sc.nextInt();
			
			t[i] = new Triangle(b, h);
			areas[i] = t[i].getArea();
		}
		
		if(areas[0] > areas[1])
			System.out.println("삼각형1이 더 넓습니다!");
		else if(areas[0] < areas[1])
			System.out.println("삼각형2가 더 넓습니다!");
		else
			System.out.println("두 삼각형의 넓이가 같습니다!");
	}
}
