
import AccesoData.ClaseData;
import AccesoData.Conexion;
import AccesoData.EntrenadorData;
import Entidades.Clase;
import Entidades.Entrenador;
import java.sql.Connection;
import java.time.LocalTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Connection con = Conexion.getConexion();

        // creacion de entrenadores
//        Entrenador e1= new Entrenador("11111111","Pedro","Funes","Crossfit",true);
//        Entrenador e2= new Entrenador("22222222","Lucas","Pereyra","Funcional",true);
//        Entrenador e3= new Entrenador("33333333","Rocio","Cussotto","Zumba",true);
//        
//        EntrenadorData ed = new EntrenadorData();
//        ed.guardarEntrenador(e1);
//        ed.guardarEntrenador(e2);
//        ed.guardarEntrenador(e3);
        //Creacion Clase
//        LocalTime horario = LocalTime.of(14, 30);
//        Clase clase1 = new Clase("Zumba", 1, horario , 10, true);
//        LocalTime horario2 = LocalTime.of(15, 30);
//        Clase clase2 = new Clase("Funcional", 2, horario , 10, true);
//        
//        //Agregar las clases a ClaseData
//        ClaseData cd = new ClaseData();
//        cd.crearClase(clase1);
//        cd.crearClase(clase2);
        //Buscar Clase
        // System.out.println(cd.buscarClase("Zumba"));
//        Clase clase3 = new Clase(3,"Zumba", 1, horario , 2, true);
//        cd.modificarClase(clase3);
        //Creacion Clase
        LocalTime horario = LocalTime.of(14, 30);
        Clase clase1 = new Clase("Zumba", 1, horario, 10, true);
        // LocalTime horario2 = LocalTime.of(15, 30);
        // Clase clase2 = new Clase("Funcional", 2, horario , 10, true);
        //LocalTime horario4 = LocalTime.of(16, 30);
        //Clase clase4 = new Clase("Stretching", 1, horario4 , 10, true);
        LocalTime horario5 = LocalTime.of(17, 30);
        Clase clase5 = new Clase(8, "Yoga", 2, horario5, 10, true);
        //Agregar las clases a ClaseData
        ClaseData cd = new ClaseData();
        //cd.guardarClase(clase5);

        //Buscar Clase
        // System.out.println(cd.buscarClase("Zumba"));
        // Clase clase3 = new Clase(3,"Zumba", 1, horario , 2, true);
        // cd.modificarClase(clase3);
        // cd.modificarClase(clase5);
        //Dar de baja 
        // cd.darDeBajaClase(9);
        System.out.println(" ");
        List<Clase> listaClase = cd.listarTodasClases();
        System.out.println("--- LISTADO CLASES ---");
        for (Clase clase : listaClase) {
            System.out.println(clase);
        }
        System.out.println(" ");
        List<Clase> listaClaseActivas = cd.listarClasesActivas();
        System.out.println("--- LISTADO CLASES ACTIVAS ---");
        for (Clase clase : listaClaseActivas) {
            System.out.println(clase);
        }

        System.out.println(" ");
        List<Clase> listaClaseInactivas = cd.listarClasesInactivas();
        System.out.println("--- LISTADO CLASES INACTIVAS ---");
        for (Clase clase : listaClaseInactivas) {
            System.out.println(clase);
        }

    }

}
