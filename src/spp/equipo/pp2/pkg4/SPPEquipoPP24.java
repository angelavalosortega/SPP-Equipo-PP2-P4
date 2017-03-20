/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.equipo.pp2.pkg4;
import java.util.Scanner;
/**
 *
 * @author Angel Avalos
 */
public class SPPEquipoPP24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb= new Scanner(System.in);
          
        int [][]matrixa={{1,2,3,4},{8,7,6,5},{9,10,11,12},{16,15,14,13}};
        System.out.println("En este programa tenemos una matriz especifica");
        System.out.println("Los valores de la matriz en sus respectivas coordenadas son los siguiente");
        valores(matrixa);
        prom(matrixa);
        valorMin(matrixa);
        valorMax(matrixa);
        sumaDiagonal(matrixa);       
        sumaarriba(matrixa);
        sumaabajo(matrixa);
    }
public static int pedirDato(){
    Scanner kb= new Scanner(System.in);
int n=0;
boolean flag;
do{
    System.out.println("Introduzca un numero entero");
    try{
        n=kb.nextInt();
        flag=false;
    }catch (Exception er){
        System.out.println("Intentelo de nuevo");
        flag=true;
        kb.nextLine();
    }
}while (flag);
return n;
}    
public static void prom(int[][]matrixa) {
    double prom=0;
    for (int i=0;i<matrixa.length;i++){
        for(int j=0;j<matrixa.length;j++){
            prom=prom+(matrixa[i][j]);
                      
        }
    } 
    System.out.println("El promedio de los arreglos es de "+prom/16);
}
public static void valorMin(int[][]matrixa){
    int valormin=2099999999;
    for (int i=0;i<matrixa.length;i++){
        for (int j=0;j<matrixa.length;j++){
            int n=matrixa[i][j];
            if(valormin>n){
                valormin=n;
            }else{
            }
                  
        }
    } 
    System.out.println("El valor minimo es de "+valormin);
}
public static void valorMax(int[][]matrixa){
    int valormax=-2099999999;
    for (int i=0;i<matrixa.length;i++){
        for (int j=0;j<matrixa.length;j++){
            int n=matrixa[i][j];
            if(valormax<n){
                valormax=n;
            }else{              
            }        
        }
    }   
    System.out.println("El valor maximo es de "+valormax);
}
public static void valores (int[][]matrixa){
    for (int i=0;i<matrixa.length;i++){
        for (int j=0;j<matrixa.length;j++){
            System.out.println("El valor en las coordenadas "+i+","+j+" es de "+matrixa[i][j]);               
         }       
    }
}
public static void sumaDiagonal (int[][]matrixa){
    int sumaDiagonal=0;
    for(int i=0;i<matrixa.length;i++){
        sumaDiagonal=sumaDiagonal+matrixa[i][i];
    }
    System.out.println("La suma de los valores en la diagonal de la matriz es igual a "+sumaDiagonal);
}
public static void sumaabajo (int[][]matrixa){
    int suma=0; 
    for(int i=1;i<matrixa.length;i++){
        suma=suma+matrixa[i][i-1];
    }
    System.out.println("La suma de los valores de la matriz abajo de la diagonal es igual a "+suma);
}
public static void sumaarriba (int[][]matrixa){
    int suma=0; 
    for(int i=1;i<matrixa.length;i++){
        suma=suma+matrixa[i-1][i];
    }
    System.out.println("La suma de los valores de la matriz arriba de la diagonal es igual a "+suma);    
}
}
