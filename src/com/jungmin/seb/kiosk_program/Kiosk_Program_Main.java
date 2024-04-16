package com.jungmin.seb.kiosk_program;

public class Kiosk_Program_Main {

    /**
     * @main() 메서드 동작
     * 프로그램 실행 -> 메뉴 입력 -> 수량 입력 및 가격 계산 -> 가격 출력
     */
    public static void main(String[] args) {
        Kiosk_Input.input_print();

        int totalCost = Kiosk_Choice.count();

        Kiosk_Output.output_print(totalCost);
    }
}
