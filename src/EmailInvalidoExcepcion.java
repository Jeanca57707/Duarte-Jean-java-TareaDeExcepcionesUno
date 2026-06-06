//Excepcion de correo electrónico
public class EmailInvalidoExcepcion extends Exception{

    public EmailInvalidoExcepcion(String mensaje){

        super(mensaje);
    }
}