package br.casa;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Orc extends JPanel {
	private JButton btnFechar;

	/**
	 * Create the panel.
	 */
	public Orc() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblOrcamento = new JLabel("Orcamento");
		GridBagConstraints gbc_lblOrcamento = new GridBagConstraints();
		gbc_lblOrcamento.insets = new Insets(0, 0, 0, 5);
		gbc_lblOrcamento.gridx = 0;
		gbc_lblOrcamento.gridy = 0;
		panel.add(lblOrcamento, gbc_lblOrcamento);
		
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnFechar = new GridBagConstraints();
		gbc_btnFechar.anchor = GridBagConstraints.EAST;
		gbc_btnFechar.gridx = 1;
		gbc_btnFechar.gridy = 0;
		panel.add(btnFechar, gbc_btnFechar);

	}
	public void setAcaoFechar(ActionListener action) {
		btnFechar.addActionListener(action);
	}

}
