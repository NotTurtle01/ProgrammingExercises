import java.util.function.Function;

public class Main {

    public static void main(String[] args){

        //Instancia de la clase Persona
        Persona Paco = new Persona();

        //Procedemos a cambiar los atributos de Paco con los "Setters"
        Paco.setEdad(45);
        Paco.setNombre("Paquito");
        Paco.setTelefono(666555444);

        //Procedemos a mostrar los atributos privados de Paco en pantalla con los "Getters"
        System.out.println("Edad: " + Paco.getEdad());
        System.out.println("Nombre: " + Paco.getNombre());
        System.out.println("Teléfono: " + Paco.getTelefono());

        
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    //Getters y Setters de edad

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    //Getters y Setters de nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    //Getters y Setters de telefono

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }

}