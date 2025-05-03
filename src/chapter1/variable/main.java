package chapter1.variable;

import java.sql.SQLOutput;

public class main {

    public static void main(String[] args) {

        // [자료형] [변수이름] [세미콜론;]

        // 정수형
        int a;
        a = 1;
        a = 2;
        System.out.println("a = " + a);

        // 논리형
        boolean booleanBox = true;
        booleanBox = false;
        System.out.println("booleanBox = " + booleanBox);

        // 문자형
        char charBox = 'a';
        charBox = 'b';
        System.out.println("charBox = " + charBox);

        // 큰 정수형
        long longBox = 1;
        longBox = 2;
        System.out.println("longBox = " + longBox);

        // 실수형
        // 일반적으로 소수를 입력 하면 double로 인식하기 때문에 float를 입력 할 땐 꼭 뒤에 f를 압력 해야함
        float floatBox = 0.12345678f;
        floatBox = 0.123456789f;
        System.out.println("floatBox = " + floatBox);

        double douleBox = 0.1234567890;
        System.out.println("douleBox = " + douleBox);

        // 캐스팅(Casting)
        // 다운캐스틩 : 큰 데이터를 -> 작은 상자
        double bigBox = 10.123;
        int smallBox = (int) bigBox;
        System.out.println("smallBox = " + smallBox);

        // 업캐스팅 : 작은 데이터 -> 큰 상자
        int smallBox2 = 10;
        double bigBox2 = smallBox2;
        System.out.println("bigBox2 = " + bigBox2);

        // 문자열 데이터
        char a1 = 'a';
        String str = "안녕하세요!";

        // 정수형
        int a2 = 1;
        long a3 = 1;

        // 논리형
        boolean b1 = true;
    }
}
