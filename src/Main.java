
import AccesoData.ClaseData;
import AccesoData.Conexion;
import AccesoData.EntrenadorData;
import AccesoData.MembresiaData;
import AccesoData.SocioData;
import Entidades.Clase;
import Entidades.Entrenador;
import Entidades.Membresia;
import Entidades.Socio;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Connection con = Conexion.getConexion();

// ---------------------------- Entrenador ----------------------------
//        Entrenador e1= new Entrenador("11111111","Pedro","Funes","Crossfit",true);
//        Entrenador e2= new Entrenador("22222222","Lucas","Pereyra","Funcional",true);
//        Entrenador e3= new Entrenador("33333333","Rocio","Cussotto","Zumba",true);
//        Entrenador e4= new Entrenador("44444444","Antonio","Villegas","Yoga",false);
//        Agregar los entrenadores a EntrenadoraData
//        EntrenadorData ed = new EntrenadorData();
//        ed.guardarEntrenador(e1);
//        ed.guardarEntrenador(e2);
//        ed.guardarEntrenador(e3);
//        ed.guardarEntrenador(e4);
//        System.out.println("busqueda de entrenador por DNI");
//        System.out.println(ed.buscarPorDni("22222222"));
//        System.out.println(ed.buscarPorDni("44444444")); // estado false
//        System.out.println("Busqueda de entrenador por nombre y apellido");
//        System.out.println(ed.buscarPorNombreYApellido("Pedro", "Funes"));
//        System.out.println(ed.buscarPorNombreYApellido("antonio", "vIllegAs")); //no importa mayúsculas de la minúsculas
//        System.out.println("Busqueda de entrenador por especialidad");
//        System.out.println(ed.listarPorEspecialidad("crossfit"));
//        System.out.println("Busqueda de entrenador por nombre");
//        System.out.println(ed.listarPorNombre("raul"));
//        System.out.println("Busqueda de entrenador por apellido");
//        System.out.println(ed.listarPorApellido("villegas"));
//        System.out.println("Listado Entrenadores activos:");
//        List<Entrenador> listadoA = ed.listarEntrenadores();
//        for (Entrenador entrenador : listadoA) {
//            System.out.println(entrenador);
//        }
//        
//        System.out.println("Modificar datos de un entrenador (update)");
//        Entrenador e5= new Entrenador(3,"33333333","Lorena","Quiroga","Zumba",true);
//        ed.actualizarEntrenador(e5);
//        System.out.println("Dar de baja un alumno (update)");
//        ed.darBaja(1);
// ---------------------------- Clase ----------------------------
//              //Creacion Clase
//          LocalTime horario = LocalTime.of(18, 30);
//          Clase clase1 = new Clase("Zumba", 1, horario, 10, true);
//          Clase clase2 = new Clase("Funcional", 2, horario , 10, true);
//          LocalTime horario3 = LocalTime.of(19, 30);
//          Clase clase3 = new Clase("Stretching", 1, horario3 , 10, true);
//          LocalTime horario4 = LocalTime.of(17, 30);
//          Clase clase4 = new Clase(8, "Yoga", 2, horario4, 10, true);
//          Entrenador eC= new Entrenador(2,"11111111","Pedro","Funes","Crossfit",true);
//          Clase clase5 = new Clase(13,"Clasico", eC, horario3 , 2, true);
//          
//          Agregar las clases a ClaseData
//          ClaseData cd = new ClaseData();
//          cd.guardarClase(clase1);
//          cd.guardarClase(clase2);
//          cd.guardarClase(clase3);
//          cd.guardarClase(clase5);
//        
//          //Buscar Clase
//         System.out.println("La clase buscada es");
//          System.out.println(cd.buscarClase("Zumba"));
//        
//         //Buscar por Horario
//         System.out.println("La clase buscada es");
//         System.out.println(cd.buscarClasePorHorario(horario3));
//       
//        //Buscar por entrenador
//        System.out.println(cd.buscarClasePorEntrenador("Santiago", "Flores"));
//        List<Clase> listaClaseEntre =cd.buscarClasePorEntrenador("Santiago", "Flores") ;
//        System.out.println("--- LISTADO CLASES POR ENTRENADOR ---");
//        for (Clase claseE : listaClaseEntre) {
//         System.out.println(claseE);
//          }
//         //Modificar clase
//         cd.modificarClase(clase5);
//         //Dar de baja 
//         cd.darDeBajaClase(8);
//        //Listar Clase
//        System.out.println(" ");
//        List<Clase> listaClase = cd.listarTodasClases();
//        System.out.println("--- LISTADO CLASES ---");
//       for (Clase clase : listaClase) {
//            System.out.println(clase);
//      }
//        System.out.println(" ");
//       List<Clase> listaClaseActivas = cd.listarClasesActivas();
//        System.out.println("--- LISTADO CLASES ACTIVAS ---");
//        for (Clase clase : listaClaseActivas) {
//            System.out.println(clase);
//        }
//
//        System.out.println(" ");
//        List<Clase> listaClaseInactivas = cd.listarClasesInactivas();
//        System.out.println("--- LISTADO CLASES INACTIVAS ---");
//        for (Clase clase : listaClaseInactivas) {
//            System.out.println(clase);
//        }
//
// ---------------------------- Socio ----------------------------
//        Socio socio1 = new Socio("33221100", "Luciano", "Castro", 19, "luchoC@gmail.com", "152534", true);
////        Socio socio2 = new Socio("00112233", "Soledad", "Arias", 30, "soledad@gmail.com", "154789", true);
 //       Socio socio3 = new Socio("55667799", "Mariano", "Rojas", 45, "Mariano_boquita@gmail.com", "151478", true);
//        Socio socio4 = new Socio("77889944", "Jazmin", "Torres", 25, "jzmincita99@gmail.com", "152012", true);
    //    Socio socio5 = new Socio("55002211", "Jazmin", "Garcia", 29, "jzmi15@gmail.com", "153265", true);
       Socio socio7 = new Socio("5896589", "Camilo", "Lorca", 39, "cm8@gmail.com", "153696", true);
       SocioData sd = new SocioData();
//        sd.guardarSocio(socio1);
//        sd.guardarSocio(socio2);
//        sd.guardarSocio(socio3);
//        sd.guardarSocio(socio4);
//        sd.guardarSocio(socio5);
sd.guardarSocio(socio7);

//
//        List<Socio> listadoSociosNombre = sd.buscarSocioNombre("Jazmin");
//        System.out.println("--- SOCIO/S POR NOMBRE ---");
//        for (Socio socio : listadoSociosNombre) {
//            System.out.println(socio);
//        }
//        System.out.println(sd.buscarSocioId(2));
//        System.out.println(sd.buscarSocioDni("33221100"));
        // sd.darDeBajaSocio(1);
//        List<Socio> listadoSocios = sd.listarTodosSocios();
//         System.out.println("--- LISTADO DE TODOS LOS SOCIOS ---");
//        for (Socio socio : listadoSocios) {
//            System.out.println(socio);
//        }
//        
//          List<Socio> listadoSociosAct = sd.listarSociosActivos();
//         System.out.println("--- LISTADO DE SOCIOS ACTIVOS ---");
//        for (Socio socio : listadoSociosAct) {
//            System.out.println(socio);
//        }
//        
//          List<Socio> listadoSociosInact = sd.listarSociosInactivos();
//         System.out.println("--- LISTADO DE SOCIOS INACTIVOS ---");
//        for (Socio socio : listadoSociosInact) {
//            System.out.println(socio);
//        }
// ---------------------------- Membresia ----------------------------
        MembresiaData md = new MembresiaData();
        
              
        // Formato de fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            // Crear fecha de inicio
            LocalDate fechaInicio = LocalDate.parse("2024-01-01", formatter);

            // Sumar 30 días a la fecha de inicio para obtener la fecha de fin (sumando 30 dias)
            LocalDate fechaFin = fechaInicio.plusDays(30);

            // Crear instancia de Membresia
            Membresia mem1 = new Membresia(socio7, 20, fechaInicio, fechaFin, 10000, true);

            // Guardar membresía
            md.guardarMembresia(mem1);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
    }
        

    

}
