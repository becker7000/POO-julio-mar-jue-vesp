import javax.swing.*;

public class SumaGauss {

    public static void main(String[] args) {

        int max,contador=1,suma=0;

        max = Integer.parseInt(JOptionPane.showInputDialog("Sumar del 1 al: "));

        while (contador<=max){
            suma+=contador; // suma = 0 + 1 + 2 + 3 + 4
            contador++; // contador -> max
        }

        JOptionPane.showMessageDialog(null,
                "La suma del 1 al "+max+" es: "+suma,
                "Suma de gauss",JOptionPane.INFORMATION_MESSAGE);

    }

}
