package br.jandira.senai.temperatura.gui;

public class TelaConversor {

	import java.awt.Dimension;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JList;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;

	public class TelaConversor {
	    private JLabel ;
	    private JTextField txtMultiplicando;
	    private JLabel labelMinMultiplicador;
	    private JTextField txtMinMultiplicador;
	    private JLabel labelMaxMultiplicador;
	    private JTextField txtMaxMultiplicador;
	    private JButton btnCalcular;
	    private JButton btnLimpar;
	    private JLabel labelResultado;
	    private JScrollPane scrollTabuada;
	    private JList listaTabuada;
	    
	    
		public void criarTela() {
			
	JFrame tela = new JFrame();
			

			//Definir o tamanho da tela atraves de um objeto Dimension:
			Dimension tamanho = new  Dimension();
			tamanho.setSize(335, 700);
			tela.setSize(tamanho);
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tela.setTitle("Tabuada");
			tela.setLayout(null);
			tela.setLocationRelativeTo(tela);
			tela.setResizable(false);
			
			
			//Criar um JLabel e um JTextField para o multiplicando:
		    labelMultiplicando = new JLabel();
			labelMultiplicando.setText("Valor do Multiplicante: ");
			labelMultiplicando.setBounds(50, 40, 150, 30);
			
			
			//Criar um JLabel e um JTextField para o multiplicando:
			labelMinMultiplicador = new JLabel();
			labelMinMultiplicador.setText("Mínimo Multiplicador: ");
			labelMinMultiplicador.setBounds(50, 80, 150, 30);
			
			txtMinMultiplicador = new JTextField();
			txtMinMultiplicador.setBounds(210, 80, 60, 30);
			
			
			// Adicionando o Maximo Multiplicador: 
			labelMaxMultiplicador = new JLabel();
			labelMaxMultiplicador.setText("Maxímo Multiplicador:");
			labelMaxMultiplicador.setBounds(50, 120, 150, 30);
			
			txtMaxMultiplicador = new JTextField();
			txtMaxMultiplicador.setBounds(210, 120, 60, 30);
			
			
			// Adicionando os Botões:
			btnCalcular = new JButton();
			btnCalcular.setText("Calcular");
			btnCalcular.setBounds(50, 160, 105, 30);
			
			btnLimpar = new JButton();
			btnLimpar.setText("Limpar");
			btnLimpar.setBounds(165, 160, 105, 30);
			
			
			// Label do Resultado:
			labelResultado = new JLabel();
			labelResultado.setText("Resultado: ");
			labelResultado.setBounds(50, 200, 200, 30);
			
			
			// Criando o Painel de Rolagem para a lista
			listaTabuada = new JList();
			
			//Criando painel de rolagem para a lista 
			scrollTabuada = new JScrollPane(listaTabuada);
			scrollTabuada.setBounds(50, 240, 220, 380);
			
			
			// Criando a lista que exibirá a tabuada

			//listaTabuada.setListData(cidades);
			
			
			//Criar um TextField:
			
			txtMultiplicando = new JTextField();
			txtMultiplicando.setBounds(210, 40, 60, 30);
			
			
			// Adicionando os componentes ao painel de conteúdo:
			tela.getContentPane().add(labelMultiplicando);
			tela.getContentPane().add(txtMultiplicando);		
			tela.getContentPane().add(labelMinMultiplicador);
			tela.getContentPane().add(txtMinMultiplicador);		
			tela.getContentPane().add(labelMaxMultiplicador);
			tela.getContentPane().add(txtMaxMultiplicador);		
			tela.getContentPane().add(btnCalcular);	
			tela.getContentPane().add(btnLimpar);	
			tela.getContentPane().add(labelResultado);	