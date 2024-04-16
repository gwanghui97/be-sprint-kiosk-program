package com.jungmin.seb.kiosk_program;

import java.util.Scanner;

import static com.jungmin.seb.kiosk_program.Kiosk_Cost.cost;

public class Kiosk_Choice {
    private static int totalCost = 0;

    //TODO:
    // 메뉴 입력 및 사용자의 수량을 입력하기 위해 Scanner 객체 생성
    static Scanner sc = new Scanner(System.in);

    /**
     * 사용자가 원하는 메뉴를 번호로 입력받습니다.
     * @재귀함수 : 본 메서드가 동작할 때 메뉴에 없는 번호가 입력되면 자기 자신이 다시 실행되도록 합니다.
     * 해당 count() 메소드는 기능이 모두 구현되어 있습니다. Scanner 객체의 변수명만 확인해야 합니다.
     */
    public static int count() {

        int price;

        Kiosk_Menu menu = new Kiosk_Menu();
        Kiosk_Cost cost = new Kiosk_Cost();

        do {
            // 안내 문구
            System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요. 주문을 끝내시려면 0번을 눌러주세요.");
            System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)");

            // 번호 입력창
            int number = sc.nextInt();

            // 번호가 0이 아닌 경우
            // 0보다 작거나 4번을 초과하는 경우 -> 경고 문구와 함께 메서드 재실행
            // 1-4번 사
            if (!(number == 0)) {

                if (number < 0 || number > 4) {
                    // [경고] 문구를 출력합니다.
                    System.out.println("[경고]메뉴에 포함된 번호를 입력하여 주세요.\n");
                    // 그리고 다시 본 함수가 동작하여 다시 메뉴의 번호를 입력하도록 합니다.
                    count();
                } else {

                    switch (number) {
                        case 1:
                            System.out.println("111");
                            price = menu.getMenu_1_cost();
                            totalCost = totalCost + cost(price);
                            break;
                        case 2:
                            price = menu.getMenu_2_cost();
                            totalCost = totalCost + cost(price);
                            break;
                        case 3:
                            price = menu.getMenu_3_cost();
                            totalCost = totalCost + cost(price);
                            break;
                        case 4:
                            price = menu.getMenu_4_cost();
                            totalCost = totalCost + cost(price);
                    }
                }
            } else {
                break;
            }

        } while (1 != 0);

        return totalCost;
    }
}
