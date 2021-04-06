public class HomeWork3 {
    public HomeWork3(int a) {
    }

    public static void main(String[] args) {

        System.out.println (HomeWork1(10));
        HomeWork2(-13); 
        System.out.println(new HomeWork3(10203));
    }

    static boolean HomeWork1(int b) {
        System.out.println ();
        int sum = 5 + b;
        return sum >= 10 && sum <= 20;
    }
    static void HomeWork2(int a) {
        String word = "Положительное";
        if (a < 0) word = "Отрицательное";
        System.out.println(word);
}}
