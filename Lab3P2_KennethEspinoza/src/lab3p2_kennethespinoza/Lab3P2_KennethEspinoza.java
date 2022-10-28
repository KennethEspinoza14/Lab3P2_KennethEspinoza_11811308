
package lab3p2_kennethespinoza;

import java.util.Random;
import java.util.Scanner;


public class Lab3P2_KennethEspinoza {
    
     static Scanner lea = new Scanner(System.in);
    static Random r = new Random();

    
    public static void main(String[] args) {
        
        boolean control = true;
        
        while (control == true) {            
            
            System.out.println("----------------MENU-----------------");
            System.out.println("|1| =  Creacion del personaje");
            System.out.println("|2| =  Modificar Personajes");
            System.out.println("|3| =  Ver Atributos de un Personaje");
            System.out.println("|4| =  Eliminar Personaje");
            System.out.println("|5| =  Combate");
            System.out.println("|6| = Salir del programa ");
            System.out.println("-------------------------------------");
            System.out.println("Ingrese la opcion a la que desea entrar:");
            int opcion = lea.nextInt();
            
            switch (opcion){
                
                case 1: {
                    
                    boolean pj = true;
                    
                    while (pj == true) {                        
                     
                        System.out.println("------MENU DE ELECCION DE PERSONAJE------");
                        System.out.println("INGRESE EL TIPO DE CLASE QUE QUIERE SER");
                        System.out.println("|1| = Clérigo");
                        System.out.println("|2| = Bárbaro");
                        System.out.println("|3| = Mago");
                        System.out.println("|4| = Picaro");
                        System.out.println("|5| = Dejar de crear personajes ");
                        System.out.println("-----------------------------------------");
                        int opcion2 = lea.nextInt();
                        
                        switch (opcion2){
                            
                            case 1:{
                                
                                String nombre, raza, nacionalidad, tipo_p;
                                int edad;
                                double altura, peso;
                                
                                System.out.println("Ingrese el nombre de su personaje");
                                nombre = lea.next();
                                System.out.println("Ingrese la raza de su personaje"
                                        + "1 = Humano\n"
                                        + "2 = Enano\n"
                                        + "3 = Elfo\n"
                                        + "4 = Mediano\n");
                                int r = lea.nextInt();
                                switch (r){
                                    case 1:{
                                        nacionalidad = "Humano";
                                    }
                                    break;
                                    case 2:{
                                        nacionalidad = "Enano";
                                    }
                                    break;
                                    case 3:{
                                        nacionalidad = "Elfo";
                                    }
                                    break;
                                    case 4:{
                                        nacionalidad = "Mediano";
                                    }
                                    break;
                                }
                                
                                
                                
                                System.out.println("Ingrese el nombre de su personaje");
                                nacionalidad = lea.next();
                                System.out.println("Ingrese el nombre de su personaje");
                                edad = lea.nextInt();
                                System.out.println("Ingrese el nombre de su personaje");
                                nombre = lea.next();
                                
                                
                                
                                
                            }
                            break;
                            
                            case 2:{
                                
                            }
                            break;
                            
                            case 3:{
                                
                            }
                            break;
                            
                            case 4:{
                                
                            }
                            break;
                            
                            case 5:{
                                pj = false;
                            }
                            break;
                            default:
                                System.out.println("Opcion ingresada no valida");
                        }
                        
                    }
                    
                    
                    
                    
                    
                }
                break;

                case 2: {

                }
                break;
                case 3: {

                }
                break;
                case 4: {

                }
                break;
                case 5: {

                }
                break;
                case 6: {
                    control = false;
                }
                break;
                default:
                    System.out.println("Opcion Ingresada no valida");

            }
            
        }
        
        
        
    }
    
}
