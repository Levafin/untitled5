public class Task3 {

    //3. Напечатать числа в виде следующей таблицы:
    //   5
    //   5 5
    //   5 5 5
    //   5 5 5 5
    //   5 5 5 5 5

    public static void main(String[] args) {
        printToPyramid(5, 1);
        System.out.println();
        printToPyramid(3, 2);
        System.out.println();
        printToPyramid(2+4, 3);
        System.out.println();
        printToPyramid(5-1, 4);
        System.out.println();
        printToPyramid(0, 5);
        System.out.println();
    }

    public static void printToPyramid(int number, int count) {
        if(count > 0) {
            count--;
            System.out.print(number + " ");
            printToPyramid(number, count);
        }
    }
}
