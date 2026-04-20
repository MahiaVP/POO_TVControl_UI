import Control.Control_UI;
import Control.Control_UI.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            Control_UI ui = new Control_UI();

            JFrame frame = new JFrame("Control TV");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(ui.getMainPanel());
            frame.setSize(250, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
}
}

