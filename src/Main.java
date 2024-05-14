import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double  total = 0;
        double media;
        List<Integer> listaCalorias = new ArrayList<>();

        for(int i = 0;i < 7; i++){
            int calorias = Integer.parseInt(JOptionPane.showInputDialog("Escreva quantas calorias voce comeu na sua semana"));
            listaCalorias.add(calorias);
            total += calorias;
        }

        media = total / 7;

        for (int calorias : listaCalorias) {
            JOptionPane.showMessageDialog(null, "Calorias diarias:" + calorias);
        }

        JOptionPane.showMessageDialog(null, "TOTAL DE CALORIAS: "+total+"\nMEDIA DE CALORIAS POR DIA: "+media);
    }
}