import java.util.Random;

public class Condicional {

    public static void main(String[] args) {

        int moneda; // 0 o 1
        Random aleatorio = new Random();
        moneda = aleatorio.nextInt(0,2); // 0,1

        // Atajo: 'sout' + enter
        // \n significa salto de línea
        // \t significa tabulación
        // slash /, back slash \
        // System.out.println("\n\t Moneda: "+moneda);

        if(moneda==0){
            System.out.println("\n\t SOOOOL!");
        }else{
            System.out.println("\n\t ÁGUILAAAA!");
        }

    }

}
