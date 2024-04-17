package com.jungmin.seb.kiosk;

public class KioskApplication {
    public static void main(String[] args) {
        // Kiosk 클래스의 기능을 구현 및 활용해서 프로그래밍 요구 사항에 맞는 키오스크 프로그램을 구현하세요.
        // MenuItem 클래스는 음식 정보를 표현하고 있으며 MenuItem 클래스를 이용해 주문할 음식 정보를 출력할 수 있습니다.
        // 이 외의 필요한 클래스가 있다면 자유롭게 추가해서 여러분들만의 키오스크 프로그램을 만들면 됩니다.
        int totalCost = 0;

        Kiosk kiosk = new Kiosk();

        // Welcome 메시지 출력
        kiosk.welcome();

        // 메뉴 선택 메시지 출력
        MenuItem menu = kiosk.choice();

        // 입력한 메뉴 개수 입력
        kiosk.count();

        // 실제 주문 로직
        int count = kiosk.count();
        totalCost = kiosk.order(menu, count);

        // 최종 출력 메시지
        kiosk.output(totalCost);
    }
}
