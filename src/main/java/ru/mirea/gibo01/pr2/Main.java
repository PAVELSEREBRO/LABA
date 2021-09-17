package ru.mirea.gibo01.pr2;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[] {7,5,6,3,6};
        for (int num : array) {
            System.out.println(num);
        }
        int min = array[0];
        int max = array[0];
        for(int i = 1; i < array.length;i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение = " + min);
        for(int i = 1; i < array.length;i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение = " + max);
        int sum = 0;
        int sr = 0;
        for(int i = 0; i < array.length;i++) {
            sum = sum + array[i];
            sr = sum / (array.length - 1);
        }
        System.out.println("Сумма элементов массива = " + sum);
        System.out.println("Среднее арифметическое элементов массива = " + sr);
        int count;
        do {
            count = 0;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        }
        while (count > 0);
        System.out.println();
        for (int num : array) {
            System.out.println(num);
        }
    }
}

