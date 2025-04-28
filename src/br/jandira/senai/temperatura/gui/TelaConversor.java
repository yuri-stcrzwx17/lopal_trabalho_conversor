package br.jandira.senai.temperatura.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Temperatura.java;

/**
 * Classe responsável pela interface gráfica do conversor
 */
public class TelaConversor extends JFrame {
    private JTextField txtCelsius;
    private JLabel lblResultado;
    private JLabel lblErro;

    public TelaConversor() {
        // Configuração básica da janela
        setTitle("Conversor de Temperatura");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1, 10, 10));

        // Componentes da interface
        JLabel lblTitulo = new JLabel("Digite a temperatura em Celsius:", SwingConstants.CENTER);
        txtCelsius = new JTextField();
        JButton btnFahrenheit = new JButton("FAHRENHEIT");
        JButton btnKelvin = new JButton("KELVIN");
        lblResultado = new JLabel("", SwingConstants.CENTER);
        lblErro = new JLabel("", SwingConstants.CENTER);
        lblErro.setForeground(Color.RED);

        // Adicionando componentes à janela
        add(lblTitulo);
        add(txtCelsius);
        add(btnFahrenheit);
        add(btnKelvin);
        add(lblResultado);
        add(lblErro);

        // Configuração dos botões
        btnFahrenheit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                converterTemperatura("F");
            }
        });

        btnKelvin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                converterTemperatura("K");
            }
        });
    }

    /**
     * Método para realizar a conversão
      tipo "F" para Fahrenheit ou "K" para Kelvin
     */
    private void converterTemperatura(String tipo) {
        try {
            double celsius = Double.parseDouble(txtCelsius.getText());
            br.jandira.senai.temperatura.model.Temperatura temp = new br.jandira.senai.temperatura.model.Temperatura(celsius);
            
            if (tipo.equals("F")) {
                double fahrenheit = temp.converterParaFahrenheit();
                lblResultado.setText(String.format("%.2f °FAHRENHEIT", fahrenheit));
            } else {
                double kelvin = temp.converterParaKelvin();
                lblResultado.setText(String.format("%.2f KELVIN", kelvin));
            }
            
            lblErro.setText("");
        } catch (NumberFormatException ex) {
            lblErro.setText("Entrada inválida! Digite apenas números.");
            lblResultado.setText("");
        }
    }
}
