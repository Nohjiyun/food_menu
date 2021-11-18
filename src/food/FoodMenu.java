package food;
import java.util.*;

public class FoodMenu {
	public static void main(String args[]) {
		
		/* 뭐먹지 프로그램
		 * 메뉴를 추가 (프로그램 자체에서 메뉴 설정)
		 * 메뉴를 추가 (이 프로그램 사용자가 직접 입력)
		 * 메뉴들을 입력하고 저장된 메뉴들 중에 하나를 알아서 추천
		 * 추천 결과를 출력 */
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<<뭐먹지 프로그램 시작>>");
		System.out.println("추가할 메뉴의 개수는??");
		
		ArrayList<String> menus = new ArrayList<String>();
		
		//변수 선언;
		int menuNum = sc.nextInt();
		
		for (int i = 0; i < menuNum; i++) {
			System.out.println((i+1) + ". 메뉴를 입력하세요.");
			menus.add(sc.next());
		}
		
		System.out.println("메뉴 목록 >> " + menus);
		
		double d = Math.random();
		int index = (int) (d * menuNum); 
		
		String get_Menu = menus.get(index);
		
		System.out.println("==> 오늘의 추천 메뉴는 " + get_Menu + " 입니다.");
	}
}