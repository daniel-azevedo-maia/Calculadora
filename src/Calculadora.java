import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tela;
	private String acumulacao = "";
	private String operador = "";

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

	public Calculadora() {
		configurarJanela();
		configurarInterface();
	}

	private void configurarJanela() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 375);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	private void configurarInterface() {
		configurarTela();
		configurarTeclado();
		configurarRotulo();
	}

	private void configurarTela() {
		tela = new JTextField("0");
		tela.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tela.setHorizontalAlignment(SwingConstants.RIGHT);
		tela.setEditable(false);
		tela.setBounds(10, 40, 372, 30);
		contentPane.add(tela);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 81, 372, 8);
		contentPane.add(separator);
	}

	private void configurarRotulo() {
		JLabel rotulo = new JLabel("Calculadora em Java");
		rotulo.setForeground(Color.WHITE);
		rotulo.setHorizontalAlignment(SwingConstants.CENTER);
		rotulo.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 14));
		rotulo.setBounds(10, 15, 372, 14);
		contentPane.add(rotulo);
	}

	private void configurarTeclado() {
		JPanel painelTeclado = new JPanel();
		painelTeclado.setBorder(new LineBorder(Color.BLACK));
		painelTeclado.setBackground(new Color(0, 0, 128));
		painelTeclado.setBounds(10, 100, 372, 214);
		painelTeclado.setLayout(null);
		contentPane.add(painelTeclado);

		adicionarBotoesNumericos(painelTeclado);
		adicionarBotoesOperadores(painelTeclado);
		adicionarBotoesFuncionais(painelTeclado);
	}

	private void adicionarBotoesNumericos(JPanel painel) {
		String[] numeros = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0"};
		int x = 36, y = 11, largura = 49, altura = 30;

		for (int i = 0; i < numeros.length; i++) {
			final String numero = numeros[i]; // Variável final para uso na lambda
			JButton botao = criarBotao(numero, e -> adicionarNumero(numero));
			botao.setBounds(x, y, largura, altura);
			painel.add(botao);

			x += largura + 10;
			if ((i + 1) % 3 == 0) {
				x = 36;
				y += altura + 10;
			}
		}
	}

	private void adicionarBotoesOperadores(JPanel painel) {
		String[] operadores = {"/", "x", "-", "+"};
		int y = 11, largura = 124, altura = 30;

		for (String op : operadores) {
			final String operadorAtual = op; // Variável final para uso na lambda
			JButton botao = criarBotao(operadorAtual, e -> definirOperador(operadorAtual));
			botao.setBounds(210, y, largura, altura);
			painel.add(botao);
			y += altura + 10;
		}
	}

	private void adicionarBotoesFuncionais(JPanel painel) {
		JButton igual = criarBotao("=", e -> calcularResultado());
		igual.setBounds(95, 134, 105, 30);
		painel.add(igual);

		JButton limpar = criarBotao("C", e -> limparTela());
		limpar.setBounds(36, 175, 164, 30);
		painel.add(limpar);

		JButton sair = criarBotao("Sair", e -> System.exit(0));
		sair.setBounds(210, 175, 124, 30);
		painel.add(sair);
	}

	private JButton criarBotao(String texto, ActionListener acao) {
		JButton botao = new JButton(texto);
		botao.addActionListener(acao);
		return botao;
	}

	private void adicionarNumero(String numero) {
		if (acumulacao.isEmpty() && numero.equals("0")) return; // Evita 0 inicial desnecessário

		acumulacao += numero;
		tela.setText(acumulacao);
	}

	private void definirOperador(String op) {
		if (!acumulacao.isEmpty() && operador.isEmpty()) {
			operador = op;
			acumulacao += operador;
			tela.setText(acumulacao);
		}
	}

	private void calcularResultado() {
		try {
			if (!acumulacao.isEmpty() && !operador.isEmpty()) {
				String[] partes = acumulacao.split("[\\+\\-x/]");
				if (partes.length == 2) {
					double numero1 = Double.parseDouble(partes[0]);
					double numero2 = Double.parseDouble(partes[1]);
					double resultado = executarOperacao(numero1, numero2);

					tela.setText(String.valueOf(resultado));
					acumulacao = String.valueOf(resultado);
					operador = "";
				}
			}
		} catch (Exception e) {
			tela.setText("Erro");
			acumulacao = "";
			operador = "";
		}
	}

	private double executarOperacao(double num1, double num2) {
		return switch (operador) {
			case "+" -> num1 + num2;
			case "-" -> num1 - num2;
			case "x" -> num1 * num2;
			case "/" -> num2 != 0 ? num1 / num2 : 0; // Evita divisão por zero
			default -> 0;
		};
	}

	private void limparTela() {
		acumulacao = "";
		operador = "";
		tela.setText("0");
	}
}