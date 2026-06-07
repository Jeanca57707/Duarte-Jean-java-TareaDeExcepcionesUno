public class ValidarUsuario{

    //Método para validar los atribuos del usuario
    public static void validarUsuario(String nombre, int edad, String email, double salario)throws NombreInvalidoExcepcion, EdadInvalidaExcepcion, EmailInvalidoExcepcion, SalarioInvalidoExcepcion{

        //Nombre 
        if(nombre == null || nombre.length() < 3){

            throw new NombreInvalidoExcepcion("¡El nombre debe contener al menos 3 caracteres.");
        }

        //Edad
        if(edad < 18){

            throw new EdadInvalidaExcepcion("¡La edad debe ser mayor o igual a 18!");
        }
        if(edad > 100){

            throw new EdadInvalidaExcepcion("¡La edad debe ser menor a 100!");
        }

        //Salario
        if(salario < 0){

            throw new SalarioInvalidoExcepcion("¡El salario debe ser mayor que 0!");
        }

        //Email
        if(email == null || !email.contains("@") || !email.contains(".")){

            throw new EmailInvalidoExcepcion("¡El Correo NO es válido!");
        }

    }
}