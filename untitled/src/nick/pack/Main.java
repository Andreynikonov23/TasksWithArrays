package nick.pack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  bigArrayAndTwoSmall();
        //streetsAndHouses();
        twoArrays();
    }

    public static void bigArrayAndTwoSmall(){
        /* Один большой массив и два маленьких
        1. Создать массив на 20 чисел.
        2. Ввести в него значения с клавиатуры.
        3. Создать два массива на 10 чисел каждый.
        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
        */
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[20];
        int [] copy1 = new int[10];
        int [] copy2 = new int[10];
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array[9]; i++) {
            copy1[i] = array[i];
            if (array[i] > array[9]) {
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i > 9) {
                copy2[y] = array[i];
                y++;
            }
        }
        for (int i = 0; i < copy2.length; i++) {
            System.out.println("Copy2: " + copy2[i]);
        }
    }
    public static void streetsAndHouses(){
        /*1. Создать массив на 15 целых чисел.
        2. Ввести в него значения с клавиатуры.
        3. Пускай индекс элемента массива является номером дома, а значение — число жителей, проживающих в доме.
        Дома с нечетными номерами расположены на одной стороне улицы, с четными — на другой. Выяснить, на какой стороне улицы проживает больше жителей.
        4. Вывеси на экран сообщение: «В домах с нечетными номерами проживает больше жителей.» или «В домах с четными номерами проживает больше жителей.»
        */
        Scanner scanner = new Scanner(System.in);
        int b = 0, c = 0;
        int[] a = new int[15];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
            if (i % 2 == 0) {
                b = b + a[i];
            } else c = c + a[i];
        }
        if (b > c) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
    public static void twoArrays(){
        /* 2 массива
        1. Создать массив на 10 строк.
        2. Создать массив на 10 чисел.
        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер
        ячейки которой совпадает с текущим индексом из массива чисел.
         В ывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
        */
        Scanner scanner = new Scanner(System.in);
        String[] strArr = new String[10];
        int [] intArr = new int[10];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = scanner.nextLine();
        }
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = strArr[i].length();
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
