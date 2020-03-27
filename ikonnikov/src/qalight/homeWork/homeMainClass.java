package qalight.homeWork;

import org.junit.Assert;

public class homeMainClass{
    public static void main(String[] args){
        int [] mass = new int[10];

        homeArrayMethods arrayMethods = new homeArrayMethods();
        homeMethods methods = new homeMethods();


        System.out.println("Задачи из файла'Level1':");

        System.out.println("1. ");
        Assert.assertEquals("Incorrect value", 5,
                arrayMethods.findMinValue(5,7));

        System.out.println("2. ");
        Assert.assertEquals("Incorrect value", 6,
                arrayMethods.sumOfElements(new int[]{0, 1, 2, 3, 4}, 2));


        System.out.println("3. ");
        Assert.assertEquals("wrong size", 1,
                arrayMethods.getZeroArray(new int[]{1, 0, 3}).size());


        System.out.println("4. ");
        Assert.assertEquals("The first number is not positive","positive",
                arrayMethods.findPositiveOrNegativeNumberFirst(new int[]{1, 0, -2}));
        Assert.assertEquals("The first number is not negative","negative",
                arrayMethods.findPositiveOrNegativeNumberFirst(new int[]{-1, 2, 0}));

        System.out.println("5. ");
        Assert.assertEquals(false,
                arrayMethods.findOutSortOfMass(new int[]{3, 1, 2}));
        Assert.assertEquals(true,
                arrayMethods.findOutSortOfMass(new int[]{1, 2, 3}));
        Assert.assertTrue("true",
                arrayMethods.findOutSortOfMass(new int[]{1, 2, 3}));
        Assert.assertFalse("false",
                arrayMethods.findOutSortOfMass(new int[]{3, 1, 2}));

        System.out.println("7. ");
        //System.out.print(Arrays.toString(array));
        //System.out.println(Arrays.toString(arrayMethods.replaceElementsToNumbersZ(array, 4)) + ";");
        //Assert.assertEquals(2, arrayMethods.replaceElementsToNumbersZ(new int[]{6, 2, 3, 8}, 5));

        System.out.println("8. ");
        //System.out.print(Arrays.toString(array));
        //arrayMethods.findNegativePositiveAndZeroElements(array);
        //Assert.assertEquals("\npositive: 1\nnegative: 1\nzero: 1\n", arrayMethods.findNegativePositiveAndZeroElements(new int[]{-1, 2, 0}));

        System.out.println("10. ");
        //int[] array3 = {1, 0, 15, -3, 4, 8, 11};
        //System.out.print(Arrays.toString(array3) + " числа, которые выполняют условие arr[i] ≤ i: ");
        //arrayMethods.printCorrectNumbers(array3);
        //System.out.println(";");

        System.out.println("12. ");
        //System.out.print(Arrays.toString(array)+(" меняем местами: "));
        //System.out.print(Arrays.toString(arrayMethods.replaceElements(array))+ ";");
        //System.out.println("");

        System.out.println("14. ");
        Assert.assertEquals(5, arrayMethods.sumOfValueMax(new int[]{1, 2, 3}));

        System.out.println("18.  ");
        //System.out.print(Arrays.toString(array));
        //arrayMethods.findMaxValueOfArrayAndReplaceOnZero(array);

        //System.out.println("6. ");
        // System.out.println("9. ");
        // System.out.println("11. ");
        // System.out.println("13. ");
        //System.out.println("15. ");
        // System.out.println("16. ");
        // System.out.println("17. ");
        // System.out.println("19. ");

        System.out.println("\n" + "Задачи из файла'JavaHomeTask':");

        System.out.println("1. ");
        Assert.assertEquals("Incorrect factorial's calculation", 24,
                methods.findFactorial(4));

        System.out.println("2. ");
        Assert.assertEquals("Wrong distance between points",0,
                methods.getDistance(0, 0, 0, 0), 0.01);

        System.out.println("3. ");
        Assert.assertTrue("The triangle does not exist",
                methods.isTriangle(10, 10, 10));

        System.out.println("4. ");
        //methods.printTriangle(5);

        System.out.println("5. ");
        //methods.massIndexOfBody();

        System.out.println("6. ");
        //methods.numberEqual();

        System.out.println("7. ");
        Assert.assertEquals("Incorrect volume",1000,
                methods.poolLiquid(1, 1, 1), 0.01);

        System.out.println("8. ");
        Assert.assertEquals("Wrong", 4,
                methods.count(new int[]{2, 5, 4, 2, 3, 4, 2, 5, 2, 5, 4}));

        System.out.println("9. ");
        Assert.assertEquals("Wrong bank","ПравексБанк",
                methods.findBestBank(new String[]{"ПриватБанк", "Монобанк", "Ощадбанку","ПравексБанк"},
                        new double[] {69.2, 69.86, 64.5, 70.27}));

        System.out.println("10. ");
        Assert.assertEquals("Wrong string","sssss", methods.printString("s", 5));

        System.out.println("12.");
        //Assert.assertEquals("Wrong area of a triangle", 43.301,
          //      methods.findAreaOfTriangle(10,10, 10), 0.001);
        Assert.assertEquals("Wrong area of a triangle", -1,
                methods.findAreaOfTriangle(0,0,0), 0.001);

        System.out.println("13. ");
        //Assert.assertEquals("Wrong area of a hexagon",43.301,
                //methods.findHexagonSquare(10), 0.01);
        Assert.assertEquals("Wrong area of a hexagon", -1,
                methods.findHexagonSquare(0), 0.01);


        // System.out.print("11. ");
        // System.out.print("14. ");
        // System.out.print("15. ");

    }
}
