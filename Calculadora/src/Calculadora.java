import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	String acumulacao;
	String operador;
	double resultado = 0;

	
	/**
	 * Create the frame.
	 */
	public Calculadora() {
		
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 375);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setForeground(new Color(255, 255, 240));
		panel_1.setBounds(10, 100, 372, 214);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton oito = new JButton("8");
		oito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acumulacao == null) {
					tela.setText("8");
					acumulacao = "8";
				} else {
					tela.setText(acumulacao + "8");
					acumulacao += "8";
					
				}
			}
		});
		oito.setBounds(95, 11, 49, 30);
		panel_1.add(oito);
		
		JButton sete = new JButton("7");
		sete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acumulacao == null) {
					tela.setText("7");
					acumulacao = "7";
				} else {
					tela.setText(acumulacao + "7");
					acumulacao += "7";
					
				}
			}
		});
		sete.setBounds(36, 11, 49, 30);
		panel_1.add(sete);
		
		JButton nove = new JButton("9");
		nove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acumulacao == null) {
					tela.setText("9");
					acumulacao = "9";
				} else {
					tela.setText(acumulacao + "9");
					acumulacao += "9";
					
				}
			}
		});
		nove.setBounds(151, 11, 49, 30);
		panel_1.add(nove);
		
		JButton quatro = new JButton("4");
		quatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acumulacao == null) {
					tela.setText("4");
					acumulacao = "4";
				} else {
					tela.setText(acumulacao + "4");
					acumulacao += "4";
					
				}
			}
		});
		quatro.setBounds(36, 52, 49, 30);
		panel_1.add(quatro);
		
		JButton cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acumulacao == null) {
					tela.setText("5");
					acumulacao = "5";
				} else {
					tela.setText(acumulacao + "5");
					acumulacao += "5";
					
				}
			}
		});
		cinco.setBounds(95, 52, 49, 30);
		panel_1.add(cinco);
		
		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acumulacao == null) {
					tela.setText("6");
					acumulacao = "6";
				} else {
					tela.setText(acumulacao + "6");
					acumulacao += "6";
					
				}
			}
		});
		seis.setBounds(151, 52, 49, 30);
		panel_1.add(seis);
		
		JButton um = new JButton("1");
		um.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acumulacao == null) {
					tela.setText("1");
					acumulacao = "1";
				} else {
					tela.setText(acumulacao + "1");
					acumulacao += "1";
					
				}
					
			}
		});
		um.setBounds(36, 93, 49, 30);
		panel_1.add(um);
		
		JButton dois = new JButton("2");
		dois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (acumulacao == null) {
					tela.setText("2");
					acumulacao = "2";
				} else {
					tela.setText(acumulacao + "2");
					acumulacao += "2";
					
				}
			}
		});
		dois.setBounds(95, 93, 49, 30);
		panel_1.add(dois);
		
		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acumulacao == null) {
					tela.setText("3");
					acumulacao = "3";
				} else {
					tela.setText(acumulacao + "3");
					acumulacao += "3";
					
				}
			}
		});
		tres.setBounds(151, 93, 49, 30);
		panel_1.add(tres);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acumulacao == null) {
					tela.setText("0");
					acumulacao = "0";
				} else {
					tela.setText(acumulacao + "0");
					acumulacao += "0";
					
				}
			}
		});
		zero.setBounds(36, 134, 49, 30);
		panel_1.add(zero);
		
		JButton apaga = new JButton("C");
		apaga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acumulacao = null;
				tela.setText("0");
			}
		});
		apaga.setBounds(36, 175, 164, 30);
		panel_1.add(apaga);
		
		JButton dividido = new JButton("\u00F7");
		dividido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acumulacao += "/";
				tela.setText(acumulacao);
				operador = "/";
			}
		});
		dividido.setBounds(210, 11, 124, 30);
		panel_1.add(dividido);
		
		JButton vezes = new JButton("X");
		vezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acumulacao += "x";
				tela.setText(acumulacao);
				operador = "x";
			}
		});
		vezes.setBounds(210, 52, 124, 30);
		panel_1.add(vezes);
		
		JButton menos = new JButton("-");
		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acumulacao += "-";
				tela.setText(acumulacao);
				operador = "-";
			}
		});
		menos.setBounds(210, 93, 124, 30);
		panel_1.add(menos);
		
		JButton mais = new JButton("+");
		mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acumulacao += "+";
				tela.setText(acumulacao);
				operador = "+";
				
			}
		});
		mais.setBounds(210, 134, 124, 30);
		panel_1.add(mais);
		
		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
												
				if (operador.equals("+")) {
					resultado = Double.parseDouble(acumulacao.substring(0, acumulacao.indexOf('+'))) + Integer.parseInt(acumulacao.substring(acumulacao.indexOf('+')));
					tela.setText(String.valueOf(resultado));
					
				} if (operador.equals("-")) {
					resultado = Double.parseDouble(acumulacao.substring(0, acumulacao.indexOf('-'))) - Double.parseDouble(acumulacao.substring(acumulacao.indexOf('-') + 1));
					tela.setText(String.valueOf(resultado));
			
					
				} else if (operador.equals("x")) {
					resultado = Double.parseDouble(acumulacao.substring(0, acumulacao.indexOf('x'))) *  Double.parseDouble(acumulacao.substring(acumulacao.indexOf('x') + 1));
					tela.setText(String.valueOf(resultado));

					
				} else if (operador.equals("/")) {
					resultado = Double.parseDouble(acumulacao.substring(0, acumulacao.indexOf('/'))) /  Double.parseDouble(acumulacao.substring(acumulacao.indexOf('/') + 1));
					tela.setText(String.valueOf(resultado));
		
				}
				
				acumulacao = String.valueOf(resultado);
						
			}
		});
		igual.setBounds(95, 134, 105, 30);
		panel_1.add(igual);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(210, 175, 124, 30);
		panel_1.add(btnNewButton);
		
		tela = new JTextField();
		tela.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tela.setHorizontalAlignment(SwingConstants.RIGHT);
		tela.setEditable(false);
		tela.setBounds(10, 40, 372, 30);
		contentPane.add(tela);
		tela.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 81, 372, 8);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("Calculadora em Java");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 15, 372, 14);
		contentPane.add(lblNewLabel);
	}
}
