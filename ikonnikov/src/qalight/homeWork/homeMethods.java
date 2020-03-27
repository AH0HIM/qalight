package qalight.homeWork;

import org.apache.log4j.Logger;
import java.util.Scanner;

public class homeMethods {
    Scanner sc = new Scanner(System.in);
    Logger log;
    public homeMethods() {
        log = Logger.getLogger(getClass());
    }

    /**
     * 1. Написать метод возвращающий факториал заданного числа N.
     *
     * @param n
     * @return
     */
    public int findFactorial(int n) {
        try {
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            log.info("Well done");
            return res;
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
            return -1;
        }
    }

    /**
     * 2. Написать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
     *
     * @param x1;
     * @param y1;
     * @param x2;
     * @param y2;
     * @return
     */
    public double getDistance(double x1, double y1, double x2, double y2) {
        double result = -1;
        try {
            log.info("Well done");
            return Math.sqrt((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
        }
        return result;
    }

    /**
     * 3. Написать буленовский метод принимающий на вход 3 переменных типа int, которые обозначают длину стороны для
     * треугольника и возвращает правда или ложь (может ли существовать треугольник с заданными сторонами).
     *
     * @param a
     * @param b
     * @param c
     */
    public boolean isTriangle(double a, double b, double c) {
        boolean result;
        try {
            if (a + b >= c && a + c >= b && b + c >= a && a > 0 && b > 0 && c > 0) {
                log.info("Треугольник существует;");
                result = true;
            } else {
                log.info("Треугольник не существует;");
                result = false;
            }
            log.info("Well done");
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
            result = false;
        }
        return result;
    }

    /**
     * 4. Почитать про вложенный цикл и вывести треугольник из нулей на экран.
     *
     * @param a
     */
    public void printTriangle(int a) {
        try {
            for (int i = 0; i <= a; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("0");
                }
                System.out.println();
            }
            log.info("Well done");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
        }
    }

    /**
     * 5. Задача для тех, кто следить за фигурой. Написать программу, которая вычисляет индекс массы тела.
     */
    public void massIndexOfBody() {
        try {
            System.out.println("Введите свой вес:");
            if (sc.hasNextDouble()) {
                double weight = sc.nextDouble();
                System.out.println("Введите свой рост в метрах:");
                if (sc.hasNextDouble()) {
                    double height = sc.nextDouble();
                    double massIndexOfBody = weight / (height * height);
                    if (massIndexOfBody < 18.5) {
                        System.out.println("Спасибо! Ваш индекс массы тела: " + massIndexOfBody + ";");
                        System.out.println("Дефицит массы тела: меньше чем 18.5, согласно таблицы значений ИМТ;");
                    } else if (massIndexOfBody <= 24.9) {
                        System.out.println("Спасибо! Ваш индекс массы тела: " + massIndexOfBody + ";");
                        System.out.println("Норма: между 18.5 и 24.9, согласно таблицы значений ИМТ;");
                    } else if (massIndexOfBody <= 29.9) {
                        System.out.println("Спасибо! Ваш индекс массы тела: " + massIndexOfBody + ";");
                        System.out.println("Избыточная масса тела: между 25 и 29.9, согласно таблицы значений ИМТ;");
                    } else {
                        System.out.println("Спасибо! Ваш индекс массы тела: " + massIndexOfBody + ";");
                        System.out.println("Ожирение: 30 или больше, согласно таблицы значений ИМТ;");
                    }
                } else {
                    System.out.println("Извините, но введенная информация не является числом.");
                }
            } else {
                System.out.println("Извините, но введенная информация не является числом.");
            }
            log.info("Well done");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
        }
    }

    /**
     * 6. Составить алгоритм определяющий, есть ли среди цифр введенного трехзначного числа — одинаковые.
     * Число вводится с клавиатуры.
     *
     * @return
     */
    public boolean numberEqual() {
        boolean result;
        try {
            System.out.println("Введити трёхзначное число:");
            int number = sc.nextInt();
            int n100 = number / 100;
            int n10 = (number - n100 * 100) / 10;
            int n1 = number - n100 * 100 - n10 * 10;
            if (n100 == n10 && n1 == n100 && n10 == n1) {
                System.out.println("Все три цифры числа одинаковые;");
                result = true;
            } else if (n100 == n10 && n100 != n1) {
                System.out.println("Две цифры числа одинаковые;");
                result = true;
            } else if (n10 == n1 && n10 != n100) {
                System.out.println("Две цифры числа одинаковые;");
                result = true;
            } else if (n1 == n100 && n1 != n10) {
                System.out.println("Две цифры числа одинаковые;");
                result = true;
            } else {
                System.out.println("Одинаковых цифр в числе нет;");
                result = false;
            }
            log.info("Well done");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
            result = false;
        }
        return result;
    }

    /**
     * 7. Написать метод высчитывающий сколько литров нужно, чтобы заполнить бассейн. Принимает на вход 3-три величины
     * глубину, длину и ширину бассейна.
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public double poolLiquid(double a, double b, double c) {
        try {
            if (a > 0 && b > 0 && c > 0) {
                return a * b * c * 1000;
            } else {
                log.error("Error");
                return -1;
            }
        } catch (Exception ex) {
            log.error("Something went wrong");
            return -1;
        }
    }
/*  public int poolLiquid(int a, int b, int c) {
        try {
            int temp = a * b * c * 1000;
            System.out.println(temp + " литров воды нужно для заполнения бассейна;");
            log.info("Well done");
            return temp;
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Error");
            return -1;
        }
    }
*/

    /**
     * 8. При поступлении в вуз абитуриенты, получившие двойку на первом экзамене, ко второму не допускаются.
     * В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене. Подсчитать, сколько человек не
     * допущено ко второму экзамену.
     *
     * @param A
     * @return
     */
    public int count(int[] A) {
        try {
            int c = 0;
            for (int n : A) {
                c += 1 - n / 3;
            }
            log.info("Well done");
            return c;
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
            return -1;
        }
    }

    /**
     * 9. Вы хотите обменять доллары на рубли. Есть информация о стоимости купли-продажи в банках города. В городе N 
     * банков. Составьте программу, определяющую, какой банк выбрать, чтобы выгодно обменять доллары на рубли.
     *
     * @param banks
     * @param currencyExchange
     * @return
     */
    public String findBestBank(String[] banks, double[] currencyExchange) {
        String result = "";
        try {
            int maxRate = 0;
            int l = banks.length;
            for (int i = 0; i < l; i++) {
                if (currencyExchange[i] > currencyExchange[maxRate]) {
                    maxRate = i;
                }
            }
            log.info("Well done");
            return banks[maxRate];
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
        }
        return result;
    }

    /**
     * 10. Вывести на экран строку S указанное количество раз N.
     *
     * @param S
     * @param N
     * @return
     */
    public String printString(String S, int N) {
        try {
            String result = "";
            for (int i = 0; i < N; i++) {
                result += S;
                System.out.println(N);
            }
            log.info("Well done");
            return result;
        } catch (Exception ex) {
            log.error("Something went wrong");
            return "";
        }
    }
/*  public void printString(String S, int N) {
        try {
            for (int i = 0; i < N; i++) {
                System.out.println(S);
            }
            log.info("Well done");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Error");
        }
    }
*/

    /**
     * 12. Вычислить площадь треугольника.
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public double findAreaOfTriangle(double a, double b, double c) {
        double result = -1;
        try {
            double s = -1;
            if (isTriangle(a, b, c)) {
                double p = (a + b + c) / 2;
                s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            } else {
                return s;
            }
            log.info("Well done");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
        }
        return result;
    }

    /**
     * 13. Вычислить площадь правильного шестиугольника со стороной А, используя подпрограмму вычисления площади
     * треугольника.
     *
     * @param a
     * @return
     */
    public double findHexagonSquare(double a) {
        double var = -1;
        if (findAreaOfTriangle(a, a, a) == -1) {
            return var;
        }
        try {
            var = findAreaOfTriangle(a, a, a) * 6;
            log.info("Well done");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Something went wrong");
        }
        return var;
    }

/*  public double findHexagonSquare(double a) {
        double result = -1;
        try {
            log.info("Well done");
            return findAreaOfTriangle(a, a, a) * 6;
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Error");
        }
        return result;
    }
}
*/

//11 Написать программу нахождения суммы большего и меньшего из 3-х чисел.
//14 Написать программу вычисления суммы факториалов всех нечетных чисел от 1 до 9.
//15 Написать программу которая возвращает стоимость покупки с учетом дисконта. Если покупка совершена на сумму до 1000
// грн то скидка не положена Если от 1001 грн до 2000 скидка 2% от 2001 до 5000 скидка 5% и свыше 5001 скидка 7%.
}