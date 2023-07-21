public class Planeta {

    // Atributos:
    private String nombre;
    private double diametro;
    private int posicion;
    private String color;

    // Métodos:

    // Método constructor:
    public Planeta(String nombre,int posicion,String color){
        this.nombre = nombre;
        this.posicion = posicion;
        this.color = color;
    }

    // Getters and setters:

    public String getNombre(){ // Obtener el valor del nombre
        return this.nombre;
    }

    public void setNombre(String nombre){ // Nos ayuda a modificar o ajustar el nombre
        this.nombre = nombre;
    }

    public double getDiametro(){
        return this.diametro;
    }

    public void setDiametro(double diametro){
        this.diametro = diametro;
    }

    public int getPosicion(){
        return this.posicion;
    }

    public void setPosicion(int posicion){
        this.posicion = posicion;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    // Métodos personalizados:
    void verDatosDelPlaneta(){
        System.out.print("\n\n\t Nombre: "+this.nombre);
        System.out.print("\n\t Posición: "+this.posicion);
        System.out.print("\n\t Color: "+this.color);
    }

}
