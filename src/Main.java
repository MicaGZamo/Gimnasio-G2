
import AccesoData.AsistenciaData;
import AccesoData.ClaseData;
import AccesoData.Conexion;
import AccesoData.EntrenadorData;
import AccesoData.MembresiaData;
import AccesoData.SocioData;
import Entidades.Asistencia;
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

        Test test = new Test();
        
//------------- Test Entrenador -------------

//          test.agregarEntrenadorTest();
//          test.busquedaPorDniEntTest();
//          test.busquedaEntrenadorApellTest();
//          test.busquedaEntrenadorNombTest();
//          test.busquedaEntrenadorApellTest();
//          test.busquedaEntrenadorEspecialidadTest();
//          test.modificarEntrenadorTest();
//          test.darDeBajaEntrenadorTest();
//          test.listaEntrenadoresActivosTest();

//------------- Test clase -------------  
//          test.guardaClaseTest();
//          test.buscarClasePorNombreTest();
//          test.buscarClasePorHorarioTest();
//          test.buscarClasePorEntrenadorTest();
//          test.listarClasesTest();
//          test.listarClasesInactivasTest();
//          test.listarClasesActivasTest();
//          test.modificarClaseTest();
//          test.darBajaClaseTest();
//          test.horariosDisponiblesTest();
//          test.horariosOcupadosTest();

//------------- Test socio -------------
//          test.guardarSocioTest();
//          test.listarSociosTest();
//          test.listarSociosActivosInactivosTest();
//          test.listadoSocioPorNombreTest();
//          test.buscarSocioIdTest();
//          test.darBajaSocioTest();

//------------- Test Asistencia -------------
//          test.guardarAsistenciaTest();
//          test.listarAsistenciaSocioTest();

// ------------- Test Membresia -------------
//          test.guardarMembresiaTest();
//          test.buscarPorSocioMemTest();
//          test.modificarMembresiaTest();
//          test.listarMembresiasActivas();
//          test.listarMembresiasInactivas();
//          test.darBajaMembresiaTest();

    }

}
