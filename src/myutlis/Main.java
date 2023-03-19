package myutlis;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // invertir cadena de texto
        String a = "Hola Mundo";
        System.out.println("-----Inverteix text-----");
        System.out.println(MyUtlis.inverteix(a));

        //calcular edad
        int day = 19, month = 8, year = 2003;
        System.out.println("\n-----Calcula edat-----");
        System.out.println(MyUtlis.edat(day, month, year));

        //calcular factorial
        int numfactorial;
        numfactorial = 5;
        System.out.println("\n-----Calcula factorials-----");
        System.out.println(MyUtlis.factorial(numfactorial));
    }

}
