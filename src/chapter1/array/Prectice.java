package chapter1.array;

public class Prectice {

    public static void main(String[] args) {

        // Q1. 1차원 배열에서 짝수만 출력하기
        // 아래의 정수 배열이 주어졌을 때 짝수만 출력하세요
        // 배열예시 : {3, 4, 7, 10, 15, 20}

        int[] num = {3, 4, 7, 10, 15, 20};

        System.out.print("짝수 : ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }

        // Q2. 1차원 배열의 누적합 구하기
        // 아래의 정수 배열의 누적합으 구하세요
        // 배열 예시 : {2, 5, 8}

        int[] num2 = {2, 5, 8};
        int sum = 0;

        for (int i = 0; i < num2.length; i++) {
            sum += num2[i];
        }

        System.out.println("누적합 : " + sum);

        // Q3. 2차원 배열에서 검은돌(true)의 좌표(x, y) 찾기
        boolean[][] board = {
                        {true, false},
                        {false, true}
                };

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                            System.out.println("검은돌(●) 위치: (" + i + "," + j + ")");
                }
            }
        }
    }
}

