public record Paciente (String nombre, int edad, double peso) {

    // Método para mostrar la información
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso + " kg");
    }
}