package homework_4;

import java.util.Scanner;

public class Homework_4_1 {

    public static void printBoard(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            
        }
    }

    public static boolean checkWinner(String[][] arr){
        // проверка трех строк на наличие победителя
        for (int i = 0; i < arr.length; i++) {
            boolean rowWin = arr[i][0] != null
                    && arr[i][0].equals(arr[i][1])
                    && arr[i][1].equals(arr[i][2]);
            if (rowWin) return true;
        }

        // проверка 3 столбцов на наличие победителя
        // попробую использовать транспонирований матрицы
        for (int j = 0; j < arr.length; j++) {
            boolean colWin = arr[0][j] != null
                    && arr[0][j].equals(arr[1][j])
                    && arr[1][j].equals(arr[2][j]);
            if (colWin) return true;
        }

        // проверка главной диагонали
        if (arr[0][0] != null
                && arr[0][0].equals(arr[1][1])
                && arr[1][1].equals(arr[2][2])) {
            return true;
        }

        //проверка побочной дигоанли
        if (arr[0][2] != null
                && arr[0][2].equals(arr[1][1])
                && arr[1][1].equals(arr[2][0])) {
            return true;
        }
        return false;
    }

    static void main(String[] args) {
        String[][] arr = new String[3][3];
        boolean isWinner = false;
        Scanner sc = new Scanner(System.in);
        int row, column;
        int count = 1; // счетчик ходов, по которому будет определяться кто будет ходить х или о
        System.out.println("Это игра крестики-нолики. Х ходит первым!" + "\n");
        while (!isWinner){
            printBoard(arr);
            String symbol = count % 2 == 0 ? "o" : "x";
            System.out.println("Введите в какую строку и какой столбец хотите внести данные для " + symbol);
            row = sc.nextInt();
            column = sc.nextInt();

            if (row < 0 || row > 2 || column < 0 || column > 2) {
                System.out.println("Координаты должны быть от 0 до 2\n");
                continue;
            }

            if (arr[row][column] == null){
                arr[row][column] = symbol;
                count++;
            } else {
                System.out.println("Данная ячейка занята, повторите ввод");
            }

            if (checkWinner(arr)) {
                printBoard(arr);
                System.out.println("Победил " + symbol + "!");
                isWinner = true;
            } else if (count > 9) {
                printBoard(arr);
                System.out.println("Ничья!");
                break;
            }
        }

    }
}
