package chapter1.array;

public class Main {

    public static void main(String[] args) {

        // 모험가 명단을 관리하는법
        String name1 = "gygim";
        String name2 = "Steve";
        // ...

        String[] advrnturerList = {"gygim", "steve", "..."};

        // 1. 배열 선언
//        int[] arr;

        //2. 배열 길이 할당
//        arr = new int [5];
        // [] [] [] [] []

        // 3. 배열 선언과 길이 동시에 할당
//        int[] arr = new int [5];
        // arr = [] [] [] [] [] <- 빈공간

        // 4. 배여 선언과 동사에 배열의 요소 할당
//        int[] arr = {10, 20, 30, 40, 50};
        // [10] [20] [30] [40] [50]

        // 베열의 길이
//        int arrLength = arr.length;
//        System.out.println("arrLength = " + arrLength);

        // 문자열 배열 선언
        String[] strArr = new String[5]; // [""] [""] [""] [""] [""]

        // 논리형 배열 선언
        boolean[] booleansArr = new boolean[3]; // [true] [false] [true]

        // 배열의 요소에 접근 : 인덱스 활용 방법
        int[] arr = {10, 20, 30, 40, 50};
        //           [0] [1] [2] [3] [4]
        System.out.println("배열의 1번쨰 요소 접근 : " + arr[0]);
        System.out.println("배열의 2번쨰 요소 접근 : " + arr[1]);
        System.out.println("배열의 3번쨰 요소 접근 : " + arr[2]);
        System.out.println("배열의 4번쨰 요소 접근 : " + arr[3]);
        System.out.println("배열의 5번쨰 요소 접근 : " + arr[4]);

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;
        System.out.println("배열의 1번쨰 요소 접근 : " + arr[0]);
        System.out.println("배열의 2번쨰 요소 접근 : " + arr[1]);
        System.out.println("배열의 3번쨰 요소 접근 : " + arr[2]);
        System.out.println("배열의 4번쨰 요소 접근 : " + arr[3]);
        System.out.println("배열의 5번쨰 요소 접근 : " + arr[4]);
        //   0     1     2     3     4
        // [100] [200] [300] [400] [500]
        // System.out.println(arr[5]); 인덱스 사용시 주의해야합니다.

        // 배열 탐색
        for (int i = 0; i < arr.length; i++) {
            System.out.println("인덱스 : " + i + ", 값 : " + arr[i]);
        }

        // 향상된 for 문
        // arr [100] [200] [300] [400] [500]
        for (int a : arr) {
            System.out.println("값 : " + a);
        }

//        boolean[][] board = new boolean[2][2]; // [행, 가로] [열, 세로]
        // [] []
        // [] []

        boolean[][] board = {
                {true, false},
                {false, true}
        };

        System.out.println(board[0][0]);
        System.out.println(board[0][1]);

    }
}






































