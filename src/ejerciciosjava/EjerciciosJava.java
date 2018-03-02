/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Arrays;

/**
 *
 * @author Marco Girbau
 */
public class EjerciciosJava 
{
    public int[] maximo(int [] listaNumeros)
    {
        int [] numerosMaximos = {0,0};
        for(int i=0; i<listaNumeros.length;i++)
        {
            if(numerosMaximos[0] < listaNumeros[i])
            {
                numerosMaximos[1] = numerosMaximos[0];
                numerosMaximos[0] = listaNumeros[i];
            }
            else if (numerosMaximos[1] < listaNumeros[i])
            {
                numerosMaximos[1] = listaNumeros[i];
            }
        }
        return numerosMaximos;
    }
    
    private boolean palindromo (String pali)
    {
        boolean OpelCorsa = true;
        String cancer = pali.toUpperCase();
        cancer = cancer.replaceAll("Ñ", "N");
        cancer = cancer.replaceAll("Á", "A");
        cancer = cancer.replaceAll("É", "E");
        cancer = cancer.replaceAll("Í", "I");
        cancer = cancer.replaceAll("Ó", "O");
        cancer = cancer.replaceAll("Ú", "U");
        cancer = cancer.replaceAll("\\W", "");
        for(int i=0; i<pali.length() / 2 ;i++)
        {
            if(cancer.charAt(i) != cancer.charAt(cancer.length() - i - 1) && OpelCorsa == true)
            {
                OpelCorsa = false;
            }
        }
        return OpelCorsa;
    }
    
    private boolean isograma (String cancer)
    {
        boolean sida = true;
        for(int i = 0; i < cancer.length();i++)
        {
            int repetida = 0;
            for(int j = 0; j < cancer.length();i++)
            {
                if(cancer.charAt(i) == cancer.charAt(j))
                {
                    repetida++;
                }
                if(repetida > 1)
                {
                    sida = false;
                }
            }
        }
        return sida;
    }
    /**
     * @param args the command line arguments
     */
    
   public void ejemplosString()
    {
//        String cadena1 = "Acaso hubo buhos aca";
//        String cadena2 = "Lo mejor es morirse y punto";
//        System.out.println(cadena1.charAt(cadena1.length()-1));
//        System.out.println(cadena1.substring(11,16));
//        System.out.println(cadena1.substring(17));
//        
//        String [] arrayPalabras = cadena1.split(" ");
//        System.out.println(arrayPalabras[2]);
//        System.out.println(cadena1.indexOf('h'));
 }
    public static void main(String[] args) 
    {
        EjerciciosJava ejercicio1 = new EjerciciosJava();
        int[] lista = {50,31,27,2,5,99};
        int[] lista2 = {150,31,27,2,5,99};
        String palin = "ACASO HUBO BUHOS ACA"; //20 chars
        String palin2 ="ANA";
        String iso = "Cancer";
        String iso2 = "ANNA";
//        ejercicio1.ejemplosString();
//        System.out.println(Arrays.toString(ejercicio1.maximo(lista)));
//        System.out.println(Arrays.toString(ejercicio1.maximo(lista2)));
//        System.out.println(Arrays.toString(ejercicio1.maximo(lista2)));
//        System.out.println(ejercicio1.palindromo(palin));
//        System.out.println(ejercicio1.palindromo(palin2));
        System.out.println(ejercicio1.isograma(iso));
        System.out.println(ejercicio1.isograma(iso2));
    }
    
}
