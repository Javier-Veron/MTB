public class RecorridoIntermedio extends Recorrido {

    //Atributos
    boolean ascendente;
    double indiceAscendente = 1.5;
    double indiceDescendente = 0.5;

    //Constructor
    public RecorridoIntermedio(double kmRecorridos, boolean ascendente) {
        super(kmRecorridos);
        this.ascendente = ascendente;

    }

    //Metodos
    public double calcularTiempo(){
        if (ascendente) return this.kmRecorridos/25*indiceAscendente;
        else return this.kmRecorridos/25*indiceDescendente;
    }

    public double calcularPuntaje(){
        if (ascendente) return 1+indiceAscendente;
        else return 1+indiceDescendente;
    }

    //Getter and Setters


    public boolean isAscendente() {
        return ascendente;
    }

    public void setAscendente(boolean ascendente) {
        this.ascendente = ascendente;
    }
}
