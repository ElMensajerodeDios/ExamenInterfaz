package PaqC01;

import javax.swing.*;

public class VentanaExamen extends JFrame {
    private JTextArea ContenedoresPeso;
    private JPanel mainPanel;

    public VentanaExamen(String d) {
        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);

        ContenedoresPeso.setText(d);
    }
}
