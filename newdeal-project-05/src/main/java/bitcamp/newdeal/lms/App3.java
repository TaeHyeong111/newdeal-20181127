package bitcamp.newdeal.lms;

import java.sql.Date;
import java.util.Scanner;


public class App3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int j = 20;
		int k = 0;
		int views = 0;
		
		int[] number = new int[j];
		String[] content = new String[j];
		String date = "2019-09-09";
		boolean flag = true;
		
		while(flag) {
			System.out.print("번호?");
			number[k] = Integer.parseInt(scanner.nextLine());
			
			System.out.print("내용?");
			content[k] = scanner.nextLine();
			
			System.out.print("계속 입력하시겠습니까? (Y / N)");
			String flag1 = scanner.nextLine();
			if(flag1.equals("y")) {
				k++;
			}else {
				for(int i = 0; i <= k; i++) {
					System.out.printf("%d, %s, %s, %d\n",
							number[i], content[i], date, views	
							);
				}
				
				break;
			}
		}
	}
}
