import java.util.Scanner;

public class ScannerPaciente {

    public Paciente recolectarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del paciente: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad del paciente: ");
        int edad = scanner.nextInt();

        System.out.print("Peso del paciente: ");
        double peso = scanner.nextDouble();

        return new Paciente(nombre, edad, peso);
    }
}

