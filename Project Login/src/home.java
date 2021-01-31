import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class home extends JDialog {
    private JPanel panel1;
    private JPanel panel2;
    private JButton button1;

    private void createUIComponents() {
        // TODO: place custom component creation code here
        //panel1.setVisible(true);
    }
    public home(){

        setContentPane(panel1);
        setModal(true);
        getRootPane().setContentPane(panel1);
    }

    public static void main(String[] args) {
        home ialog = new home();

        ialog.pack();
        ialog.setVisible(true);
        System.exit(0);

    }

}
