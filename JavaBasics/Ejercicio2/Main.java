
public class Main {

    public static void main(String[] args){
        int numerolf = 2;
        int numeroWhile = -1;

        // (1) Bucle IF
        if (numerolf > 0) {
            System.out.println(numerolf + " es un número positivo");
        }

        else if (numerolf == 0) {
            System.out.println(numerolf + " es el número neutro (cero)");
        }

        else {
            System.out.println(numerolf + " es un número negativo");
        }

        // (2) Bucle WHILE
        while (numeroWhile < 3) {
            System.out.println(numeroWhile + " es menor que 3");
            numeroWhile ++;
        }

        // (3) Bucle DO WHILE
        do {
            System.out.println(numeroWhile + " es menor que 4");
            numeroWhile ++;
        }
        while (numeroWhile < 4);

        // (4) Bucle FOR
        for (int numeroFor = 0; numeroFor <= 3; numeroFor ++) {
            System.out.println(numeroFor + " valor de numeroFor en el bucle");
        }

        // (5) Bucle SWITCH/CASE
        String estacion = "Verano";
        switch (estacion) {
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Eso no es una de las 4 estaciones válidas");
                break;

        }

    }


}
