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

        int opc;

        do{

            System.out.println("\n===============================");
            System.out.println("||    REGISTRO DE USUARIOS    ||");
            System.out.println("===============================\n");

            System.out.println("1. Registrar Usuario.");
            System.out.println("2. Salir.");

            System.out.print("\n Elija una opcion: ");
            opc = sc.nextInt();
            sc.nextLine();


            switch(opc){

                case 1:

                    Usuario nuevo = new Usuario();
                    nuevo.registrar();
                    registro.add(nuevo);
                    System.out.println("\nUsuario Registrado.");

                    break;
                
                case 2:

                    System.out.println("\nSaliendo del registro...");
                    break;

                default:

                    System.out.println("\nOpcion Invalida.");
                    break;
            }

        }while(opc != 2);
    }
}