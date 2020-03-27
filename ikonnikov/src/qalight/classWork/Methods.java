package qalight.classWork;

import org.apache.log4j.Logger;

public class Methods {
    Logger log;
    public Methods () {
        log = Logger.getLogger(getClass());
    }

    /**
     * 1. Написать метод возвращающий факториал заданного числа N.
     * @param a
     * @return
     */
    public int factorial(int a) {
        int f = a;
        for (int i = a - 1; i > 1; i--){
            f = f * i;
        }
        return f;
    }

    /**
     * 12. Вычислить площадь треугольника.
     * @param a
     * @param b
     * @param c
     * @return
     */
    public double triangleSquare(double a, double b, double c){
        double result = -1;
        try {
        double s = -1;
        if(isTriangle(a, b, c)) {
            double p;
            p = (a + b + c) / 2;
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        else {
            log.warn("Треугольник не существует");
        }
            log.info("Well done");
        return s;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            log.error("Error");
        }
        return result;
    }

    /**
     * 3. Написать буленовский метод принимающий на вход 3 переменных типа int которые обозначают длину стороны для
     * треугольника и возвращает правда или ложь (может ли существовать треугольник с заданными сторонами) Вспоминаем
     * свойство треугольника ни одна сторона не должна быть длиннее суммы двух других.
     * @param a
     * @param b
     * @param c
     * @return
     */
    public boolean isTriangle(double a, double b, double c){
        boolean result;
        try {
            if (a >= b + c || b >= a + c || c >= a + b || a <= 0 || b <= 0 || c <= 0){
                /** (a < b && b < a + c && c && < a + b) **/
                log.info("Треугольник не существует");
                result = false;
            }
            else{
                log.error("Треугольник существует");
                result = true;
            }
            log.warn("Well done!");
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Error!");
            result = false;
        }
        return result;
    }
    /**
     * 13. Вычислить площадь правильного шестиугольника со стороной a, используя подпрограмму
     * вычисления площади треугольника.
     * @param a
     * @return
     */
    public double sqrSixAngles(double a) {
        double var = -1;
        if (triangleSquare(a, a, a) == -1) {
            return var;
        }
        try {
            var = triangleSquare(a, a, a) * 6;
            log.info("Well done");
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Error");
        }
        return var;
    }
    /**
     * Печатаем строку a b раз.
     * @param a
     * @param b
     */
    public void prnString(String a, int b) {
        try {
            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }
            log.info("Well done");
        }
        catch (Exception ex) {
            ex.printStackTrace();
            log.error("Error");
        }
    }
    /**
     * @param a
     * @return
     */
    public boolean isNumberEquals(int a){
        boolean result;
        try {
            int first = a / 100;
            int second = a % 10;
            int third = a % 10;
            result = (first == second || third == first || second == first);
            log.info("Well done");
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Error");
            result = false;
        }
        return result;
    }

    /**
     * @param a
     */
    public boolean printTriangle(int a) {
        boolean result;
        try {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("0");
                }
                System.out.println();
            }
            result = true;
            log.info("Well done");
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Error");
            result = false;
        }
        return result;
    }

    /**
     * @param a
     * @param b
     * @return
     */
    public double divide(int a, int b){
        double div;
        try {
            log.info("Try div numbers");
            return a / b;
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Cannot divide");
            return 1;
        }
        finally {
            System.out.println("Block finally");
        }
    }
}
