
//Gerardo Molina 14492
//Erick Bautista 15192

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import javax.swing.ImageIcon;
public class grafo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					grafo frame = new grafo();
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
	public grafo() {
		setTitle("Grafo");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelGrafo = new JLabel("New label");
		labelGrafo.setBounds(10, 11, 592, 386);
		ImageIcon direccion= new ImageIcon("grafo.jpg");
		direccion.setImageObserver(labelGrafo);
		labelGrafo.setIcon(direccion);
		contentPane.add(labelGrafo);
		
		
		
		
	}
}
