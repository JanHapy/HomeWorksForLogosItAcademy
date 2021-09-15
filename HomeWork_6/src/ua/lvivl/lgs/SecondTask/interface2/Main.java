package ua.lvivl.lgs.SecondTask.interface2;

public class Main {
	public static void main(String[] args) {
		MyCalculator res = new MyCalculator();
		res.a = 10;
		res.b = 3.3;
		
		MyCalculator.viewResult(res.plus());
		MyCalculator.viewResult(res.minus());
		MyCalculator.viewResult(res.multiply());
		MyCalculator.viewResult(res.devide());

		System.out.println();
		
		MyCalculator res2 = new MyCalculator(3.3, 33);

		MyCalculator.viewResult(res2.plus());
		MyCalculator.viewResult(res2.minus());
		MyCalculator.viewResult(res2.multiply());
		MyCalculator.viewResult(res2.devide());
	}
}
