public class Estudiante {
    String nombre;
    int edad;

    public Estudiante() {
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + this.nombre + " y tengo " + this.edad + " años.");
    }
}