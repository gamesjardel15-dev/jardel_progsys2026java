package wb_aula1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTextoTeste;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela01 frame = new Tela01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela01() {
		setResizable(false);
		setTitle("Painel Teste");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Teste");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(137, 26, 159, 30);
		contentPane.add(lblNewLabel);

		txtTextoTeste = new JTextField();
		txtTextoTeste.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTextoTeste.setBounds(34, 67, 374, 44);
		contentPane.add(txtTextoTeste);
		txtTextoTeste.setColumns(10);

		JButton btResgistrar = new JButton("RESGISTAR");
		btResgistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String produto = txtTextoTeste.getText().trim();
				if (produto.isEmpty()) {
					JOptionPane.showMessageDialog(null, "" + "Nome do produto\n\n" + produto);
					txtTextoTeste.setText("");
					txtTextoTeste.requestFocus();
				} else {

					JOptionPane.showMessageDialog(null, "Campo produto vazio" + "Fazer");
				}

			}
		});
		btResgistrar.setBounds(34, 138, 102, 23);
		contentPane.add(btResgistrar);

		JButton btSair = new JButton("SAIR");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(btSair, "Deseja realmente limpar", "Ação",
						JOptionPane.YES_NO_OPTION);

				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btSair.setBounds(306, 138, 102, 23);
		contentPane.add(btSair);

		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int resposta = JOptionPane.showConfirmDialog(btnLimpar, "Deseja realmente limpar", "Ação",
						JOptionPane.YES_NO_OPTION);

				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}

			}
		});
		btnLimpar.setBounds(166, 138, 102, 23);
		contentPane.add(btnLimpar);

	}
}
