import java.util.ArrayList;
import java.util.List;

public class Carrera {

    //atributos
    String nombreSede;
    List<Participante> competidores = new ArrayList<Participante>();


    //Constructor

    public Carrera(String nombreSede) {
        this.nombreSede = nombreSede;
    }


    //metodos

    public List<Participante> competidoresConPuntajeMayorTreinta(){
        List<Participante> listaFiltrada = new ArrayList<Participante>();

        for (Participante p: competidores){
            if (p.calcularPuntajeTotal() > 30) listaFiltrada.add(p);
        }

        return listaFiltrada;
    }

    public Participante competidorMayorTiempoEstimado(){

        Participante participanteConMayorTiempoEstimado = null;

        for (Participante p: competidores){
            if (participanteConMayorTiempoEstimado == null) participanteConMayorTiempoEstimado = p;
            else {
                if (p.calcularTiempoEstimadoTotal() > participanteConMayorTiempoEstimado.calcularTiempoEstimadoTotal())
                    participanteConMayorTiempoEstimado = p;
            }
        }

        return participanteConMayorTiempoEstimado;
    }

    public Participante competidorMayorPuntajeObtenido(){

        Participante competidorMayorPuntajeObtenido = null;

        for (Participante p: competidores){
            if (competidorMayorPuntajeObtenido == null) competidorMayorPuntajeObtenido = p;
            else {
                if (p.calcularPuntajeTotal() > competidorMayorPuntajeObtenido.calcularPuntajeTotal()) competidorMayorPuntajeObtenido = p;
            }
        }

        return competidorMayorPuntajeObtenido;
    }

    public double mayorPuntajeObtenidoEnLaCarrera() {

        double mayorPuntajeObtenidoEnLaCarrera = 0;

        for (Participante p : competidores) {
            if (mayorPuntajeObtenidoEnLaCarrera < p.calcularPuntajeTotal()) mayorPuntajeObtenidoEnLaCarrera = p.calcularPuntajeTotal();
        }

        return mayorPuntajeObtenidoEnLaCarrera;

    }

    public boolean alguienTerminaraAntesDeDosHoras(){
        boolean resultado= false;

        for (Participante p: competidores){
            if (p.tiempoPersonalEstimado() < 120) resultado = true;
        }

        return resultado;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }
}
