import java.util.ArrayList;
import java.util.List;

public class Unipe {

    //Atributos
    List<Carrera> carreras = new ArrayList<Carrera>();

    //metodos

    public String SedeGanadora(){
        Carrera resultado=null;

        for (Carrera c: carreras){
            if (resultado == null) resultado = c;
            else{
                if(c.mayorPuntajeObtenidoEnLaCarrera() > resultado.mayorPuntajeObtenidoEnLaCarrera()) resultado = c;
            }
        }

        assert resultado != null;

        return resultado.getNombreSede();



    }

    public Participante PaticipanteGanadorTorneo(){

        Participante resultado=null;

        for (Carrera c: carreras){
            if (resultado == null) resultado = c.competidorMayorPuntajeObtenido();
            else{
                if (resultado.calcularPuntajeTotal() < c.mayorPuntajeObtenidoEnLaCarrera()) resultado = c.competidorMayorPuntajeObtenido();
            }
        }

        return resultado;
    }
}
