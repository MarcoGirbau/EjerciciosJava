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
        String a = "";
        String cancer = pali.toUpperCase();
        cancer = cancer.replaceAll("Ñ", "N");
        cancer = cancer.replaceAll("Á", "A");
        cancer = cancer.replaceAll("É", "E");
        cancer = cancer.replaceAll("Í", "I");
        cancer = cancer.replaceAll("Ó", "O");
        cancer = cancer.replaceAll("Ú", "U");
        cancer = cancer.replaceAll("\\W", "");
        for(int i=0; i<pali.length();i++)
        {
            if(pali.charAt(i) != '_')
            {
                a = a + pali.charAt(i);
            }
        }
        String b = "";
        int sida = a.length();
        for(int i=0; i<sida ;i++)
        {
            b = b + pali.charAt(sida-i-1);
        }
        return pali.equals(b);
    }
    
    private boolean isograma (String iso)
    {
        
        return false;
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
//        ejercicio1.ejemplosString();
//        System.out.println(Arrays.toString(ejercicio1.maximo(lista)));
//        System.out.println(Arrays.toString(ejercicio1.maximo(lista2)));
//        System.out.println(Arrays.toString(ejercicio1.maximo(lista2)));
        System.out.println(ejercicio1.palindromo(palin));
        System.out.println(ejercicio1.palindromo(palin2));
    }
    
}
