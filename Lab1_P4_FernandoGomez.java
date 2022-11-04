package com.mycompany.lab4p1_fernandogomez;
import java.util.Scanner;
                          //  import java.util.Random;
import java.util.Random;
public class Lab4P1_FernandoGomez {

    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

        System.out.println("------Menu------");
        System.out.println("Ejercicio práctico 1 – Fallout words");
        System.out.println("Ejercicio práctico 2 – Rodatcripne");
        System.out.println("Ejercicio práctico 3 – Alpha");
        System.out.println("4 para salir");
        System.out.println("-----------------");
       
        int A=entrada.nextInt();
        
        while (true){
            if(A==1){
                
                System.out.println("Comer  Unida");
                System.out.println("Jugar  Venti");
                System.out.println("Salta  Llama");
                System.out.println("Llora  Eevee");
                System.out.println("Muere  Local");                                        
                System.out.println("Ingrese la palabra que selecciono");
                int rad = new Random().nextInt((10 - 1) + 1) + 1;
                String radx = entrada.nextLine();
                switch(rad){
                    case 1:
                        if (radx.equalsIgnoreCase("Comer"))
                            System.out.println("Acceso concedido");
                        break;
                         case 2:
                                                     if (radx.equalsIgnoreCase("Unida"))
                            System.out.println("Acceso concedido");
                        break;
                         case 3:
                                                     if (radx.equalsIgnoreCase("Jugar"))
                            System.out.println("Acceso concedido");
                        break;
                         case 4:
                                                     if (radx.equalsIgnoreCase("Venti"))
                            System.out.println("Acceso concedido");
                        break;
                         case 5:
                                                     if (radx.equalsIgnoreCase("Salta"))
                            System.out.println("Acceso concedido");
                        break;
                         case 6:
                                                     if (radx.equalsIgnoreCase("Llama"))
                            System.out.println("Acceso concedido");
                        break;
                         case 7:
                                                     if (radx.equalsIgnoreCase("Llora"))
                            System.out.println("Acceso concedido");
                        break;
                         case 8:
                                                     if (radx.equalsIgnoreCase("Evee"))
                            System.out.println("Acceso concedido");
                        break;
                         case 9:
                                                     if (radx.equalsIgnoreCase("Muere"))
                            System.out.println("Acceso concedido");
                        break;
                         case 10:
                                                     if (radx.equalsIgnoreCase("Local"))
                            System.out.println("Acceso concedido");
                        break;
                         default:
                             System.out.println("Plabra no valida");
                             break;
                             
                        
                }
                if(A==4){
                            System.exit(0);
                        }
            }
            } 
            }else{
                if(A==2){
                    System.out.println("Ingrese su contraseña");
                    String a = entrada.nextLine();
                    String b;
                    String a=b.toLowerCase();
                    a=a .replace("A", "B");
                    
                }else{
                    
                if(A==3){
                    System.out.println("Ingrese la cadena que quiere evaluar");
                    String craneo=entrada.nextLine();
                    public static boolean Alpha(String craneo){
                   int x = craneo.length();
                    int etmoides = 0;
                    int parietal = craneo.length()-1;
                     for(int n=0;n<x;x++){
                    if(craneo.charAt(etmoides)==((etmoides>=65)&&(etmoides<=90)&&(etmoides>=97)&&(etmoides<=122))) {
                        System.out.println("Esta cadena continen caracteres");
                    }else{                    
                        System.out.println("Esta adena no continen caractres");
                        
                        
                    }
                    }
                    
                }
                    }

            
        
    }
    }
    }

