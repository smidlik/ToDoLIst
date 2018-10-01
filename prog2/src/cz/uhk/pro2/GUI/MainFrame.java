package cz.uhk.pro2.GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(){
        init();
    }
    public void init(){
        setTitle("list App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640,480);
        setLocationRelativeTo(null);

        initControlPanel();
    }
    private void  initControlPanel(){
        JPanel controlPanel = new JPanel(new GridLayout(0,1));

        JPanel formPanel = new JPanel(new BorderLayout());
        JLabel lblAddTodo = new JLabel("Zadejte todo:");
        JTextField txtAddTodo = new JTextField();
        JButton btnAdd = new JButton("Přidat");

        formPanel.add(lblAddTodo, BorderLayout.WEST);
        formPanel.add(txtAddTodo,BorderLayout.CENTER);
        formPanel.add(btnAdd,BorderLayout.EAST);

        add(formPanel,BorderLayout.NORTH);

    }

}
