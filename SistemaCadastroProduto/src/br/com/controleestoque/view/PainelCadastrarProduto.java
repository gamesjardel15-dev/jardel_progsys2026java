package br.com.controleestoque.view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PainelCadastrarProduto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtProduto;

	/**
	 * Create the panel.
	 */
	public PainelCadastrarProduto() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel painelCampos = new JPanel();
		add(painelCampos);
		
		txtProduto = new JTextField();
		painelCampos.add(txtProduto);
		txtProduto.setColumns(10);
		
		JLabel lblProduto = new JLabel("Produto");
		painelCampos.add(lblProduto);

	}

}
