public class RecorridoFacil extends Recorrido{

    //Constructor
    public RecorridoFacil(double kmRecorridos) {
        super(kmRecorridos);
    }

    //Metodos
    public double calcularTiempo(){
        return this.kmRecorridos/30;
    }

    public double calcularPuntaje(){
        return kmRecorridos*2;
    }
}
