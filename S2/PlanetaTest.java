public class PlanetaTest {

    public static void main(String[] args) {

        // Instancias(Objetos) de la clase Planeta
        Planeta planeta1 = new Planeta("Mercurio",1,"Arena");
        Planeta planeta2 = new Planeta("Venus",2,"Anaranjado");
        Planeta planeta3 = new Planeta("Tierra",3,"Azul");
        Planeta planeta4 = new Planeta("Marte",4,"Rojo");

        // Una vez encapusalada la clase Planeta (ya no se puede este código)
        // planeta1.nombre = "Saturno (error)"; // Falla en la seguridad.

        // Usando los setters para ajustar el diametro
        planeta1.setDiametro(48794);
        planeta2.setDiametro(12104);
        planeta3.setDiametro(12742);
        planeta4.setDiametro(6779);

        // Aplicando en método personalizado
        // Usando los getters para ver los diametros:
        planeta1.verDatosDelPlaneta();
        System.out.print("\n\t Diametro: "+planeta1.getDiametro()+" km");
        planeta2.verDatosDelPlaneta();
        System.out.print("\n\t Diametro: "+planeta2.getDiametro()+" km");
        planeta3.verDatosDelPlaneta();
        System.out.print("\n\t Diametro: "+planeta3.getDiametro()+" km");
        planeta4.verDatosDelPlaneta();
        System.out.print("\n\t Diametro: "+planeta4.getDiametro()+" km");

        // Atajo: ctrl + shift + arriba/abajo (mover una línea de lugar)

    }

}
