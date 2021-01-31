import javax.swing.*;
import java.awt.event.*;

public class login extends JDialog {

    public JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField username;
    private JPasswordField password;

    public login() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);


        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {


        System.out.println(username.getText());
        System.out.println(password.getPassword());
        // add your code here

        validation k = new validation();
        if(k.validate(username.getText(),String.valueOf(password.getPassword()))){
            //home h=new home();
            JOptionPane.showMessageDialog(contentPane, "loggin in");
            home n = new home();
            n.setVisible(true);

        }
        else {
            JOptionPane.showMessageDialog(contentPane, "Invalid Username or Passowrd");
        }
        //dispose();
    }

    private void onCancel() {
        // add
        dispose();
    }

    public static void main(String[] args) {
        login dialog = new login();

        dialog.pack();
        dialog.setVisible(true);System.exit(0);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
