import java.util.ArrayList;
import java.util.List;

public class Participante {

    //atributos
    String nombre;
    int edad;
    List<Recorrido> recorridosElegidos = new ArrayList<Recorrido>();
    double velocidadPromedio;
    boolean experto;

    //constructor

    public Participante(String nombre, int edad,double velocidadPromedio,boolean experto) {
        this.nombre = nombre;
        this.edad = edad;
        this.velocidadPromedio = velocidadPromedio;
        this.experto = experto;
    }

    //Metodos

    public double calcularPuntajeTotal(){
        double puntajeTotal = 0;
        for (Recorrido r: recorridosElegidos){
            puntajeTotal +=r.calcularPuntaje();
        }
        if (experto) return puntajeTotal*0.95;
        return puntajeTotal;
    }


    public double calcularTiempoEstimadoTotal(){
        double tiempoEstimadoTotal = 0;
        for (Recorrido r: recorridosElegidos){
            tiempoEstimadoTotal +=r.calcularTiempo();
        }
        return tiempoEstimadoTotal;
    }

    private double distanciaTotal(){
        double resultado = 0;
            for (Recorrido r: recorridosElegidos){
                resultado += r.kmRecorridos;
            }
        return resultado;
    }

    public double tiempoPersonalEstimado(){

        return distanciaTotal()/velocidadPromedio;

    }

    //Setter and getters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Recorrido> getRecorridosElegidos() {
        return recorridosElegidos;
    }

    public void setRecorridosElegidos(List<Recorrido> recorridosElegidos) {
        this.recorridosElegidos = recorridosElegidos;
    }
}
