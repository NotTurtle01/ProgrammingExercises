

public class Main {

    public static void main(String[] args){

        //Instancia de la clase Persona
        Cliente Paco = new Cliente();

        //Procedemos a cambiar los atributos de Paco con los "Setters"
        Paco.setEdad(45);
        Paco.setNombre("Paquito");
        Paco.setTelefono(666555444);
        Paco.setCredito(234.23);

        //Procedemos a mostrar los atributos privados de Paco en pantalla con los "Getters"
        System.out.println("Edad: " + Paco.getEdad());
        System.out.println("Nombre: " + Paco.getNombre());
        System.out.println("Teléfono: " + Paco.getTelefono());
        System.out.println("Crédito: " + Paco.getCredito());

        
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



// ** Clase Cliente heredada de Persona **

class Cliente extends Persona {   

    private double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return this.credito;
    }
    
}

