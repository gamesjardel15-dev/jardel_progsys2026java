package ProjectView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroSimples extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtProduto;
	private JTextField txtValor;
	private JTextField txtQuantidade;
    private String msg;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroSimples frame = new TelaCadastroSimples();
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
	public TelaCadastroSimples() {
		setTitle("Cadastro Simples de Produto");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(txtProduto);

		JLabel lblTitulo = new JLabel("Cadastro Simples de Produto");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitulo.setBounds(110, 36, 400, 30);
		contentPane.add(lblTitulo);
		
		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setBounds(63, 95, 100, 25);
		contentPane.add(lblProduto);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setBounds(85, 120, 100, 25);
		contentPane.add(lblValor);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(50, 145, 100, 25);
		contentPane.add(lblQuantidade);
		
		txtProduto = new JTextField();
		txtProduto.setBounds(120, 92, 220, 25);
		contentPane.add(txtProduto);
		txtProduto.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setBounds(120, 117, 220, 25);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(120, 142, 220, 25);
		contentPane.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				exibir();
				
			}
			
		});
		btnEnviar.setBounds(50, 189, 100, 30);
		contentPane.add(btnEnviar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(177, 189, 100, 30);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(303, 189, 100, 30);
		contentPane.add(btnSair);
		setLocationRelativeTo(null);
		
	}
	
	public void exibir() {
		String produto = txtProduto.getText().trim();
		String quantidade = txtQuantidade.getText().trim();
		String valor = txtValor.getText().trim();
		
		msg += produto + "\n";
		msg += quantidade + "\n";
		msg += valor + "\n";
		
		JOptionPane.showMessageDialog(null, msg);
		
	}
	
	public void sair() {
		System.exit(0);
	}
	public void limpar() {
		txtProduto.setText("");
		txtQuantidade.setText("");
		txtProduto.setText("");
		
	}
	
	
}
