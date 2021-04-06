public class HomeWork3 {
    public static void main(String[] args) {

        System.out.println(HomeWork1(5, 10));
        System.out.println(HomeWork2(-13));
        System.out.println(HomeWork3(10203));
        HomeWork4();
    }

    static boolean HomeWork1(int a, int b) {
        System.out.println();
        int sum = a + b;
        return sum >= 10 && sum <= 20;

    }
    static int HomeWork2(int a) {
        String word = "Положительное";
        if (a < 0) word = "Отрицательное";
        System.out.println(word);
        return a;
    }
    static boolean HomeWork3(int a) {
        return a < 0;
    }

    static void HomeWork4() {
        String s = ("Домашнее задание");
        for (int i = 0; i < 3; i++) {
            System.out.println(s);
    }
}}