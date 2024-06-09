
import AccesoData.AsistenciaData;
import AccesoData.ClaseData;
import AccesoData.EntrenadorData;
import AccesoData.MembresiaData;
import AccesoData.SocioData;

import Entidades.Asistencia;
import Entidades.Clase;
import Entidades.Entrenador;
import Entidades.Membresia;
import Entidades.Socio;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class Test {

    EntrenadorData ed = new EntrenadorData();
    ClaseData cd = new ClaseData();
    SocioData sd = new SocioData();
    AsistenciaData aD = new AsistenciaData();
    MembresiaData md = new MembresiaData();

    public void agregarEntrenadorTest() {
        Entrenador e1 = new Entrenador("11111111", "Pedro", "Funes", "Crossfit", true);
        Entrenador e2 = new Entrenador("22222222", "Lucas", "Pereyra", "Funcional", true);
        Entrenador e3 = new Entrenador("33333333", "Rocio", "Cussotto", "Zumba", true);
        Entrenador e4 = new Entrenador("44444444", "Antonio", "Villegas", "Yoga", false);
        //     Agregar los entrenadores a EntrenadoraData
        ed.guardarEntrenador(e1);
        ed.guardarEntrenador(e2);
        ed.guardarEntrenador(e3);
        ed.guardarEntrenador(e4);
    }

    public void busquedaPorDniEntTest() {
        System.out.println("busqueda de entrenador por DNI");
        System.out.println(ed.buscarPorDni("22222222"));
        System.out.println(ed.buscarPorDni("44444444")); // estado false

    }

    public void busquedaEntrenadorNomyApeTest() {
        System.out.println("Busqueda de entrenador por nombre y apellido");
        System.out.println(ed.buscarPorNombreYApellido("Pedro", "Funes"));
        System.out.println(ed.buscarPorNombreYApellido("antonio", "vIllegAs")); //no importa mayúsculas de la minúsculas
    }

    public void busquedaEntrenadorEspecialidadTest() {
        System.out.println("Busqueda de entrenador por especialidad");
        System.out.println(ed.listarPorEspecialidad("crossfit"));
    }

    public void busquedaEntrenadorNombTest() {
        System.out.println("Busqueda de entrenador por nombre");
        System.out.println(ed.listarPorNombre("raul"));
    }

    public void busquedaEntrenadorApellTest() {
        System.out.println("Busqueda de entrenador por apellido");
        System.out.println(ed.listarPorApellido("villegas"));
    }

    public void listaEntrenadoresActivosTest() {
        System.out.println("Listado Entrenadores activos:");
        List<Entrenador> listadoA = ed.listarEntrenadores();
        for (Entrenador entrenador : listadoA) {
            System.out.println(entrenador);
        }
    }

    public void modificarEntrenadorTest() {
        System.out.println("Modificar datos de un entrenador (update)");
        Entrenador e5 = new Entrenador(3, "33333331", "Lorena", "Quiroga", "Zumba", true);
        ed.actualizarEntrenador(e5);
    }

    public void darDeBajaEntrenadorTest() {
        System.out.println("Dar de baja un Entrenador (update)");
        ed.darBaja(1);
    }

    public void guardaClaseTest() {
        //Creacion Clase

        LocalTime horario = LocalTime.of(18, 00);
        LocalTime horario2 = LocalTime.of(19, 00);
        LocalTime horario3 = LocalTime.of(17, 00);
        Entrenador eC1 = ed.buscarPorDni("22222222");
        Entrenador eC = ed.buscarPorDni("44444444");
        Clase clase1 = new Clase("Zumba", eC1, horario, 10, true);
        Clase clase2 = new Clase("Funcional", eC1, horario, 10, true);
        Clase clase3 = new Clase("Stretching", eC, horario2, 10, true);
        Clase clase4 = new Clase("Yoga", eC1, horario3, 10, true);

//          Agregar las clases a ClaseData
        cd.guardarClase(clase1);
        cd.guardarClase(clase2);
        cd.guardarClase(clase3);
        cd.guardarClase(clase4);
    }

    public void buscarClasePorNombreTest() {
//          Buscar Clase
        System.out.println("La clase buscada es");
        System.out.println(cd.buscarClase("Zumba"));
    }

    public void buscarClasePorHorarioTest() {
        // Buscar por Horario
        System.out.println("La clase buscada es");
        LocalTime horario3 = LocalTime.of(17, 30);
        System.out.println(cd.buscarClasePorHorario(horario3));
    }

    public void buscarClasePorEntrenadorTest() {
        //Buscar por entrenador
        System.out.println(cd.buscarClasePorEntrenador("Santiago", "Flores"));
        List<Clase> listaClaseEntre = cd.buscarClasePorEntrenador("Santiago", "Flores");
        System.out.println("--- LISTADO CLASES POR ENTRENADOR ---");
        for (Clase claseE : listaClaseEntre) {
            System.out.println(claseE);
        }

    }

    public void modificarClaseTest() {
        //  Modificar clase
        Clase clase5 = cd.buscarClase("Zumba");
        cd.modificarClase(clase5);
    }

    public void darBajaClaseTest() {
        // Dar de baja 
        cd.darDeBajaClase(8);
    }

    public void listarClasesTest() {
        //Listar Clase
        System.out.println(" ");
        List<Clase> listaClase = cd.listarTodasClases();
        System.out.println("--- LISTADO CLASES ---");
        for (Clase clase : listaClase) {
            System.out.println(clase);
        }
    }

    public void listarClasesActivasTest() {
        //Clases activas
        System.out.println(" ");
        List<Clase> listaClaseActivas = cd.listarClasesActivas();
        System.out.println("--- LISTADO CLASES ACTIVAS ---");
        for (Clase clase : listaClaseActivas) {
            System.out.println(clase);
        }
    }

    public void listarClasesInactivasTest() {
        //Clases inactivas
        System.out.println(" ");
        List<Clase> listaClaseInactivas = cd.listarClasesInactivas();
        System.out.println("--- LISTADO CLASES INACTIVAS ---");
        for (Clase clase : listaClaseInactivas) {
            System.out.println(clase);
        }
    }

    public void horariosOcupadosTest() {

//        //Horarios ocupados
        System.out.println(" ");
        List<LocalTime> listaHorarios = cd.listarHorariosClasesActivas();
        System.out.println("--- LISTADO HORARIO CLASES ACTIVAS ---");
        for (LocalTime time : listaHorarios) {
            System.out.println(time);
        }

    }

    public void horariosDisponiblesTest() {
        //Horarios disponibles
        System.out.println(" ");
        List<LocalTime> listaHorariosDisponibles = cd.listarHorariosDisponibles();
        System.out.println("--- LISTADO HORARIO DISPONIBLES ---");
        for (LocalTime time : listaHorariosDisponibles) {
            System.out.println(time);
        }
    }

    //   Socio Test
    public void guardarSocioTest() {
        Socio socio1 = new Socio("33221100", "Luciano", "Castro", 19, "luchoC@gmail.com", "152534", true);
        Socio socio2 = new Socio("00112233", "Soledad", "Arias", 30, "soledad@gmail.com", "154789", true);
        Socio socio3 = new Socio("55667799", "Mariano", "Rojas", 45, "Mariano_boquita@gmail.com", "151478", true);
        Socio socio4 = new Socio("77889944", "Jazmin", "Torres", 25, "jzmincita99@gmail.com", "152012", true);
        Socio socio5 = new Socio("55002211", "Jazmin", "Garcia", 29, "jzmi15@gmail.com", "153265", true);
        Socio socio7 = new Socio("5896589", "Camilo", "Lorca", 39, "cm8@gmail.com", "153696", true);

        sd.guardarSocio(socio1);
        sd.guardarSocio(socio2);
        sd.guardarSocio(socio3);
        sd.guardarSocio(socio4);
        sd.guardarSocio(socio5);
        sd.guardarSocio(socio7);
    }

    public void listadoSocioPorNombreTest() {
        List<Socio> listadoSociosNombre = sd.buscarSocioNombre("Jazmin");
        System.out.println("--- SOCIO/S POR NOMBRE ---");
        for (Socio socio : listadoSociosNombre) {
            System.out.println(socio);
        }
    }

    public void buscarSocioIdTest() {
        System.out.println(sd.buscarSocioId(2));
        System.out.println(sd.buscarSocioDni("33221100"));
    }

    public void darBajaSocioTest() {
        sd.darDeBajaSocio(1);
    }

    public void listarSociosTest() {
        List<Socio> listadoSocios = sd.listarTodosSocios();
        System.out.println("--- LISTADO DE TODOS LOS SOCIOS ---");
        for (Socio socio : listadoSocios) {
            System.out.println(socio);
        }
    }

    public void listarSociosActivosInactivosTest() {
        List<Socio> listadoSociosAct = sd.listarSociosActivos();
        System.out.println("--- LISTADO DE SOCIOS ACTIVOS ---");
        for (Socio socio : listadoSociosAct) {
            System.out.println(socio);
        }

        List<Socio> listadoSociosInact = sd.listarSociosInactivos();
        System.out.println("--- LISTADO DE SOCIOS INACTIVOS ---");
        for (Socio socio : listadoSociosInact) {
            System.out.println(socio);
        }
    }

    // Asistencia Test
    public void guardarAsistenciaTest() {
        //       Guardar Asisteencia
        Clase clase5 = cd.buscarClase("Zumba");
        Socio socioAsistencia = sd.buscarSocioDni("55667799");
        LocalDate asistenciaDia = LocalDate.of(2024, 6, 7);
        Asistencia a1 = new Asistencia(socioAsistencia, clase5, asistenciaDia);
        aD.guardarAsistencia(a1);
    }

    public void listarAsistenciaSocioTest() {
        Socio socioAsistencia = sd.buscarSocioDni("33221100");
        List<Asistencia> listaAsistencia = aD.buscarPorSocio(socioAsistencia);
        for (Asistencia asistencia : listaAsistencia) {
            System.out.println(asistencia);
        }
    }

    //Membresia Test
    public void guardarMembresiaTest() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            // Crear fecha de inicio
            LocalDate fechaInicio1 = LocalDate.parse("2024-01-01", formatter);
            LocalDate fechaInicio2 = LocalDate.parse("2024-02-01", formatter);
            LocalDate fechaInicio3 = LocalDate.parse("2024-03-15", formatter);
            LocalDate fechaInicio4 = LocalDate.parse("2024-03-15", formatter);
            // Sumar 30 días a la fecha de inicio para obtener la fecha de fin (sumando 30 dias)
            LocalDate fechaFin1 = fechaInicio1.plusDays(30);
            LocalDate fechaFin2 = fechaInicio2.plusDays(30);
            LocalDate fechaFin3 = fechaInicio3.plusDays(30);
            LocalDate fechaFin4 = fechaInicio4.plusDays(30);

            // Buscar socio por DNI
            Socio socio1 = sd.buscarSocioDni("55667799");
            Socio socio2 = sd.buscarSocioDni("55002211");
            Socio socio3 = sd.buscarSocioDni("5896589");

            // Crear instancia de Membresia
            Membresia mem1 = new Membresia(socio1, 20, fechaInicio1, fechaFin1, 10000, true);
            Membresia mem2 = new Membresia(socio2, 8, fechaInicio2, fechaFin2, 5000, true);
            Membresia mem3 = new Membresia(socio2, 12, fechaInicio3, fechaFin3, 8000, true);
            Membresia mem4 = new Membresia(socio3, 12, fechaInicio4, fechaFin4, 8000, true);

            // Guardar membresía
            md.guardarMembresia(mem1);
            md.guardarMembresia(mem2);
            md.guardarMembresia(mem3);
            md.guardarMembresia(mem4);
        } catch (DateTimeParseException e) {
            //mensaje de error
            e.printStackTrace();
        }

    }

    public void buscarPorSocioMemTest() {
        System.out.println("busqueda de entrenador por DNI");
        Socio socio = sd.buscarSocioDni("55002211"); // socio a buscar en la membresia
        //System.out.println(socio);

        List<Membresia> MembresiasPorSocios = md.buscarPorSocio(socio);
        System.out.println("--- LISTADO DE MEMBRESIAS POR SOCIO ---");
        for (Membresia membre : MembresiasPorSocios) {
            System.out.println(membre);
        }
    }

    public void modificarMembresiaTest() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            // Buscar socio por DNI
            Socio socio1 = sd.buscarSocioDni("5896589");

            // Crear fecha de inicio
            LocalDate fechaInicio1 = LocalDate.parse("2024-01-01", formatter);

            // Sumar 30 días a la fecha de inicio para obtener la fecha de fin (sumando 30 dias)
            LocalDate fechaFin1 = fechaInicio1.plusDays(30);

            // Crear instancia de Membresia----------ver
            Membresia mem1 = new Membresia(5, socio1, 20, fechaInicio1, fechaFin1, 10000, true);
            mem1.getIdMembresia();

            // Guardar membresía
            md.modificarMembresia(mem1);

        } catch (DateTimeParseException e) {
            //mensaje de error
            e.printStackTrace();
        }

    }

    public void listarMembresiasActivas() {

        List<Membresia> membresias = md.listarMembresiasActivas();
        System.out.println("--- LISTADO DE MEMBRESIAS ACTIVAS ---");
        for (Membresia membre : membresias) {
            System.out.println(membre);
        }

    }

    public void listarMembresiasInactivas() {

        List<Membresia> membresias = md.listarMembresiasInactivas();
        System.out.println("--- LISTADO DE MEMBRESIAS INACTIVAS ---");
        for (Membresia membre : membresias) {
            System.out.println(membre);
        }
    }

    public void darBajaMembresiaTest() {
        Socio socioM = sd.buscarSocioDni("5896589");
        Membresia m1 = new Membresia();
        m1.setSocio(socioM); // seteo el socio en vez de llamar al constructor
        md.darBajaMembresia(m1);

    }

    public void listarAsistenciaPorClaseTest() {
        Clase clase1 = cd.buscarClase("zumba");

        List<Asistencia> listaAsist = aD.buscarPorClase(clase1);
        
        System.out.println("Lista de Asistencias por Clase");
        for (Asistencia asistencia : listaAsist) {
            System.out.println(listaAsist);
            
        }
    }
}
