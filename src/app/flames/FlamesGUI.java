package app.flames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FlamesGUI {

	private JFrame frame;
	private static JTextField txtBoy;
	private static JTextField txtGirl;
	private static JTextArea textRelation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlamesGUI window = new FlamesGUI();
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
	public FlamesGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 105, 180));
		frame.setBounds(100, 100, 1060, 637);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtBoy = new JTextField();
		txtBoy.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtBoy.setBounds(88, 224, 231, 72);
		frame.getContentPane().add(txtBoy);
		txtBoy.setColumns(10);

		txtGirl = new JTextField();
		txtGirl.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtGirl.setBounds(711, 224, 231, 72);
		frame.getContentPane().add(txtGirl);
		txtGirl.setColumns(10);

		JLabel lblBoy = new JLabel("Boy");
		lblBoy.setBounds(156, 320, 231, 96);
		lblBoy.setFont(new Font("Arial Black", Font.PLAIN, 40));
		lblBoy.setLabelFor(txtBoy);
		frame.getContentPane().add(lblBoy);

		JLabel lblGirl = new JLabel("Girl");
		lblGirl.setBounds(791, 324, 210, 88);
		lblGirl.setFont(new Font("Arial Black", Font.PLAIN, 40));
		frame.getContentPane().add(lblGirl);

		textRelation = new JTextArea();
		textRelation.setFont(new Font("Tahoma", Font.BOLD, 18));
		textRelation.setBounds(406, 416, 224, 72);
		textRelation.setEditable(false);
		frame.getContentPane().add(textRelation);

		JLabel lblRelationship = new JLabel("Relationship");
		lblRelationship.setBounds(416, 501, 288, 57);
		lblRelationship.setFont(new Font("Arial Black", Font.PLAIN, 30));
		frame.getContentPane().add(lblRelationship);

		JLabel lblFlames = new JLabel("FLAMES");
		lblFlames.setBounds(357, 55, 484, 109);
		lblFlames.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 50));
		frame.getContentPane().add(lblFlames);

		JButton btnFlames = new JButton("Flames");
		btnFlames.setBounds(461, 248, 97, 25);
		btnFlames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String names = Flames2.getNames(txtBoy.getText(), txtGirl.getText());
				String performFlames = Flames2.performFlames(names);
				String relationIs = Flames2.relationIs(performFlames);

				textRelation.setText(relationIs);

			}
		});
		frame.getContentPane().add(btnFlames);

	}
}
