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
    public int[] maximo(int [] listaNumeros)//Tambien se puede usar el metodo Math.max para calcular el maximo
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
        //Los replaceall sirven para arreglar en caso de encontar tildes o Ñ
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
	for (int i = 0; i < cancer.length(); i++) //Con un doble bucle for comparamos los chars y vemos si son el mismo
        {                                          //Si son los mismos se suma en un contador 
	    lr = 0;                                //Si se suma en contador hacemos un if para que el boolean se ponga en false
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
    //Declaramos un contador 
    public void calendario(int patata) //Arreglado error que al dibujar las lineas de las xx no salte linea
    {
	int dia = 0;							
	String[] calendario = new String[31];					
	for (int i = 0; i < patata; i++) 
        {					
	    if (dia < 7) 
            {
		System.out.print("XX ");
		dia++; //Aqui el error mencionado, ya que no sumaba el contador no funcionaba
	    } 
            if(dia > 7) 
            {								
		System.out.println();
		System.out.print("XX ");//Se pone un espacio a la derecha para que no este junto
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
	    } 
            else
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
	for (int i = dia; i < 7; i++) //Para que escriba las XX del final si es que fueran necesarias
        {					
	    System.out.print("XX ");
	}
	System.out.println(); //No sirve para este codigo pero esta para que en otros codigos esten en otra linea
    }
    
     public boolean escaleraDePalabras(char[][] escalera) 
     {
	boolean cancer = true;
        int sida;
	for (int i = 0; i < escalera.length - 1; i++) 
        {	
            sida = 0;//Se establece aqui a 0 para que cada vez que entre al for se ponga a 0 otra vez
	    if (escalera[i + 1].length == escalera[i].length) 
            {		
		for (int j = 0; j < escalera[i].length; j++) 
                {
                    if(escalera[i][j] != escalera[i + 1][j])
                    {
                        sida++;
                    }
                    if(sida > 1)//El fallo que tenia era (aparte de ser subnormal)era que tenia que si sida era mayor que 0 de
                                //false, sin embargo como debe ser 1 ya que tiene que ser una letra diferente
                    {
                        cancer = false;
                    }
		}
	    } 
	}
	return cancer;
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
        ejercicio1.calendario(3);
        char[][] listaPalabras = {
	    {'P', 'A', 'T', 'A'},
	    {'P', 'A', 'T', 'O'},
	    {'R', 'A', 'T', 'O'},
	    {'R', 'A', 'M', 'O'},
	    {'G', 'A', 'M', 'O'},
	    {'G', 'A', 'T', 'O'},
	    {'M', 'A', 'T', 'O'},};
        System.out.println(ejercicio1.escaleraDePalabras(listaPalabras));
    }
    
}
