package com.jungmin.seb.kiosk_program;

import java.util.Scanner;

public class Kiosk_Cost {

    //TODO:
    // 메뉴 입력 및 사용자의 수량을 입력하기 위해 Scanner 객체 생성
    static Scanner sc = new Scanner(System.in);

    /**
     * 수량 입력 및 가격 연산을 진행하는 메서드를 정의합니다.
     * @수량 : 수량은 1 ~ 99 까지만 입력 받을 수 있도록 합니다.
     */
    public static int cost(int price) {
        // 안내 문구를 출력합니다.
        //TODO:
        System.out.println("메뉴의 수량을 입력해주세요. 최대 주문 가능 수량은 99개입니다.");

        // 입력받은 수량을 변수에 저장합니다.
        //TODO:
        int count = sc.nextInt();
        int result = 0;

        // 조건에 따라 문구 출력, 재입력을 진행합니다.
        // 조건은 다음과 같습니다.
        // 0 이하 || 99 초과
        // 두 조건 중 하나라도 참인경우 경고 문구 출력과 함께 다시 수량을 입력받을 수 있도록 합니다.
        //TODO:
        if(count <= 0 || count > 99) {
            System.out.println("잘못된 수량을 입력하셨습니다. 다시 입력해주세요.");
            cost(price);
        } else  {
            result = price * count;
        }
        return result;
    }
}
