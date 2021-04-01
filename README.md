# Java1 урок 2
Задание 1.
public class MyFirstApplications {
    public static void main(String[] args) {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxMass = mass.length;
        for(int i = 0; i < maxMass; i++){
            System.out.print (i + "-" + mass[i]+" ");
        }
        System.out.println("");
        for(int i = 0; i < maxMass; i++)
            if(mass[i] == 1) {
                mass[i] = 0;
            }else mass[i] = 1;
        for(int i = 0; i < maxMass; i++){
            System.out.print (i + "-" + mass[i]+" ");
        }}}
        
        Задание 2.
        
  public class MyFirstApplications {
    public static void main(String[] args) {
        HomeWork();
    }
    static void HomeWork() {
        System.out.println("START");
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println("END");
    }}
    
    Задание 3.
    public class MyFirstApplications {
    public static void main(String[] args) {
        HomeWork();
    }
    static void HomeWork() {
            int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int maxMas = mas.length;
            for (int i = 0; i < maxMas; i++) {
                if (mas[i] < 6) mas[i] = mas[i] * 2;
            }
            for (int i = 0; i < maxMas; i++) {
                System.out.print(i + "-" + mas[i] + " ");
            }
        }
    }
    
    Задание 4.
    
    public class MyFirstApplications {
    public static void main(String[] args) {
        HomeWork();
    }
    static void HomeWork() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
Задание 5.
public class MyFirstApplications {
    public static void main(String[] args) {
        HomeWork();
    }
    static void HomeWork() {
        int[] values = {-3, 10, -20,  7, 40, 1000};
        System.out.println("Max: " + max(values));
        System.out.println("Min: " + min(values));
    }
    static int max(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }
    static int min(int[] values) {
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }
        }
        return min;
    }}
