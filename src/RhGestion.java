import java.util.Scanner;

public class RhGestion
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();

        boolean salir = false;
        while (!salir) {
            System.out.println("");
            System.out.println("-------- RH Gestión Funval --------");
            System.out.println("");
            System.out.println("Ingresa el número de la opción deseada: ");
            System.out.println("");
            System.out.println("Presione 1 para Contratar un empleado");
            System.out.println("Presione 2 para Despedir un empleado");
            System.out.println("Presione 3 para Aumentar el salario");
            System.out.println("Presione 4 para Lista de empleados");
            System.out.println("Presione 5 para Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion)
            {
                case 1 ->
                {
                    System.out.print("Ingresa el nombre del empleado: ");
                    String nombreContratar = scanner.nextLine();
                    System.out.print("Ingresa la edad del empleado: ");
                    int edadContratar = scanner.nextInt();
                    System.out.print("Ingresa el salario del empleado: ");
                    double salarioContratar = scanner.nextDouble();
                    empresa.contratarEmpleado(nombreContratar, edadContratar, salarioContratar);
                }
                case 2 ->
                {
                    System.out.print("Ingresa el nombre del empleado a despedir: ");
                    String nombreDespedir = scanner.nextLine();
                    empresa.despedirEmpleado(nombreDespedir);
                }
                case 3 ->
                {
                    System.out.print("Ingresa el nombre del empleado para aumentar salario: ");
                    String nombreAumentar = scanner.nextLine();
                    System.out.print("Ingresa el porcentaje de aumento: ");
                    double porcentajeAumento = scanner.nextDouble();
                    empresa.aumentarSalario(nombreAumentar, porcentajeAumento);
                }
                case 4 -> empresa.listarEmpleados();
                case 5 -> salir = true;
                default -> System.out.println("Error. Por favor, ingresa un número de las opciónes.");
            }

            System.out.println();
        }

        System.out.println("Sesión Terminada");
        scanner.close();
    }
}
