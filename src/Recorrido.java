public abstract class Recorrido {



    //Atributos
    double kmRecorridos;

    public Recorrido(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }


    //METODOS ABSTRACTOS
    public abstract double calcularTiempo();

    public abstract double calcularPuntaje();


    //GETTERS AND SETTERS
    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }







}
