
import AccesoData.ClaseData;
import AccesoData.Conexion;
import AccesoData.EntrenadorData;
import Entidades.Clase;
import Entidades.Entrenador;
import java.sql.Connection;
import java.time.LocalTime;



public class Main {

    public static void main(String[] args) {
       
        Connection con = Conexion.getConexion();
        
        //creacion de entrenadores
//        Entrenador e1= new Entrenador("11111111","Pedro","Funes","Crossfit",true);
//        Entrenador e2= new Entrenador("22222222","Lucas","Pereyra","Funcional",true);
//        Entrenador e3= new Entrenador("33333333","Rocio","Cussotto","Zumba",true);
//        
//        EntrenadorData ed = new EntrenadorData();
//        ed.guardarEntrenador(e1);
//        ed.guardarEntrenador(e2);
//        ed.guardarEntrenador(e3);
//        
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
        
    }
    
}
