package chapter1.operator;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        // Q1. 산술 연산자 문제
        int a = 10; // 값 할당 필요
        int b = 9; // 값 할당 필요

        // 1. 더하기
        int sum = a + b;

        // 1. 더하기 결과 출력
        System.out.println("덧셈 결과 : " + sum);

        // 2. 뺄셈
        a += 2;
        b -= 8;

        int sub = a - b;

        // 2. 뺄셈 결과 출력
        System.out.println("뺄셈 결과 : " + sub);

        // 3. 곱셈
        a -= 2;
        b += 5;

        int mul = a * b;

        // 3. 곱셈 결과 출력
        System.out.println("곱셈 결과 : " + mul);

        // 4. 나눗셈
        a += 5;
        b -= 2;
        int div = a / b;

        // 4. 나눗셈 결과 출력
        System.out.println("나눗셈 결과 : " + div);

        // 4-1. 나머지
        int mod = a % b;

        // 4-1. 나머지 결과 출력
        System.out.println("나머지 결과 : " + mod);

        // Q2. 비교 연산자 문제
        int x = 10;
        int y = 5;

        System.out.println("x가 y보다 큰가? " + (x > y && x < y)); // false o
        System.out.println("x가 y보다 작은가? " + (x > y || x > y)); // ture o
        System.out.println("x와 y가 같은가? " + (!true)); // false o
        System.out.println("x와 y가 다른가? " + (!false)); // ture

        // Q3. 두 문자열이 같은지 비교할 수 있는 프로그램을 만들어 봅시다.

        Scanner scanner = new Scanner(System.in);

        // TODO: 사용자로부터 첫 번째 문자열 입력받기
        System.out.print("첫 번쨰 문자열을 입력하세요 : ");
        String str1 = scanner.nextLine();

        // TODO: 사용자로부터 두 번째 문자열 입력받기
        System.out.print("두 번쨰 문자열을 입력하세요 : ");
        String str2 = scanner.nextLine();

        // TODO: 문자열 비교 결과를 변수 result 에 저장
        boolean result = str1.equals(str2);

        // TODO: 결과 출력
        System.out.println("두 문자열이 같은가요? " + result); // true


    }
}
