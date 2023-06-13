package Mini3.vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import Mini3.controlador.Controlador;
import Mini3.controlador.Operations;

public class VistaAddCandy extends JFrame {
    public VistaAddCandy(){
        setTitle("Dulceria");
        setSize(670, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Usamos un diseño nulo para posicionar los componentes manualmente
        setResizable(false);

        JPanel panelBackground1 = new JPanel();
        panelBackground1.setLayout(null);
        panelBackground1.setSize(670, 500);

        JPanel addCandyPanel = new JPanel();
        addCandyPanel.setLayout(null);
        addCandyPanel.setSize(570, 400);
        addCandyPanel.setBackground(new Color(255, 255, 255));
        addCandyPanel.setFont(new Font("Roboto Light", 0, 12));
        addCandyPanel.setBackground(Color.white);
        //por ahora el add(addCandyPanel) se pone aqui para poder visualizar el proceso, luego se cambia de posicion 
        add(addCandyPanel);

        JLabel addCandyLabel = new JLabel( );
        addCandyLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        addCandyLabel.setText("ADD NEW CANDY");
        addCandyLabel.setBounds(40,10,210,40);
        addCandyPanel.add(addCandyLabel);

        JLabel candyName = new JLabel("Name");
        candyName.setFont(new Font ("Roboto Medium", 0, 14));
        candyName.setBounds(40, 80, 150, 30);
        addCandyPanel.add(candyName);

        JTextField nameTF = new JTextField();
        nameTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        nameTF.setForeground(new java.awt.Color(153, 153, 153));
        nameTF.setText("Add a new candy");
        nameTF.setBounds(40,115,250,20);
        nameTF.setBorder(null);
        addCandyPanel.add(nameTF);

        JSeparator separator1 = new JSeparator();
        separator1.setBounds(40,135,250,10);
        separator1.setForeground(new Color(206,206,206));
        addCandyPanel.add(separator1);

        JLabel candyType = new JLabel("Type");
        candyType.setFont(new Font ("Roboto Medium", 0, 14));
        candyType.setBounds(40, 170, 150, 30);
        addCandyPanel.add(candyType);

        JTextField TypeTF = new JTextField();
        TypeTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        TypeTF.setForeground(new java.awt.Color(153, 153, 153));
        TypeTF.setText("Type of candy");
        TypeTF.setBounds(40,205,250,20);
        TypeTF.setBorder(null);
        addCandyPanel.add(TypeTF);

        JSeparator separator2 = new JSeparator();
        separator2.setBounds(40,225,250,10);
        separator2.setForeground(new Color(206,206,206));
        addCandyPanel.add(separator2);

        JButton addCandyButton = new JButton("ADD");
        addCandyButton.setForeground(Color.white);
        addCandyButton.setBackground(new Color(225,59,59));
        addCandyButton.setBounds(40, 295, 120, 30);
        addCandyPanel.add(addCandyButton);

        JButton backButton = new JButton("BACK");
        backButton.setForeground(Color.white);
        backButton.setBackground(new Color(225,59,59));
        backButton.setBounds(200, 295, 120, 30);
        addCandyPanel.add(backButton);

        JLabel logo = new JLabel(new ImageIcon("C:\\Cristian\\Programando\\2023\\POE\\MiniProyecto3\\Miniproyecto_3\\Mini3\\vista\\logo1.png"));     
        logo.setBounds(340, 10, 60, 60);
        addCandyPanel.add(logo);

        //panel sobre panel
        addCandyPanel.setVisible(true);
        panelBackground1.add(addCandyPanel);
        addCandyPanel.setBounds(135,30,400,400);
        JLabel backGroundPic1 = new JLabel(new ImageIcon("C:\\Cristian\\Programando\\2023\\POE\\MiniProyecto3\\Miniproyecto_3\\Mini3\\vista\\caramelo-menta-remolino-representacion-3d_69110-279.png"));
        backGroundPic1.setBounds(0,0,670,459);
        panelBackground1.add(backGroundPic1);
        panelBackground1.setVisible(true);
        add(panelBackground1);

    }

    /*public void start(Controlador controlador) {
        controlador.setOperations(Operations.ADD);
        buttonAdd.addActionListener(controlador);
        setTitle("Tienda Dulces");
        setLocationRelativeTo(null);
    }*/

    public static void main(String[] args) {
        VistaAddCandy frame2 = new VistaAddCandy();
        frame2.setVisible(true);
    }
}