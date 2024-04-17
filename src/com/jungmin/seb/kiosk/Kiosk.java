package com.jungmin.seb.kiosk;

import java.util.Scanner;

public class Kiosk {
    private final MenuItem menuItem1 = new MenuItem("김밥", 1000);
    private final static MenuItem menuItem2 = new MenuItem("계란 김밥", 1500);
    private final static MenuItem menuItem3 = new MenuItem("충무 김밥", 1000);
    private final static MenuItem menuItem4 = new MenuItem("떡볶이", 2000);


    // 주문 안내 메시지를 출력하는 메서드를 정의할 수 있습니다.
    public void welcome() {
        System.out.println("안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("=".repeat(65));
    }

    // 주문할 음식을 선택하는 메서드를 정의 할 수 있습니다.
    public MenuItem choice() {

        MenuItem menuItem;
        boolean isTrue = true;

        do {
            System.out.println("[안내] 원하시는 메뉴의 번호를 입력하여 주세요. 주문을 끝내시려면 0번을 눌러주세요.");
            System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)");

            Scanner sc = new Scanner(System.in);
            int menuNum = sc.nextInt();

                switch (menuNum) {
                    case 1:
                        return menuItem1;
                    case 2:
                        return menuItem2;
                    case 3:
                        return menuItem3;
                    case 4:
                        return menuItem4;
                    default:
                        System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해 주세요.");
                        isTrue = false;
                }
        } while (isTrue == false);
        return null;
    }

    // 주문할 음식의 수량을 입력하는 메서드를 정의할 수 있습니다.
    public int count() {
        System.out.println("메뉴의 수량을 입력해주세요.");
        System.out.println("(※ 최대 주문 가능 수량 : 99)");

        Scanner sc = new Scanner(System.in);
        int countMenu = sc.nextInt();

        if (countMenu < 0 || countMenu > 99) {
            System.out.println("잘못된 수량을 입력하셨습니다. 다시 입력해 주세요.");
        }
        return countMenu;
    }

    // 음식 주문을 위한 메서드를 정의할 수 있습니다.
    public int order(MenuItem menuItem, int count) {
        int totalCost = 0;

        totalCost += menuItem.getPrice() * count;

        return totalCost;
    }

    // 주문 결과를 출력하는 메서드를 정의할 수 있습니다.
    public void output(int totalCost) {
        System.out.println("고객님이 주문하신 메뉴의 총 금액은 " + totalCost + "입니다.");
        System.out.println("[안내]이용해 주셔서 감사합니다.");
    }
}
