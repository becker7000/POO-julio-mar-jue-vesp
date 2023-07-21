public class AutomovilTest {

    public static void main(String[] args) {

        // Instancias(objetos) de la clase Automovil
        Automovil auto1 = new Automovil("Ford","Bronco",1200000.0);
        Automovil auto2 = new Automovil("Toyota","Corolla",540000);
        Automovil auto3 = new Automovil("Subaru","BRZ",750000);

        // Usando un método de la clase Automovil
        auto1.verDatosDelAuto();
        auto2.verDatosDelAuto();
        auto3.verDatosDelAuto();

    }

}
