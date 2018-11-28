package bitcamp.newdeal.lms;

import java.util.Scanner;

public class App2 {
	public static void main(String[] args) {
		//project 2
		Scanner scanner = new Scanner(System.in);

		System.out.print("번호?");
		int number1 = Integer.parseInt(scanner.nextLine());
		System.out.print("이름?");
		String name = scanner.nextLine();
		System.out.print("이메일?");
		String email = scanner.nextLine();
		System.out.print("암호?");
		int pass = Integer.parseInt(scanner.nextLine());
		System.out.print("사진?");
		String picture = scanner.nextLine();
		System.out.print("전화?");
		int phone = Integer.parseInt(scanner.nextLine());
		System.out.print("일수업시간?");
		String joinDate = "2019-01-01";

		System.out.println("번호 : "+number1);
		System.out.println("이름 : "+name);
		System.out.println("이메일 : "+email);
		System.out.println("암호 : "+pass);
		System.out.println("사진 : "+picture);
		System.out.println("전화 : "+phone);
		System.out.println("가입일 : "+joinDate);
	}
}
