package DTO;

public class Main {
    public static void main(String []args){
        Usuario usuario = new Usuario("Juan"); //Creamos el usuario
        usuario.añadirVehiculo(new Vehiculo("coche")); //Le añadimos propiedad

        Usuario usuario2 = new Usuario("Miguel");
        usuario2.añadirVehiculo(new Vehiculo("Moto"));

        Usuarios usuarios = new Usuarios();
        usuarios.meterUsuarios(usuario); //Añadimos el usuario con el método
        usuarios.meterUsuarios(usuario2);

        Usuario userInfo = usuarios.obtenerUsuario("Juan"); //Añadimos el método a la VAR
        System.out.println(userInfo.nombre); //Con la var podemos obtener los datos
        for(Vehiculo vehiculo : userInfo.vehiculo){
            System.out.println(vehiculo.tipo);
        }
    }
}
