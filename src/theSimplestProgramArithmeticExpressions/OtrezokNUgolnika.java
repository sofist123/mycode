package theSimplestProgramArithmeticExpressions;


public class OtrezokNUgolnika {
    public double[] longAB(double[] massivX, double[] massivY) {

        int n = massivX.length;
        double[] massivOtrezkov = new double[n];

        for (int i = 0; i < n - 1; i++) {
            massivOtrezkov[i] = Math.sqrt(((massivX[i + 1] - massivX[i]) * (massivX[i + 1] - massivX[i])) + ((massivY[i + 1] - massivY[i]) * (massivY[i + 1] - massivY[i])));

            // System.out.println(massivOtrezkov[i]);
        }
        massivOtrezkov[n - 1] = Math.sqrt(((massivX[n - 1] - massivX[0]) * (massivX[n - 1] - massivX[0])) + ((massivY[n - 1] - massivY[0]) * (massivY[n - 1] - massivY[0])));
        return massivOtrezkov;
    }

    public double perimetrNUgolnika(double[] massivDlin) {

        double result = 0;

        for (int i = 0; i < massivDlin.length; i++) {
            result = result + massivDlin[i];
        }
        // System.out.println(result);           //Почему-то не выводит значение периметра на консоль в классе
        return result;
    }
}