import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double area, base, altura;
        System.out.println("CALCULADORA DE AREAS");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Circulo");
        System.out.println("5. Salir");
        System.out.print("Elija una opcion: ");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ha elegido cuadrado");
                System.out.print("Ingrese el lado del cuadrado: ");

                double lado = scanner.nextDouble();
                // Calcular el área del cuadrado
                area = lado * lado;
                System.out.println("El área del cuadrado es: " + area);
                break;
            case 2:
                System.out.println("Ha elegido rectangulo");
                System.out.print("Ingrese la base del rectángulo: ");
                base = scanner.nextDouble();

                System.out.print("Ingrese la altura del rectángulo: ");
                altura = scanner.nextDouble();

                // Calcular el área del rectángulo
                area = base * altura;

                System.out.println("El área del rectángulo es: " + area);
                break;
            case 3:
                System.out.println("Ha elegido triangulo");
                System.out.print("Ingrese la base del triángulo: ");
                base = scanner.nextDouble();

                System.out.print("Ingrese la altura del triángulo: ");
                altura = scanner.nextDouble();

                // Calcular el área del triángulo
                area = (base * altura) / 2;

                System.out.println("El área del triángulo es: " + area);
                break;
            case 4:
                System.out.println("Ha elegido circulo");
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();

                // Calcular el área del círculo
                area = Math.PI * Math.pow(radio, 2);

                System.out.println("El área del círculo es: " + area);
                break;
            case 5:
                System.out.println("Ha elegido salir");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }



    }

}
