import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI implements KeyListener {
    private JFrame window;

    public GUI() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (info.getName().equalsIgnoreCase("Windows Classic")) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception ex) {
            System.out.printf("Failed to set UI look and feel: %s", ex.getMessage());
        }

        window = new JFrame("FileTagger");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        JLabel label = new JLabel("Enter directory path:");
        Container content = window.getContentPane();
        content.add(label);

        JTextField text = new JTextField(40);
        // text.getDocument(); // https://stackoverflow.com/questions/3953208/value-change-listener-to-jtextfield
        text.addKeyListener(this);
        text.addPropertyChangeListener(null, null);
        content.add(text);

        content.setLayout(layout);

        window.pack();
        window.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        JTextField jtf = (JTextField)e.getComponent();
        System.out.printf("Current input: %s\n", jtf.getText());
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
