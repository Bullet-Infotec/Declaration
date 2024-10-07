import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroUsuarioForm extends JFrame {
    
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JPasswordField txtConfirmPassword;

    public CadastroUsuarioForm() {
        setTitle("Cadastro de Usuário");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initUI();
        setVisible(true);
    }

    private void initUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel labelUsername = new JLabel("Usuário:");
        txtUsername = new JTextField();

        JLabel labelPassword = new JLabel("Senha:");
        txtPassword = new JPasswordField();

        JLabel labelConfirmPassword = new JLabel("Confirmar Senha:");
        txtConfirmPassword = new JPasswordField();

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());
                String confirmPassword = new String(txtConfirmPassword.getPassword());

                if (password.equals(confirmPassword)) {
                    Database.saveUser(username, password);
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                    dispose(); 
                } else {
                    JOptionPane.showMessageDialog(null, "As senhas não coincidem!");
                }
            } 
        });

        panel.add(labelUsername);
        panel.add(txtUsername);
        panel.add(labelPassword);
        panel.add(txtPassword);
        panel.add(labelConfirmPassword);
        panel.add(txtConfirmPassword);
        panel.add(new JLabel(""));
        panel.add(btnCadastrar);

        add(panel);
    }
}
