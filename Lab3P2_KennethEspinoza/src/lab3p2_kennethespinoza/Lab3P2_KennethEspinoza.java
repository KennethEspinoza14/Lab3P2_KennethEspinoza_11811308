
package lab3p2_kennethespinoza;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3P2_KennethEspinoza {

    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {

        ArrayList personajes = new ArrayList();

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

            switch (opcion) {

                case 1: {

                    String nombre, raza = "", nacionalidad = "", tipo_p = "", descripcion;
                    int edad, altura, peso;

                    System.out.println("Ingrese el nombre de su personaje");
                    nombre = lea.next();
                    System.out.println("Ingrese la raza de su personaje\n"
                            + "1 = Humano\n"
                            + "2 = Enano\n"
                            + "3 = Elfo\n"
                            + "4 = Mediano\n");
                    int r = lea.nextInt();

                    switch (r) {
                        case 1: {
                            raza = "Humano";
                        }
                        break;
                        case 2: {
                            raza = "Enano";
                        }
                        break;
                        case 3: {
                            raza = "Elfo";
                        }
                        break;
                        case 4: {
                            raza = "Mediano";
                        }
                        break;

                    }

                    System.out.println("Ingrese la nacionalidad de su personaje\n"
                            + "1 = Norfair\n"
                            + "2 = Brinstar\n"
                            + "3 = Maridia\n"
                            + "4 = Zebes\n"
                            + "5 = Crateria\n");
                    int n = lea.nextInt();
                    switch (r) {
                        case 1: {
                            nacionalidad = "Norfair";
                        }
                        break;
                        case 2: {
                            nacionalidad = "Brinstar";
                        }
                        break;
                        case 3: {
                            nacionalidad = "Maridia";
                        }
                        break;
                        case 4: {
                            nacionalidad = "Zebes";
                        }
                        break;
                        case 5: {
                            nacionalidad = "Crateria";
                        }
                    }
                    System.out.println("Ingrese la edad de su personaje");
                    edad = lea.nextInt();

                    System.out.println("Ingrese la altura de su personaje");
                    altura = lea.nextInt();

                    System.out.println("Ingrese el peso de su personaje");
                    peso = lea.nextInt();

                    System.out.println("Ingrese la descripcion de su personaje");
                    descripcion = lea.next();

                    boolean pj = true;

                    while (pj == true) {

                        System.out.println("------MENU DE ELECCION DE PERSONAJE------");
                        System.out.println("INGRESE EL TIPO DE CLASE QUE QUIERE SER");
                        System.out.println("|1| = Clérigo");
                        System.out.println("|2| = Bárbaro");
                        System.out.println("|3| = Mago");
                        System.out.println("|4| = Picaro");
                        System.out.println("|5| = Salir del menu ");
                        System.out.println("-----------------------------------------");
                        int opcion2 = lea.nextInt();

                        switch (opcion2) {

                            case 1: {
                                String dios, invocacion;

                                System.out.println("Ingrese el dios en el que cree su personaje:");
                                lea.next();
                                System.out.println("Ingrese su tipo de invocacion:");
                                lea.next();

                                Clerigo c = new Clerigo(edad, n, nombre, raza, nacionalidad, tipo_p, descripcion, altura, peso);
                                personajes.add(c);

                            }
                            break;

                            case 2: {
                                String arma;
                                int exp;

                                System.out.println("Ingrese el arma del barbaro");
                                arma = lea.next();
                                System.out.println("Ingrese la xp del barbaro");
                                exp = lea.nextInt();

                                Barbaro b = new Barbaro(exp, arma, edad, exp, nombre, raza, nacionalidad, tipo_p, descripcion, altura, peso);
                                personajes.add(b);

                            }
                            break;

                            case 3: {
                                String magia;

                                System.out.println("Ingrese el tipo de magia(Blanca/Negra/Sanadora):");
                                magia = lea.next();

                                Mago m = new Mago(magia, edad, n, nombre, raza, nacionalidad, tipo_p, descripcion, altura, peso);
                                personajes.add(m);
                            }
                            break;

                            case 4: {
                                int robos;
                                String instrumento;

                                System.out.println("Ingrese el tipo de instrumento(Amuleto/Arma/Piedra Antigua):");
                                instrumento = lea.next();

                                System.out.println("Ingrese la cantidad de robos exitosos:");
                                robos = lea.nextInt();

                                Picaro p = new Picaro(robos, instrumento, edad, n, nombre, raza, nacionalidad, tipo_p, descripcion, altura, peso);
                                personajes.add(p);
                            }
                            break;

                            case 5: {
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

                    String salida = "";
                    for (Object j : personajes) {
                        salida += personajes.indexOf(j) + "- " + j + "\n";
                        System.out.println(salida);
                    }

                    System.out.println("Ingrese que jugador desea modificar");
                    int pos = lea.nextInt();

                    System.out.println("Ingrese el atributo a modificar\n"
                            + "1 = Nombre\n"
                            + "2 = Edad\n"
                            + "3 = Nacionalidad\n"
                            + "4 = Raza\n"
                            + "5 = Descripcion\n"
                            + "6 = Altura\n"
                            + "7 = Peso\n");
                    int mod = lea.nextInt();

                    switch (mod) {
                        case 1: {
                            System.out.println("Ingrese el nombre de su personaje");
                            String nombre = lea.next();
                            ((Personaje) personajes.get(pos)).setNombre(nombre);
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

                        }
                        break;
                        case 7: {

                        }
                        break;
                    }

                }
                break;
                case 3: {
                    String salida = "";
                    for (Object j : personajes) {
                        salida += personajes.indexOf(j) + "- " + j + "\n";
                        System.out.println(salida);
                    }
                }
                break;
                case 4: {
                    String salida = "";
                    System.out.println("Ingrese el jugador que desea eliminar:");
                    int pos = lea.nextInt();
                    for (Object j : personajes) {
                        salida += personajes.indexOf(j) + "- " + j + "\n";
                        System.out.println(salida);
                    }
                    personajes.remove(pos);
                    System.out.println("Personaje eliminado exitosamente");

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
