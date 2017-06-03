package View;

import javax.swing.*;

/**
 * Created by GL552VW on 6/3/2017.
 */
public class MainPanel {
    public void ViewMainPanel(){
        JFrame mainFrame = new JFrame("Main Frame");
        final JLabel label = new JLabel("Selamat datang");
        mainFrame.getContentPane().add(label);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
    public JButton AddButton(String nama){
        JButton newButton = new JButton(nama);
    }
}
