package chapter1.operator;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        // Q1.산술 연산자 문제
        // 두 개의 정수 a 와 b 가 주어졌울 때 두 수의 합, 차, 곱, 나누기 그리고
        // 나머지(%모듈러) 연산 결과를 변수에 저장한 후 출력하는 프로그램을 작성 하세요.

        int a = 15;
        int b = 4;

        // 1. 더하기
        int sum = a + b;

        // 1. 더하기 결과 출력
        System.out.println("덧셈 결과 : " + sum);

        // 2. 빼기
        int sub = a - b;

        // 2. 빼기 결과 출력
        System.out.println("뺄셈 결과 : " + sub);

        // 3. 곱셈
        int mul = a * b;

        // 3. 곱셈 결과 출력
        System.out.println("곱셈 결과 : " + mul);

        // 4. 나눗셈
        int div = a / b;

        // 4. 나눗셈 결과 출력
        System.out.println("나눗셈 결과 : " + div);

        // 5. 나머지
        int mod = a % b;

        // 5. 나머지 결과 출력
        System.out.println("나머지 결과 : " + mod);

        // Q2. 비교 연산자 문제
        // 두 개의 정수 x 와 y 가 주어졌을 때
        // @ x가 y보다 큰지 (>)
        // @ x가 y보다 작은지 (<)
        // @ x가 y보다 같은지 (==)
        // @ x가 y보다 다르면 (!=)각각의 결과를 변수에 저장하고 출력하는 프로그램을 작성하세요.

        int x = 10;
        int y = 20;

        boolean isGreater = x > y;
        boolean isSmaller = x < y;
        boolean isEqual = x == y;
        boolean isNotEqual = x != y;

        System.out.println("x가 y보다 큰가? " + isGreater);
        System.out.println("x가 y보다 작은가? " + isSmaller);
        System.out.println("x가 y보다 같은가? " + isEqual);
        System.out.println("x가 y보다 다른가? " + isNotEqual);

        // Q3. 두 문자열이 같은지 비교할 수 있는 프로그램을 만들어 봅시다.
        // 입력한 두 개의 문자열 str1과 str2을 비교한 결과를 result에 담아서 출력하세요.
        // @ 두 문자열이 같은지 비교할 때 활용 (.equals())

        Scanner scanner = new Scanner(System.in);

        // TODO: 사용자로부터 첫 번째 문자열 입력받기
        System.out.print("첫 번째 문자열을 입력하세요 : " );
        String str1 = scanner.nextLine();

        // TODO: 사용자로부터 두 번째 문자열 입력받기
        System.out.print("두 번째 문자열을 입력하세요 : " );
        String str2 = scanner.nextLine();

        // TODO: 문자열 비교 결과를 변수 result 에 저장
        boolean result = str1.equals(str2);

        // TODO: 결과 출력
        System.out.print("두 문자열이 같은가요? " + result);

    }
}
