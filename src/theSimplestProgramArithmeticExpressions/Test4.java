package theSimplestProgramArithmeticExpressions;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("Пользовател,введите,периметр какого n-угольника вы хотите просчитать на оси 0xy координат с задаными значениями x1,y1,x2,y2,...,xn,yn");

        System.out.println("Пользователь,введи значение равное количеству вершин ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Значение n = " + n + "-угольник .");
        double[] massivX = new double[n];
        double[] massivY = new double[n];

        for (int i = 0, j = 0; i < n; i++, j++) {
            System.out.println("Пользователь,введи следующее значение 'x' для координат 0xy");
            double nextDoubleX = scanner.nextDouble();
            massivX[i] = nextDoubleX;

            System.out.println("Пользователь,введи следующее значение 'y' для координат 0xy");
            double nextDoubleY = scanner.nextDouble();
            massivY[j] = nextDoubleY;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(massivX[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.print(massivY[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Промежуточные значения (отрезки сторон) " + n + "-угольника равны :" );

        OtrezokNUgolnika value = new OtrezokNUgolnika();
        double[] massivDlin = new double[n];
        massivDlin = value.longAB(massivX, massivY);

        for (double i : massivDlin)
            System.out.println(i + " ");     //Вывод промежуточных значений(значений отрезков) на консоль

        double perimetr = value.perimetrNUgolnika(massivDlin);
        System.out.println("Значение периметра " + n + "-угольника равно "+ value.perimetrNUgolnika(massivDlin));      //Вывод значение периметра n-угольника на консоль
    }
}

