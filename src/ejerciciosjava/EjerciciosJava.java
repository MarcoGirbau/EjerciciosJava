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
    
    public boolean palindromo (String pali)
    {
        int numero = pali.length()/2;
        String numerosida = "";
        numerosida = String.valueOf(numero);
        for(int i=0; i<pali.length()/2;i++)
        {
            for(int j=1; j<pali.length()/2;j++)
            {   
                String a = numerosida.substring(i,j);
                String b = pali.substring(pali.length()-j,pali.length()-i);
                if(a.equals(b))
                {
                    return true;
                }
                return false;
            }
        }
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
        String palin = "ACASOHUBOBUHOSACA"; //20 chars
        String palin2 ="ANNA";
//        ejercicio1.ejemplosString();
//        System.out.println(Arrays.toString(ejercicio1.maximo(lista)));
//        System.out.println(Arrays.toString(ejercicio1.maximo(lista2)));
//        System.out.println(Arrays.toString(ejercicio1.maximo(lista2)));
        System.out.println(ejercicio1.palindromo(palin));
        System.out.println(ejercicio1.palindromo(palin2));
    }
    
}
