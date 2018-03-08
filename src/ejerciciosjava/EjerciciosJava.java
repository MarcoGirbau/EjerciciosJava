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
        boolean a = true;						
	int lr;							
	for (int i = 0; i < cancer.length(); i++) 
        {				
	    lr = 0;						
	    for (int j = 0; j < cancer.length(); j++) 
            {				
		if (cancer.charAt(i) == cancer.charAt(j)) 
                {			
		    lr++;
		}
	    }
	    if (lr > 1) 
            {						
		a = false;
	    }
	}
	return a;
    }
    /**
     * @param args the command line arguments
     */
    
    public void calendario(int patata) 
    {
	int dia = 0;							
	String[] calendario = new String[31];					
	for (int i = 0; i < patata; i++) 
        {					
	    if (dia < 7) 
            {
		System.out.print("XX ");
		dia++;
	    } else 
            {								
		System.out.println();
		System.out.print("XX ");
		dia = 1;
	    }
	}
	for (int i = 0; i < calendario.length; i++) 
        {				
	    if (dia < 7) 
            {						
		if (i < 9) 
                {
		    System.out.print("0");
		}
		System.out.print((i + 1) + " ");
		dia++;
	    } else 
            {
		System.out.println();
		if (i < 9) 
                {
		    System.out.print("0");
		}
		System.out.print((i + 1) + " ");
		dia = 1;
	    }
	}
	for (int i = dia; i < 7; i++) 
        {					
	    System.out.print("XX ");
	}
	System.out.println();
    }
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
//        ejercicio1.ejemplosString();
//        System.out.println(Arrays.toString(ejercicio1.maximo(lista)));
//        System.out.println(Arrays.toString(ejercicio1.maximo(lista2)));
//        System.out.println(Arrays.toString(ejercicio1.maximo(lista2)));
//        System.out.println(ejercicio1.palindromo(palin));
//        System.out.println(ejercicio1.palindromo(palin2));
        System.out.println(ejercicio1.isograma("abc"));
        System.out.println(ejercicio1.isograma("murcielago"));
        ejercicio1.calendario(4);
    }
    
}
