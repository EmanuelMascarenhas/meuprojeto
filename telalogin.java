package Sistemalogin;
 import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import org.mindrot.jbcrypt.BCrypt;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class telalogin {

	private JFrame frame;
	private JTextField textEmail;
	private JTextField textSenha;
	private JTextField textConfirmeSenha;
	String txtEmail;
	String senha;
	String confirmesenha;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telalogin window = new telalogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telalogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(26, 215, 230));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		try {
			MaskFormatter maskcpf = new MaskFormatter("###.###.###-##");
			textEmail = new JFormattedTextField(maskcpf);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro nos campos formatados: " + e.getMessage());
		}
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(182, 40, 60, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel Email = new JLabel("Email");
		Email.setBounds(127, 103, 46, 14);
		frame.getContentPane().add(Email);
		
		JLabel Senha = new JLabel("Senha");
		Senha.setBounds(127, 138, 46, 14);
		frame.getContentPane().add(Senha);
		
		textEmail = new JTextField();
		textEmail.setBounds(217, 100, 86, 20);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(441, 230, 197, 20);
		frame.getContentPane().add(textSenha);
		
		JButton btnCadastrar = new JButton("cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEmail = textEmail.getText().trim();
				senha = new String(((JPasswordField) textSenha).getPassword()).trim();
				confirmesenha = new String(((JPasswordField) textConfirmeSenha).getPassword()).trim();
				if(txtEmail.isEmpty() == false) {
					
				} else {
					JOptionPane.showMessageDialog(null, "Email não pode ficar vazio!","Erro",3);
				}
						
			}
		});
			
		btnCadastrar.setBounds(167, 212, 89, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JLabel ConfirmeSenha = new JLabel("Confirme Senha");
		ConfirmeSenha.setBounds(127, 175, 80, 14);
		frame.getContentPane().add(ConfirmeSenha);
		
		textConfirmeSenha = new JPasswordField();
		textConfirmeSenha.setBounds(441, 255, 197, 20);
		frame.getContentPane().add(textConfirmeSenha);
	
	}
}
