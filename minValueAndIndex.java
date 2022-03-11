package nick.pack;


import java.util.Arrays;

public class Main {
    //Создайте метод, который выводит на экран минимальное значение массива
    //и индекс этого значения
    public static void main(String[] args){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*((100 - 0) + 1)+0);
        }
        System.out.println(Arrays.toString(array));
        searchMin(array);
    }
    public static void searchMin(int[] array){
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min){
                index = i;
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Его индекс: " + index);
    }
}
