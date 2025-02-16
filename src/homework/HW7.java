package homework;

import java.util.Arrays;
import java.util.SortedMap;

public class HW7 {

    public static void numberTask(int number) {

        System.out.println();
        System.out.println("\u001B[33m" + "**************************" + "\u001B[35m" + "Task "
                + number + "\u001B[33m" + "**************************" + "\u001B[0m");

        number++;
        System.out.println();
    }

    public static void numTask(double number) {

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\u001B[34m" + "Task " + number + "\u001B[0m");

        number++;
        System.out.println();
    }

    //Task 18.1
    public static void test(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    // Task 18.2
    public static int averageValue(int[] array18) {
        int sum = 0;
        for (int i = 0; i < array18.length; i++) {
            sum += array18[i];
        }
        return sum / array18.length;
    }

    // Task 21
    public static int[] getMinMaxAverage(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int average = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
            sum += array[i];

        }
        average = sum / array.length;

        int[] result = {min, max, average};

        return result;
    }

    // Task 20
    public static int randomInt(int upper, int lower) {

        return (int) (Math.random() * (upper - lower)) + lower;
    }

    // Task 24
    public static int[][] create2DArrayRandom(int row, int column, int upper, int lower) {
        int[][] array = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomInt(upper, lower);
            }
        }

        return array;
    }

    public static void main(String[] args) {

        numberTask(1);
        /** Create an array of catsNames, fill it with any values.
         *
         */

        String[] catsNames = new String[8];
        catsNames[0] = "Kitty";
        catsNames[1] = "Lucky";
        catsNames[2] = "Whiskers";
        catsNames[3] = "Tiger";
        catsNames[4] = "Shadow";
        catsNames[5] = "Simba";
        catsNames[6] = "Fluffy";
        catsNames[7] = "Felix";

        System.out.println(catsNames[3]);
        System.out.println(catsNames[0]);
        System.out.println(catsNames[7]);

        numberTask(2);
        /** In the catsNames array, change the value of the element with index 4 to “Ginger”,
         * and the value of the element with index 1 to “Smokey”.
         */

        catsNames[4] = "Ginger";
        catsNames[1] = "Smokey";

        System.out.println(catsNames[4]);
        System.out.println(catsNames[1]);

        numberTask(3);
        /** Create an array of catsColors and fill it with values.
         *
         */

        String[] catsColors = {"Blue", "Black", "Grey", "Cinnamon", "Red", "Grey", "Brown", "Grey"};

        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
        }

        numberTask(4);
        /** Create an array of catsAges and fill it with values.
         *
         */

        int[] catsAges = {1, 5, 3, 2, 4, 6, 7, 8};

        System.out.println(Arrays.toString(catsAges));

        numberTask(5);
        /** Create an isCatRed array and surround it with acceptable values/
         *
         */

        boolean[] isCatRed1 = {false, false, false, false, true, false, false, false};
        boolean[] isCatRed = new boolean[catsColors.length];

        if (catsColors.length == isCatRed.length) {
            for (int i = 0; i < catsColors.length; i++) {
                System.out.print(catsColors[i].equals("Red") + " ");
            }
        }

        numberTask(6);
        /** Print for catsNames and catsColors arrays:
         * 1) the name of the cat in the box with the number 6,
         * 2) names of cats from boxes with even indexes,
         * 3) names of cats from boxes whose indices are multiples of 4,
         * 4) color of cats from boxes with odd indices,
         * 5) color of cats from boxes whose indices are multiples of 3.
         */

        numTask(6.1);
        System.out.println(catsNames[6]);

        numTask(6.2);
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0 && i > 0) {
                System.out.println(i + " - " + catsNames[i]);
            }
        }

        numTask(6.3);
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " - " + catsNames[i]);
            }
        }

        numTask(6.4);
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " - " + catsColors[i]);
            }
        }

        numTask(6.5);
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " -  " + catsColors[i]);
            }
        }

        numberTask(7);
        /** Print "Feed (the cat)!" for all gray cats/
         *
         */

        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Grey")) {
                System.out.println("Feed " + catsNames[i] + "!" );
            }
        }

        numberTask(8);
        /** Print “Take (the cat) for a vaccination!”
         * if the cat is less than 2 years old.
         */

        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 0 || catsAges[i] > 50) {
                System.out.println("Error");
            } else if (catsAges[i] <= 2) {
                System.out.println("Take " + catsNames[i] + " for a vaccination!");
            }
        }


        numberTask(9);
        /** For the cat in the last box, print out the name, color, age.
         *
         */
        if (catsNames.length == catsColors.length && catsNames.length == catsAges.length && catsNames.length != 0) {
            System.out.println(catsNames[catsNames.length - 1] + " " + catsColors[catsColors.length - 1] + " "
                    + catsAges[catsAges.length - 1]);
        }

        numberTask(10);
        /** Print the names of all cats over 2 years old.
         */

        for (int i = 0; i < catsNames.length; i++) {
            if (catsAges[i] > 2) {
                System.out.println(catsNames[i] + " " + catsAges[i]);
            }
        }

        numberTask(11);
        /** Print "Feed (the cat)!" if the name of the cat is “Ginger”
         * and the value isCatRed == true.
         */

        if (catsNames.length == isCatRed1.length && catsNames.length != 0) {
            for (int i = 0; i < catsNames.length; i++) {
                if (catsNames[i].equals("Ginger") && isCatRed1[i] == true) {
                    System.out.println("Feed " + catsNames[i] + "!");
                }
            }
        }

        numberTask(12);
        /** Print the average age of cats from the catsAges array.
         *
         */

        int sumOfAges = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sumOfAges = sumOfAges + catsAges[i];
        }
        System.out.println(sumOfAges / catsAges.length);

        numberTask(13);
        /** Print the age of the youngest cat.
         *
         */

        int minAge = Integer.MAX_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (minAge > catsAges[i]) {
                minAge = catsAges[i];
            }
        }
        System.out.println("minAge = " + minAge);

        numberTask(14);
        /** Print the age of the oldest cat.
         *
         */

        int maxAge = Integer.MIN_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (maxAge < catsAges[i]) {
                maxAge = catsAges[i];
            }
        }
        System.out.println("maxAge = " + maxAge);

        numberTask(15);
        /** Print the number of gray cats.
         *
         */

        int grayCats = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Grey")) {
                grayCats ++;
            }
        }
        System.out.println("The number of gray cats = " + grayCats);

        numberTask(16);
        /** Print the cat's name if the cat is in an even-numbered box
         * and is less than 3 years old.
         */
        if (catsNames.length == catsAges.length && catsNames.length != 0) {
            for (int i = 0; i < catsNames.length; i++) {
                if (i % 2 == 0 && catsAges[i] < 3) {
                    System.out.println(catsNames[i] + " is in the box # " + i + " and its age is " + catsAges[i]);
                }
            }
        }

        numberTask(17);
        /** Create an array of even positive numbers whose values are not greater than 10.
         *
         */

        int count = 0;
        for (int i = 0; i <= 10; i += 2) {
            count++;
        }
        System.out.println(count);

        int[] array17 = new int[count];
        int number = 0;
        for (int i = 0; i < array17.length; i++) {
            array17[i] = number;
            number += 2;
            System.out.print(array17[i] + " ");
        }

        numberTask(18);
        /** Write the method that takes an array of input data and returns the average value.
         * Check the operation of the method with a test, if - array parameter catAges.
         */

        System.out.println(averageValue(catsAges));
        test(4, averageValue(catsAges));

        numberTask(19);
        /** Create an array of odd negative numbers between -1000 and -900.
         *
         */

        int counter = 0;
        for (int i = -1000 + 1; i < -900; i+=2 ) {
                counter++;
        }
        System.out.println(counter);

        int[] array19 = new int[counter];
        int number1 = -1000 + 1;
        for (int i = 0; i < array19.length; i++) {
                array19[i] = number1;
                number1 ++;

        }
        System.out.print(Arrays.toString(array19));

        numberTask(20);
        /** Create an array of 10 random positive numbers
         *
         */

        int[] array20 = new int[10];
        for (int i = 0; i < array20.length; i++) {
            array20[i] = ((int) (Math.random() * Integer.MAX_VALUE));
            System.out.println(array20[i]);
        }

        numberTask(21);
        /** Create a method that takes an int array as input and returns the minimum value,
         * maximum value, and average value of all numbers in the array.
         * Check the operation of the method on the array from task 20.
         */

        int[] test2 = getMinMaxAverage(catsAges);
        for (int i = 0; i < test2.length; i++) {
            System.out.println(test2[i] + " ");
        }

        numberTask(22);
        /** Create an array of even numbers and an array of odd numbers
         * from the array elements from task 20.
         */

        int lengthEven = 0;
        int lengthOdd = 0;

        for (int i = 0; i < array20.length; i++) {
            if (array20[i] % 2 == 0) {
                lengthEven++;
            } else {
                lengthOdd++;
            }
        }

        int[] evenNum = new int[lengthEven];
        int[] oddNum = new int[lengthOdd];
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < array20.length; i++) {
            if (array20[i] % 2 == 0 && countEven < evenNum.length) {
                evenNum[countEven] = array20[i];
                countEven++;
            } else if (countOdd < oddNum.length) {
                oddNum[countOdd] = array20[i];
                countOdd++;
            }
        }
        System.out.println(Arrays.toString(evenNum));
        System.out.println(Arrays.toString(oddNum));

        numberTask(23);
        /** Create a 2D array that consists of names, ages, colors of cats.
         * Print all cat data in even-index boxes using a 2D array.
         */

        String[][] array23 = new String[3][8];
        if (catsNames.length == array23[0].length
                && catsAges.length == array23[0].length
                && catsColors.length == array23[0].length) {
            for (int i = 0; i < array23[0].length; i+=2) {
                array23[0][i] = catsNames[i];
                System.out.print(array23[0][i] + " ");
                array23[1][i] = String.valueOf(catsAges[i]);
                System.out.print(array23[1][i] + " ");
                array23[2][i] = catsColors[i];
                System.out.print(array23[2][i] + " ");
                System.out.println();
            }
        }

        numberTask(24);
        /** Create a 2D array of integer random numbers from 1 to 10 of dimension 4*8.
         *
         */

        int[][] array24 = create2DArrayRandom(4,8,10,1);

        System.out.println(Arrays.deepToString(array24));

        numberTask(25);
        /** Print the sum of all even numbers in the array from the task 24.
         *
         */

       int sum = 0;
       for (int c = 0; c < array24[0].length; c ++) {
           for (int r = 0; r < array24.length; r ++) {
               if (array24[r][c] % 2 == 0) {
                   sum += array24[r][c];
               }
           }
       }
        System.out.println("The sum of all even numbers = " + sum);
    }
}
