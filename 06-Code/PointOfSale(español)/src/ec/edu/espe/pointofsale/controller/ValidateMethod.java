package ec.edu.espe.pointofsale.controller;

import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class ValidateMethod {

    public void validateIntegers(KeyEvent evt, JTextField txt, JLabel lblError) {

        String value = txt.getText();
        char getKey = evt.getKeyChar();
        if (getKey >= '0' && getKey <= '9'
                || getKey == KeyEvent.VK_BACK_SPACE) {
            txt.setEditable(true);
            lblError.setText("");
        } else {
            txt.setEditable(false);
            lblError.setText("*Only numbers please");
        }
    }

    public void validateCharacters(KeyEvent evt, JTextField txt, JLabel lblError) {

        String value = txt.getText();
        char getKey = evt.getKeyChar();
        if (getKey >= 'A' && getKey <= 'Z'
                || getKey >= 'a' && getKey <= 'z'
                || getKey == KeyEvent.VK_BACK_SPACE
                || getKey == KeyEvent.VK_SPACE) {
            txt.setEditable(true);
            lblError.setText("");
        } else {
            txt.setEditable(false);
            lblError.setText("*Only characters please");
        }
    }

    public void validateFloat(KeyEvent evt, JTextField txt, JLabel lblError) {
        char getKey = evt.getKeyChar();
        if ((getKey >= '0' && getKey <= '9')
                || (getKey == '.')
                || getKey == KeyEvent.VK_BACK_SPACE) {
            txt.setEditable(true);
            lblError.setText("");
            if (txt.getText().contains(".")) {
                txt.setEditable(false);
                lblError.setText("*Only one dot please");
                if (getKey >= '0' && getKey <= '9'
                        || getKey == KeyEvent.VK_BACK_SPACE) {
                    txt.setEditable(true);
                    lblError.setText("");
                }
            }
        } else {
            txt.setEditable(false);
            lblError.setText("*Only numbers please");
        }
    }
}
