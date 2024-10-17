public class RecorridoDificil extends Recorrido{


    //Atributos
    int cantidadObstaculos;

    //Constructor
    public RecorridoDificil(double kmRecorridos, int cantidadObstaculos) {
        super(kmRecorridos);

        this.cantidadObstaculos = cantidadObstaculos;
    }


    //Metodos
    public double calcularTiempo(){
        return this.kmRecorridos/20*cantidadObstaculos;
    }

    public double calcularPuntaje(){
        return kmRecorridos*0.5;
    }

    //Getters and setters


    public int getCantidadObstaculos() {
        return cantidadObstaculos;
    }

    public void setCantidadObstaculos(int cantidadObstaculos) {
        this.cantidadObstaculos = cantidadObstaculos;
    }
}
