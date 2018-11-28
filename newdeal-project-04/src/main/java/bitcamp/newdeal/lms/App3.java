package bitcamp.newdeal.lms;

import java.util.Scanner;

public class App3 {
	public static void main(String[] args) {
		//project 2
		Scanner scanner = new Scanner(System.in);

		System.out.print("번호?");
		int number = Integer.parseInt(scanner.nextLine());
		System.out.print("내용?");
		String content = scanner.nextLine();
		String date = "2019-01-01";
		int views = 0;
		System.out.println("번호 : "+number);
		System.out.println("내용 : "+content);
		System.out.println("작성일 : " + date);
		System.out.println("조회수 : " + "views");
		
	}
}
