import java.util.*;

public class Main{

    //Array List que almacenará a todos los usuarios registrados
    static ArrayList<Usuario> registro = new ArrayList<>();
    
    public static void main(String[] args){

        menu();
    }

    //Menú del Sistema
    public static void menu(){

        Scanner sc = new Scanner(System.in);

        int opc = 0;

        do{

            try{

              System.out.println("\n===============================");
              System.out.println("||   REGISTRO DE USUARIOS    ||");
              System.out.println("===============================\n");

              System.out.println("1. Registrar Usuario.");
              System.out.println("2. Salir.");

              System.out.print("\nElija una opcion: ");
              opc = sc.nextInt();
              sc.nextLine();

              System.out.println();

              switch(opc){

                case 1:

                    Usuario nuevo = new Usuario();
                    if(nuevo.registrar()){

                        registro.add(nuevo);
                        System.out.println("\nUsuario registrado correctamente.");
                    }
                
                    break;
                
                case 2:

                    System.out.println("\nSaliendo del registro...");
                    break;

                default:

                    System.out.println("\nOpcion Invalida.");
                    break;
                }

            }//Captura una excepción cuando el usuario ingresa una cadena de texto o un caracter al momento de elegir una opción
            catch(InputMismatchException e){
                System.out.println("\nError. Debe ingresar un NUMERO valido.");
                sc.nextLine();
                
            }
            finally{

                System.out.println("Proceso finalizado.");
            }       
            
        }while(opc != 2);
        sc.close();
    }
}