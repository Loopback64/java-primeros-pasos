import java.util.Scanner;

public class CalculadoraRaices {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los coeficientes de la ecuación cuadrática:");
        System.out.print("Coeficiente a: ");
        double a = input.nextDouble();
        System.out.print("Coeficiente b: ");
        double b = input.nextDouble();
        System.out.print("Coeficiente c: ");
        double c = input.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son reales y diferentes.");
            System.out.println("Raíz 1: " + raiz1);
            System.out.println("Raíz 2: " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("Las raíces son reales e iguales.");
            System.out.println("Raíz: " + raiz);
        } else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("Las raíces son complejas e imaginarias.");
            System.out.println("Raíz 1: " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("Raíz 2: " + parteReal + " - " + parteImaginaria + "i");
        }

        input.close();
    }
}

