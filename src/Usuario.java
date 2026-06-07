import java.util.*;

public class Usuario{

    //Atributos del Usuario

    private String nombre;
    private int edad;
    private String email;
    private double salario;


    //Cosntructor vacio
    public Usuario(){

        setNombre("");
        setEdad(0);
        setEmail("");
        setSalario(0.0);
    }

    //Constructor con parámetros
    public Usuario(String nombre, int edad, String email, double salario){

        setNombre(nombre);
        setEdad(edad);
        setEmail(email);
        setSalario(salario);
    }


    //Setters & Getters

    public void setNombre(String nombre){

        this.nombre = nombre;
    }
    public void setEdad(int edad){

        this.edad = edad;
    }
    public void setEmail(String email){

        this.email = email;
    }
    public void setSalario(double salario){

        this.salario = salario;
    }

    public String getNombre(){

        return nombre.toUpperCase();
    }
    public int getEdad(){

        return edad;
    }
    public String getEmail(){

        return email;
    }
    public double getSalario(){

        return salario;
    }



    //Método para registrar Usuario
    public boolean registrar(){
        
        Scanner sc = new Scanner(System.in);

        int edad = 0;
        double salario = 0;
        
        try{

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            try{

              System.out.print("Edad: ");
              edad = sc.nextInt();

            }catch(InputMismatchException e){

                System.out.println("\nDebe ingresar un numero valido.");
                return false;
            }

            sc.nextLine();

            System.out.print("Correo Electronico: ");
            String email = sc.nextLine();


            try{

            System.out.print("Salario: ");
            salario = sc.nextDouble();

            }catch(InputMismatchException e){

                System.out.println("\nDebe ingresar un numero valido");
                return false;
            }

            ValidarUsuario.validarUsuario(nombre, edad, email, salario);

            setNombre(nombre);
            setEdad(edad);
            setEmail(email);
            setSalario(salario);

            return true;

        }
        catch(NombreInvalidoExcepcion e){

            System.out.println("\nError: " + e.getMessage());
            return false;
        }
        catch(EdadInvalidaExcepcion e){

            System.out.println("\nError: " + e.getMessage());
            return false;
        }
        catch(EmailInvalidoExcepcion e){

            System.out.println("\nError: " + e.getMessage());
            return false;
        }
        catch(SalarioInvalidoExcepcion e){

            System.out.println("\nError: " + e.getMessage());
            return false;
        }
    
    }
}