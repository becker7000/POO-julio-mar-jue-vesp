public class Automovil {

    // Atributos:
    String marca;
    String modelo;
    double precio;

    // Constructor:
    Automovil(String marca,String modelo,double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Método personalizado:
    void verDatosDelAuto(){
        System.out.print("\n\n\t Marca: "+this.marca);
        System.out.print("\n\t Modelo: "+this.modelo);
        System.out.print("\n\t Precio: $"+this.precio);
    }

}
