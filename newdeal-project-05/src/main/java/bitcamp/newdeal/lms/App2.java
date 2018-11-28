package bitcamp.newdeal.lms;

import java.sql.Date;
import java.util.Scanner;


public class App2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int j = 20;
		int k = 0;
		int[] number = new int[j];
		String[] name = new String[j];
		String[] email = new String[j];
		String[] picture = new String[j];
		int[] pass = new int[j];
		int[] phone = new int[j];
		boolean flag = true;
		
		while(flag) {
			System.out.print("번호?");
			number[k] = Integer.parseInt(scanner.nextLine());
			
			System.out.print("이름?");
			name[k] = scanner.nextLine();
			
			System.out.print("이메일?");
			email[k] = scanner.nextLine();
			
			System.out.print("암호?");
			pass[k] = Integer.parseInt(scanner.nextLine());
			
			System.out.print("사진?");
			picture[k] = scanner.nextLine();
			
			System.out.print("전화?");
			phone[k] = Integer.parseInt(scanner.nextLine());
			
			System.out.print("계속 입력하시겠습니까? (Y / N)");
			String flag1 = scanner.nextLine();
			if(flag1.equals("y")) {
				k++;
			}else {
				for(int i = 0; i <= k; i++) {
					System.out.printf("%d, %s, %s, %s, %d, %d\n",
							number[i], name[i], email[i], picture[i], pass[i], phone[i]	
							);
				}
				
				break;
			}
		}
	}
}
