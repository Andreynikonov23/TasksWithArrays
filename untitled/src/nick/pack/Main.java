package nick.pack;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  bigArrayAndTwoSmall();
        streetsAndHouses();
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
        int [] array = new int[15];
        int x = 1;
        int y = 1;
        int [] even = new int[x];
        int [] odd = new int[y];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (i%2 == 0){
                even[x] = i;
                x++;
            } else {
                odd[y] = i;
                y++;
            }
        }
        for (int i = 0; i < even.length; i++) {
            System.out.println("Even: " + even[i]);
        }
        for (int i = 0; i < odd.length; i++) {
            System.out.println("Odd: " + odd[i]);
        }
    }
}

