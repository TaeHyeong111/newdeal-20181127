package bitcamp.newdeal.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		final int DEFAULT_SIZE = 20;
		int[] no = new int[DEFAULT_SIZE];
		String [] title = new String[DEFAULT_SIZE];
		String [] contents = new String[DEFAULT_SIZE];
		Date[] startDate = new Date[DEFAULT_SIZE];
		Date[] endDate = new Date[DEFAULT_SIZE];
		int[] totalHours = new int[DEFAULT_SIZE];
		int[] dayHours = new int[DEFAULT_SIZE];
		int len = 0;

		Scanner scanner = new Scanner(System.in);

		// Scanner 가 엔터를 치면 메모리에 값이 저장되어 다음값을 읽어드린다(메모리상의 0A)
		for (int i = 0; i<DEFAULT_SIZE; i++) {

			System.out.print("번호를 입력하세요.");
			no[i] = Integer.parseInt(scanner.nextLine());

			System.out.print("수업명을 입력하세요");
			title[i] = scanner.nextLine();

			System.out.print("내용을 입력하세요");
			contents[i] = scanner.nextLine();

			System.out.print("강의 시작일을 입력하세요");
			startDate[i] = Date.valueOf(scanner.nextLine());

			System.out.print("강의 종료일을 입력하세요");
			endDate[i]= Date.valueOf(scanner.nextLine());

			System.out.print("총 강의 시간");
			totalHours[i] = Integer.parseInt(scanner.nextLine());

			System.out.print("일 강의 시간");
			dayHours[i] = Integer.parseInt(scanner.nextLine());

			len++;

			System.out.println("계속하시겠습니까?(Y / N) ");
			String input = scanner.nextLine();
			if(input.equals("") || input.equalsIgnoreCase("y")) {
				continue;
			}
			break;
		}
		scanner.close();

		for(int i = 0; i<len; i++) {
			System.out.printf("%d, %s, %s ~ %s, %d\n",
					no[i], title[i], contents[i], startDate[i], endDate[i], totalHours[i], dayHours[i]
					);
		}
		// "이스케이프 문자" : 문자열안에 삽입되는 명령어
		//객체는 사람 메소드는 사람에게 일을 시킨다
	}
}
