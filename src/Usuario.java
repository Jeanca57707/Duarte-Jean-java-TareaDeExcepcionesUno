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
    public void registrar(){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        sc.nextLine();

        System.out.print("Correo Electronico: ");
        String email = sc.nextLine();

        System.out.print("Salario: ");
        double salario = sc.nextDouble();



        setNombre(nombre);
        setEdad(edad);
        setEmail(email);
        setSalario(salario);
    
    }

    //Método que validará cada atributo del Usuario
    public void validarUsuario(String nombre, int edad, String email, double salario)throws Exception{

        validarNombre(nombre);
        validarEdad(edad);
        validarSalario(salario);
        validarCorreo(email);
        
    }

    //Método para validar el nombre
    public void validarNombre(String nombre)throws NombreInvalidoExcepcion{

        if(nombre == null){

            throw new NombreInvalidoExcepcion("¡El nombre no puede quedar vacio!");
        }
        if(nombre.length() < 3){

            throw new NombreInvalidoExcepcion("¡El nombre debe ser de 3 letras en adelante!");
        }
    }

    //Metodo para validar la edad
    public void validarEdad(int edad)throws EdadInvalidaExcepcion{

        if(edad < 18){

            throw new EdadInvalidaExcepcion("¡La edad debe ser mayor o igual a 18!");
        }
        if(edad > 100){

            throw new EdadInvalidaExcepcion("¡La edad debe ser menor a 100!");
        }
    }

    //Método para validar el salario
    public void validarSalario(double salario)throws SalarioInvalidoExcepcion{

        if(salario < 0){

            throw new SalarioInvalidoExcepcion("¡El salario debe ser mayor que 0!");
        }
    }

    //Método para validar un correo electrónico
    public void validarCorreo(String email)throws EmailInvalidoExcepcion{

        if(!email.contains("@") || !email.contains(".")){

            throw new EmailInvalidoExcepcion("¡El Correo NO es válido!");
        }
    } 
}