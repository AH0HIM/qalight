package qalight.homeWork;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class homeArrayMethods {

    Logger log;
    public homeArrayMethods() {
        log = Logger.getLogger(getClass());
    }

    /**
     * 1. Дано два числа. Найти минимальное число из них.
     * @param a
     * @param b
     * @return
     */
    public int findMinValue(int a, int b) {
        int result;
        try {
            if (a < b) {
                result = a;
            } else {
                result = b;
            }
            log.info("Well done");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
            return -1;
        }
        return result;
    }

/*  public void findMinValue(int a, int b) {
        try {
            int num = a;
            int num1 = b;
            Math.min(num, num1);
            System.out.println("Минимальное из двух чисел: " + Math.min(num, num1) + ";");
            log.info("Well done");
        }
        catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
        }
    }
*/

    /**
     * 2. Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.
     * @param mass
     * @param k
     * @return
     */
    public int sumOfElements(int[] mass, int k) {
        try {
            int sum = 0;
            int l = mass.length;
            for (int i = 0; i < l; i++) {
                if (mass[i] % k == 0) {
                    sum += mass[i];
                }
            }
            log.info("Well done");
            return sum;
        } catch (Exception ex){
            ex.printStackTrace();
            log.error("Something went wrong");
            return -1;
        }
    }

    /**
     * @param n
     * @return
     */
    public int[] mass(int n) {
        try {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = (int) (Math.random() * 100);
                System.out.print(array[i] + " ");
            }
            log.info("Well done");
            return array;
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
            return new int [0];
        }
    }

    /**
     * 3. В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
     * @param array
     * @return
     */
    public List getZeroArray(int[] array) {
        List list = new ArrayList();
        try {
            int l = array.length;
            for (int i = 0; i < l; i++) {
                if (array[i] == 0){
                    list.add(i);
                }
            }
            log.info("Well done");
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
            return list;
        }
    }
/*    public int[] getZeroArray(int[] arr) {
        try {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    count++;
                }
            }
            int[] arr1 = new int[count];
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr1[temp] = i;
                    System.out.print(arr1[temp] + "  ");
                    temp++;
                }
            }
            log.info("Well done");
            return arr1;
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Something went wrong");
            return new int[0];
        }
    }
*/

    /**
     * 4. Дан целочисленный массив чисел (положительных и отрицательных). Выяснить, какое число встречается раньше –
     * положительное или отрицательное.
     * @param array
     * @return
     */
    public String findPositiveOrNegativeNumberFirst(int[] array) {
        String firstNumber = "";
        try {
            if (array[0] >= 0) {
                firstNumber = "positive";
            }
            else {
                firstNumber = "negative";
            }
            log.info("Well done");
            return firstNumber;
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
            return firstNumber;
        }
    }

    /**
     * 5. Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.
     * @param array
     * @return
     */
    /*public boolean findOutSortOfMass(int[] array) {
        boolean result;
        try {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    System.out.println("Отсортировано по убыванию;");
                    result = false;
                }
            }
            System.out.println("Отсортировано по возрастанию;");
            result = true;
            log.info("Well done");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
            result = false;
        }
        return result;
    }

     */

    public boolean findOutSortOfMass(int[] array){
        try {
            int l = array.length;
            boolean result = true;
            for (int i = 1; i < l; i++) {
                if (array[i - 1] > array[i]) {
                    result = false;
                    log.info("Массив чисел отсортирован");
                    return result;
                } /*else {
                    System.out.println("Массив чисел не отсортирован");
                }*/
            }
            log.info("Well done");
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
            return false;
        }
    }

/*
    public boolean findOutSortOfMass(int[] array){
        boolean result = true;
        try{
           int l = array.length;
           for (int i = 0; i < l; i++){
               if (array[i] <= array[i - 1]){
                   System.out.println("Массив чисел отсортирован");
                   result = false;
               }
               else {
                   System.out.println("Массив чисел не отсортирован");
                   result = true;
               }
           }
           System.out.println("Well done!");
       }
       catch (Exception ex){
           ex.printStackTrace();
           System.out.println("Error");
           result = false;
       }
        return result;
    }
*/

    /**
     * 7. Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать количество замен.
     * @param array
     * @param Z
     * @return
     */
    public int[] replaceElementsToNumbersZ(int[] array, int Z) {
        try {
            long counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > Z) {
                    array[i] = Z;
                    counter++;
                }
            }
            System.out.print(" Количество замен: " + counter + " ");
            log.info("Well done");
            return array;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
            return new int[0];
        }
    }
/*  public List replaceElementsToNumbersZ(int[] array, int k){
        List listWithReplacing = new ArrayList();
        try {
            int l = array.length;
            int counter = 0;
            for (int i = 0; i < l; i++){
                if (array[i] > k){
                    listWithReplacing.add(k);
                    counter ++;
                }else {
                    listWithReplacing.add(array[i]);
                }
            }
            return listWithReplacing;
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
            return listWithReplacing;
        }
    }
*/

    /**
     * 8. Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
     * @param a
     * @return
     */

    public int[] findNegativePositiveAndZeroElements(int[] a) {
        try {
            int[] count = new int[3];
            int size = a.length;
            count[0] = count[1] = count[2] = 0;
            for (int i = 0; i < size; i++) {
                if (a[i] > 0) {
                    count[0]++;

                } else if (a[i] < 0) {
                    count[1]++;

                } else {
                    count[2]++;
                }
            }
            System.out.print(" Положительных: " + count[0] + ", ");
            System.out.print("Отрицательных: " + count[1] + ", ");
            System.out.print("Нулевых: " + count[2] + ";");
            log.info("Well done");
            return count;
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
            return new int[0];
        }
    }

    /**
     * 10. Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.
     * @param array
     */
    public void printCorrectNumbers(int[] array) {
        try {
            int l = array.length;
            if (array != null) {
                for (int i = 0; i < l; i++) {
                    if (array[i] <= i) {
                        System.out.print(array[i] + " ");
                    }
                }
            }
            log.info("Well done");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
        }
    }

    /**
     * 12. Дан массив чисел.  Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)
     * @param arr
     * @return
     */
    public int[] replaceElements(int[] arr) {
        try {
            int size = arr.length;
            int temp = 0;
            for (int i = 0; i < size - 1; i += 2) {
                temp = arr[i];
                arr[i] = arr[1 + i];
                arr[i + 1] = temp;
            }
            log.info("Well done");
            return arr;
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
            return new int[0];
        }
    }

    /**
     * 14. Дан массив чисел. Найти mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).
     * @param mass
     * @return
     */
    public int sumOfValueMax(int[] mass) {
        try {
            int arrayLength = mass.length;
            int maxValue = mass[0];
            int minValue = mass[1];
            for(int i = 1; i < arrayLength; i++) {
                if(i % 1 == 0){
                    if (maxValue < mass[i]) {
                        maxValue = mass[i];
                    }
                }
                else {
                    if (minValue > mass[i]) {
                        minValue = mass[i];
                    }
                }
            }
            System.out.println(maxValue + ";");
            log.info("Well done");
            return maxValue + minValue;
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
            return -1;
        }
    }

    /**
     * 18. Дан массив чисел. Среди них есть равные. Найти первый максимальный элемент массива и заменить его нулем.
     * @param array
     * @return
     */
    public int[] findMaxValueOfArrayAndReplaceOnZero(int [] array) {
        try {
            int maxValue = 0;
            int indexOfMaxValue = 0;
            int l = array.length;
            for (int i = 0; i < l; i++) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                    indexOfMaxValue = i;
                }
            }
            System.out.print(" Максимальное число массива: " + array[indexOfMaxValue]);
            array[indexOfMaxValue] = 0;
            System.out.print(" меняем на ноль " + array[indexOfMaxValue]);
            log.info("Well done");
            return array;
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
            return new int[0];
        }
    }
//6. Дан массив чисел. Создать массив из четных чисел этого массива. Если таких чисел нет, то вывести сообщение
// об этом факте.
/*
    public int [] masiv(int[] array){
        int[] temp = new int[array.length];
        int count = 0;
        for(int n:array){
            if(n%2==0)
                temp[count++] = n;
            if (count != 0)
                System.out.println("Массив без четных чисел");
                return Arrays.copyOf(temp, count);

        }
        return null;
    }
*/
/*  public List evenValueOfArray(int[] array){
        List listOfEvenValue = new ArrayList();
        try {
            int l = array.length;
            for (int i = 0; i < l; i++) {
                if (array[i] % 2 == 0) {
                    listOfEvenValue.add(array[i]);
                }
            }
            return listOfEvenValue;
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Error");
            return listOfEvenValue;
        }
    }
*/
//9. Дан массив чисел. Поменять местами наибольший и наименьший элементы.
//11. Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.
//13. Дан массив чисел, среди которых имеется один нуль. Вывести на печать все числа, включительно до нуля.
/*  public int printValuesAndZero (int[] array){
            for(int value:array){
                System.out.println(value);
                if(value == 0) return;
            }
    }
*/
//15. Дан массив целых положительных чисел. Найти произведение только тех чисел, которые больше заданного числа М.
// Если таких нет, то выдать сообщение об этом.
/*  public int findMaxValue(int [] array, int M) {
        int result = 1;
        boolean res = false;
        try {
            int maxValue = array.length;
            for(int i = 0; i < maxValue; i++){
                if (array[i] > M) {
                    result *= array[i];
                    res = true;
                }
                if (res){
                    return result;
                }
                else{
                    return -1;
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Error");
            return -1;
        }
    }

*/
//16. Дан массив положительных и отрицательных чисел.  Заменить нулями те числа, величина которых по модулю больше
// максимального числа (|a[i]| > max{ a[0], a[1], ..., a[n]})
//17. Дан массив чисел с положительными и отрицательными элементы. Вычислить произведение отрицательных элементов P1 и
// произведение положительных элементов Р2. Сравнить модуль Р2 с модулем Р1 и указать, какое из произведений
// по модулю больше.
//19. Дан массив чисел. Образовать новый массив, элементами которого будут элементы исходного, оканчивающиеся
// на цифру k.
}