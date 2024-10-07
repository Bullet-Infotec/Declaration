import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpresaForm extends JFrame {
    private JTextField txtRazaoSocial, txtCNPJ, txtResponsavel, txtCargo, txtRG, txtOrgaoExpedidor, txtCPF, txtCidade;

    public EmpresaForm() {
        setTitle("Cadastro de Empresa");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initUI();
        setVisible(true);
    }

    private void initUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2));

        JLabel labelRazao = new JLabel("Razão Social:");
        txtRazaoSocial = new JTextField();

        JLabel labelCNPJ = new JLabel("CNPJ:");
        txtCNPJ = new JTextField();

        JLabel labelResponsavel = new JLabel("Responsável:");
        txtResponsavel = new JTextField();

        JLabel labelCargo = new JLabel("Cargo:");
        txtCargo = new JTextField();

        JLabel labelRG = new JLabel("RG:");
        txtRG = new JTextField();

        JLabel labelOrgao = new JLabel("Orgão Expedidor:");
        txtOrgaoExpedidor = new JTextField();

        JLabel labelCPF = new JLabel("CPF:");
        txtCPF = new JTextField();

        JLabel labelCidade = new JLabel("Cidade:");
        txtCidade = new JTextField();

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica de salvamento dos dados
                JOptionPane.showMessageDialog(null, "Empresa cadastrada com sucesso!");
            }
        });

        panel.add(labelRazao);
        panel.add(txtRazaoSocial);
        panel.add(labelCNPJ);
        panel.add(txtCNPJ);
        panel.add(labelResponsavel);
        panel.add(txtResponsavel);
        panel.add(labelCargo);
        panel.add(txtCargo);
        panel.add(labelRG);
        panel.add(txtRG);
        panel.add(labelOrgao);
        panel.add(txtOrgaoExpedidor);
        panel.add(labelCPF);
        panel.add(txtCPF);
        panel.add(labelCidade);
        panel.add(txtCidade);
        panel.add(new JLabel(""));
        panel.add(btnSalvar);

        add(panel);
    }
}
