package bitcamp.newdeal.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		//project 1
		Scanner scanner = new Scanner(System.in);
		System.out.print("번호?");
		int number = Integer.parseInt(scanner.nextLine());
		System.out.print("수업명?");
		String title = scanner.nextLine();
		System.out.print("수업내용?");
		String contents = scanner.nextLine();
		System.out.print("시작일?");
		Date startDate = Date.valueOf(scanner.nextLine());
		System.out.print("종료일?");
		Date endDate = Date.valueOf(scanner.nextLine());
		System.out.print("총수업시간?");
		int totalHours = Integer.parseInt(scanner.nextLine());
		System.out.print("일수업시간?");
		int dayHours = Integer.parseInt(scanner.nextLine());

		System.out.println("번호 : "+number);
		System.out.println("수업명 : "+title);
		System.out.println("수업내용 : "+contents);
		System.out.println("기간 : "+startDate+" ~ "+endDate);
		System.out.println("총 수업시간 : "+totalHours+"시간");
		System.out.println("일 수업시간 : "+dayHours+"시간");
	}
}
