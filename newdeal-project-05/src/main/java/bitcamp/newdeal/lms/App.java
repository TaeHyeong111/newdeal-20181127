package bitcamp.newdeal.lms;

import java.sql.Date;
import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int j = 20;
		int k = 0;
		int[] number = new int[j];
		String[] title = new String[j];
		String[] content = new String[j];
		Date[] startDate = new Date[j]; 
		Date[] endDate = new Date[j];
		int[] totalHours = new int[j];
		int[] dayHours = new int[j];
		boolean flag = true;
		
		while(flag) {
			System.out.print("번호?");
			number[k] = Integer.parseInt(scanner.nextLine());
			
			System.out.print("수업명?");
			title[k] = scanner.nextLine();
			
			System.out.print("수업내용?");
			content[k] = scanner.nextLine();
			
			System.out.print("시작일?");
			startDate[k] = Date.valueOf(scanner.nextLine());
			
			System.out.print("종료일?");
			endDate[k] = Date.valueOf(scanner.nextLine());
			
			System.out.print("총 수업시간?");
			totalHours[k] = Integer.parseInt(scanner.nextLine());
			
			System.out.print("일 수업시간?");
			dayHours[k] = Integer.parseInt(scanner.nextLine());
			
			System.out.print("계속 입력하시겠습니까? (Y / N)");
			String flag1 = scanner.nextLine();
			if(flag1.equals("y")) {
				k++;
			}else {
				for(int i = 0; i <= k; i++) {
					System.out.printf("%d, %s, %s, %s ~ %s,%d,%d\n",
							number[i], title[i], content[i], startDate[i], endDate[i], totalHours[i], dayHours[i]	
							);
				}
				
				break;
			}
		}
	}
}
