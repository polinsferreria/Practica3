/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myutlis;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author pol^^
 */
public class MyUtlis {

    /**
     *
     * @param cadena String cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String resultat = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultat += cadena.charAt(i);
        }
        return resultat;
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        int resultat = 0;//la edad
        Calendar fechaDeNacimiento = new GregorianCalendar(year, month - 1, day);
        Calendar Hoy = new GregorianCalendar();

        if (fechaDeNacimiento.after(Hoy)) { // fecha imposible
            return -2;
        }

        resultat = Hoy.get(Calendar.YEAR) - fechaDeNacimiento.get(Calendar.YEAR);
        if (fechaDeNacimiento.get(Calendar.MONTH) >= Hoy.get(Calendar.MONTH)
                && fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) > Hoy.get(Calendar.DAY_OF_MONTH)) {// aún no ha cumplido años
            resultat--;
        }

        if (resultat > 130) { // edad demasiado grande
            return -1;
        }
        return resultat;//la seva edad
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static int factorial(int numero) {
        int resultat = 0;
        if (numero == 0) {
            resultat = 1;
        } else {
            if (numero > 2) {
                for (int i = numero; i > 1; i--) {
                    resultat= numero *= i - 1;
                }
            }

            if (numero < 0) {
                resultat = -1;
            }
            
        }
        return resultat;
    }

}
