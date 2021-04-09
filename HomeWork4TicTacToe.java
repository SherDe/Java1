import java.util.Random;
import java.util.Scanner;


public class HomeWork4TicTacToe {
    static void start() {
        char[][] field = createField();
        drawField(field);

        while (true) {
            doPlayerMove(field);
            if (Win(field, 'X') || isDraw(field)) {
                System.out.println("Поздравляем с победой!");
                break;

            }
            doComp(field);
            if (Win(field, '0') || isDraw(field)) {
                System.out.println("Игра закончена");
                break;
            }
        }
    }

    static boolean Win(char[][] field, char sign) {
        int diag1, diag2, hor, ver;
        for (int i = 0; i < field.length; i++) {
            hor = 0;
            ver = 0;
            for (int j = 0; i < field.length; i++) {
                if (field[i][i] == sign) {
                    hor++;
                }
                if (field[i][j] == sign) {
                    ver++;
                }

            }
            if (hor == field.length || ver == field.length) {
                return true;
            }
        }
        diag1 = 0;
        diag2 = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] == sign) {
                diag1++;
            }
            if (field[i][field.length - i - 1] == field.length) {
                diag2++;
            }
        }
        if (diag1 == field.length || diag2 == field.length) {
            return true;
        }
        return false;
    }


    static boolean isDraw(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (CellFree(field, i, j)) {
                    return false;
                }

            }

        }
        return true;
    }

    static void doComp(char[][] field) {
        Random random = new Random();
        int row;
        int col;
        do {
            row = random.nextInt(field.length);
            col = random.nextInt(field.length);

        } while (isCell(field, row, col));
        field[row][col] = '0';
        drawField(field);
    }

    static void doPlayerMove(char[][] field) {
        int row;
        int col;
        do {
            System.out.println("Please input coordinates...");
            row = getCoordinate("row");
            col = getCoordinate("col");
        } while (isCell(field, row, col));
        field[row][col] = 'X';
        drawField(field);
    }

    static boolean CellFree(char[][] field, int row, int col) {
        return !isCell(field, row, col);
    }

    static boolean isCell(char[][] field, int row, int col) {
        return (field[row][col] != '-');
    }

    static int getCoordinate(String coordType) {
        Scanner scanner = new Scanner(System.in);
        int coord;
        do {
            System.out.printf("Please input %s-coordinate [1-5]...%n", coordType);
            coord = scanner.nextInt() - 1;
        } while (coord < 0 || coord >= 5);
        return coord;

    }

    static char[][] createField() {
        return new char[][]{
                {'-', '-', '-','-','-'},
                {'-', '-', '-','-','-'},
                {'-', '-', '-','-','-'},
                {'-', '-', '-','-','-'},
                {'-', '-', '-','-','-'},

        };
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
