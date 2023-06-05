

public class Main {

    public static void main(String[] args){
        suma(10,30,20); //Ejercicio 1: Suma de 3 números naturales en el Main.

        Coche AstonMartin = new Coche(); //Ejercicio 2: Instancia de clase Coche y añadir 1 puerta.
        AstonMartin.Añadir_Puerta();
        AstonMartin.get_Puertas();

    }

    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;

        System.out.println(resultado + " -> Resultado de la suma de tres enteros");
    }

}

class Coche {
    public int numero_puertas = 0;

    public void Añadir_Puerta() {
        this.numero_puertas ++;
    }
    
    public void get_Puertas() {
        System.out.println(this.numero_puertas + " puerta");
    }
    
}