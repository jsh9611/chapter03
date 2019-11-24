package asdf;

import java.util.Scanner;

public class Godd {
 /*   public static void main(String[] args) {
        
    	private static String name;
    	private static int price;
    	private static int countStock;
    	
        // 문자열 입력을 위해 Scanner 생성
        Scanner sc = new Scanner(System.in);
        
        // 입력 값 저장을 위해 String 2차원 배열 선언
        String[][] stringArr = new String[10][];
        // 입력받은 값을 담을 String 배열 선언
        String[] scannerArr = new String[3];
        
        // 배열 카운트 선언
        int scCnt = 1;
        
        while(true) { // 계속 입력을 받기 위해 true로 설정
            
            System.out.println("첫번째 값을 입력하세요 = >");
            scannerArr[0] = sc.next(); // 첫번째 입력
            
            System.out.println("두번째 값을 입력하세요 = >");
            scannerArr[1] = sc.next(); // 두번째 입력
            
            System.out.println("세번째 값을 입력하세요 = >");
            scannerArr[2] = sc.next(); // 세번째 입력
            
            stringArr[scCnt] = scannerArr; // 입력 받은 배열 값을 2차원 배열에 저장
            
            for(int i = 0; i < stringArr.length; i++) { // 입력된 값의 순서와 내용을 출력
                System.out.println(scCnt + "순서로 입력된 값의 " + i + "번째 내용 = > " +  stringArr[scCnt][i].toString());
            }
            scCnt++;
        }
    }
}

*/
    	private static final int COUNT_GOODS = 3;

    	public static void main(String[] args) {
    		Scanner scanner = new Scanner(System.in);

    		Goods[] goods = new Goods[COUNT_GOODS];


    		
    		// 자원정리
    		scanner.close();
    	}
    }    	
  