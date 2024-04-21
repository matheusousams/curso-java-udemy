package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

    public static void main(String[] args) {

        JFrame window = new JFrame("Observador");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(600, 200);
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null); // Centralizar na Tela!

        JButton button = new JButton("Clicar!");
        window.add(button);

        button.addActionListener(e -> {
            System.out.println("Evento ocorreu!");
        });

        window.setVisible(true);
    }
}
