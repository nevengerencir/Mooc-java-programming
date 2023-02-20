import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here


        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }

    public static int smallest(int[] numbers) {
        int start = numbers[0];
        for (int number : numbers) {
            if (number < start) {
                start = number;
            }
        }
        return start;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallestIndex = 0;
        int smallest = MainProgram.smallest(array);
        int length = array.length;
        while (index < length) {
            if (array[index] == smallest) {
                smallestIndex = index;
            }
            index++;
        }
        return smallestIndex;

    }

    public static int indexOfSmallestFrom(int[] array, int base) {
        int index = 0;
        int start = base;

        int[] numbers = new int[array.length - base];
        while (start < array.length) {
            numbers[index] = array[start];
            index++;
            start++;
        }

        int smallest = smallest(numbers);
        int indexSmallestFrom = 0;
        index = 0;
        while (index < array.length) {
            if (array[index] == smallest) {
                indexSmallestFrom = index;
            }
            index++;
        }
        return indexSmallestFrom;


    }
    public static void swap(int[] array, int index1, int index2){
    int num1 = array[index1];
    int num2 = array[index2];
    array[index1] = num2;
    array[index2] = num1;
    }
    public static void sort(int[] array) {
    int index = 0;
    int[] numbers = array;
    while(index < array.length){
        swap(numbers,index,indexOfSmallestFrom(numbers,index));
        index++;
        System.out.println(Arrays.toString(numbers));
    }
    }
}
