import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {

    public MainForm() {
        setTitle("Sistema de Licitações");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        initMenu();
        setVisible(true);
    }

    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menuEmpresa = new JMenu("Empresa");
        JMenuItem itemCadastrar = new JMenuItem("Cadastrar Empresa");
        itemCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EmpresaForm();
            }
        });

        menuEmpresa.add(itemCadastrar);
        menuBar.add(menuEmpresa);

        setJMenuBar(menuBar);
    }
}
