package CadastroView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CadastroProduto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtProduto;
	private JTextField txtValor;
	private JTextField txtQuantidade;
    private String msg;
    private JTable tabelaProdutos;
    private DefaultTableModel modeloTabela;
    private int contadorCadastro = 1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProduto frame = new CadastroProduto();
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
	public CadastroProduto() {
		setTitle("TabelaProduto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Produto");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(159, 56, 99, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblValor.setBounds(318, 56, 99, 32);
		contentPane.add(lblValor);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQuantidade.setBounds(516, 56, 99, 32);
		contentPane.add(lblQuantidade);
		
		txtProduto = new JTextField();
		txtProduto.setBounds(159, 99, 151, 30);
		contentPane.add(txtProduto);
		txtProduto.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(318, 99, 192, 30);
		contentPane.add(txtValor);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setColumns(10);
		txtQuantidade.setBounds(516, 99, 113, 30);
		contentPane.add(txtQuantidade);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarProduto();
			}
		});
		btnNewButton.setBounds(36, 146, 77, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				 limparCampos();
			}
		});
		btnLimpar.setBounds(36, 180, 77, 23);
		contentPane.add(btnLimpar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excluirProduto();
			}
		});
		btnExcluir.setBounds(36, 214, 77, 23);
		contentPane.add(btnExcluir);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 sair();
			}
		});
		btnSair.setBounds(36, 248, 77, 23);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel_1 = new JLabel("Painel de Cadastro de Produtos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(159, 11, 313, 34);
		contentPane.add(lblNewLabel_1);
	    configurarTabela();

	}
	    private void adicionarProduto() {
	    	String produto = txtProduto.getText().trim();
			String valortexto = txtValor.getText().trim().replace(",", ".");
			String quantidadetexto = txtQuantidade.getText().trim();
			
			try {
            
				if(produto.isEmpty() || valortexto.isEmpty()) {
				
				JOptionPane.showMessageDialog(null, "Preencha todos os campos");
				} else {
					double valor = Double.parseDouble(valortexto);
					int quantidade = Integer.parseInt(quantidadetexto);
					double total = valor * quantidade;
					
					modeloTabela.addRow(new Object[] { contadorCadastro, produto, valor, quantidade, total });
					contadorCadastro++;

					txtProduto.setText("");
					txtQuantidade.setText("");
					txtValor.setText("");
					txtProduto.requestFocus();
				}
				
			} catch (NumberFormatException e2) {
				// TODO: handle exception
				
			}
			
	    }
	    private void configurarTabela() {
	    	
	    	JScrollPane scrollPaneTabelaProduto = new JScrollPane();
	    	scrollPaneTabelaProduto.setBounds(159, 146, 587, 331);
	    	contentPane.add(scrollPaneTabelaProduto);
	    	
	    	tabelaProdutos = new JTable();
	    	scrollPaneTabelaProduto.setColumnHeaderView(tabelaProdutos);
	    	scrollPaneTabelaProduto.setViewportView(tabelaProdutos);
	    	
	    	
	    	modeloTabela = new DefaultTableModel();
	    			modeloTabela.addColumn("Nº");
	    			modeloTabela.addColumn("Produto");
	    			modeloTabela.addColumn("Valor");
	    			modeloTabela.addColumn("Quantidade");
	    			modeloTabela.addColumn("Total");
	    			tabelaProdutos.setModel(modeloTabela);
	    			
	    			tabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(10); // primeira coluna
	    			tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(200); // primeira coluna
	    			tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(50); // primeira coluna
	    			tabelaProdutos.getColumnModel().getColumn(3).setPreferredWidth(50); // primeira coluna
	    			tabelaProdutos.getColumnModel().getColumn(4).setPreferredWidth(100); // primeira coluna
	    			scrollPaneTabelaProduto.setViewportView(tabelaProdutos);
	    	
	    	
	    }
	    private void limparCampos() {
	    	
	    	txtProduto.setText("");;
	    	txtValor.setText("");
	    	txtQuantidade.setText("");
	    	
	    }
	    private void excluirProduto() {
	    	
			int linhaSelecionada = tabelaProdutos.getSelectedRow();

			if (linhaSelecionada == -1) {
				JOptionPane.showMessageDialog(
					this,
					"Selecione uma linha da tabela para excluir.",
					"Atenção",
					JOptionPane.WARNING_MESSAGE
				);

				return;
			}
			int resposta = JOptionPane.showConfirmDialog(
					this,
					"Deseja realmente excluir a linha selecionada?",
					"Confirmar exclusão",
					JOptionPane.YES_NO_OPTION
				);

				if (resposta == JOptionPane.YES_OPTION) {
					modeloTabela.removeRow(linhaSelecionada);
					
					
				}
	    }
	    private void sair() {
	    System.exit(0);
	    
	    }
 }
