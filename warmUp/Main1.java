package warmUp;


public class Main1 {
    public static void main(String[] args) {
        /*
        Создайте массив из всех чётных чисел от 2 до 20
        и выведите элементы массива на экран сначала в строку,
        отделяя один элемент от другого пробелом,
        а затем в столбик (отделяя один элемент от другого началом новой строки).
        */
        int [] arr = new int[11];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i*2;
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
