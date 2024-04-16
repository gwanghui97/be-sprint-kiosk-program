package com.jungmin.seb.kiosk_program;

public class Kiosk_Menu {
    /**
     * @menu_n_cost : 메뉴의 가격을 정의 합니다.
     * 메뉴의 가격은 변하지 않습니다.
     * 해당 기능은 자바독(javadoc) 기능입니다.
     */
    //TODO:
    private final int menu_1_cost = 1000; // 김밥
    private final int menu_2_cost = 1500; // 계란 김밥
    private final int menu_3_cost = 1000; // 충무 김밥
    private final int menu_4_cost = 2000; // 떡볶이

    public int getMenu_1_cost() {
        return menu_1_cost;
    }

    public int getMenu_2_cost() {
        return menu_2_cost;
    }

    public int getMenu_3_cost() {
        return menu_3_cost;
    }

    public int getMenu_4_cost() {
        return menu_4_cost;
    }
}
