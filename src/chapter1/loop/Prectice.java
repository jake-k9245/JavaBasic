package chapter1.loop;

import java.util.Scanner;

public class Prectice {

    public static void main(String[] args) {

        // Q1. 입력한 숫자의 구구단 출력하기
        // 사용자로부터 2-9 사이의 숫자를 입력받아 해당 숫자의 구구단을 출력 하세요
        // 사용자가 3을 입력하면 3단을 출력해야 합니다. for 또는 while 문을 자유롭게 활용하세요

        Scanner scanner = new Scanner(System.in);
        System.out.print("출력할 구구단 단수를 입력하세요 (2-9) : ");
        int dan = scanner.nextInt();

        if (dan < 2 || dan > 9) {
            System.out.println("2에서 9사이의 숫자를 입력하세요!");
        } else {
            System.out.println("=== " + dan + "단 ===");
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " x " + i + " = " + (dan * i));

            }
        }

        // 출력예시:
//         출력할 구구단 단수를 입력하세요 (2~9): 3
//         ==== 3단 ====
//         3 x 1 = 3
//         3 x 2 = 6
//         3 x 3 = 9
//         3 x 4 = 12
//         3 x 5 = 15
//         3 x 6 = 18
//         3 x 7 = 21
//         3 x 8 = 24
//         3 x 9 = 27
    }
}
