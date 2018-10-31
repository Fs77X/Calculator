import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	private JFrame calc;
	private JLabel a;
	private JLabel b;
	private JLabel soltext;
	private JTextField f1;
	private JTextField f2;
	private JTextField sol;
	private JButton add;
	private JButton subt;
	private JButton divide;
	private JButton Multip;
	private JButton first;
	private JButton second;
	private JButton quit;
	private JButton clear;

	Calculator() {

		this.setSize(500, 500);
		this.setLayout(null);
		this.setTitle("SlugCalculator™");
		this.setResizable(false);

		java.net.URL url = getClass().getResource("cyber-slugedit.png");
		ImageIcon slug = new ImageIcon(url);
		Image slugs = slug.getImage();
		Image newSlugs = slugs.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		ImageIcon newslugs = new ImageIcon(newSlugs);
		JLabel logo = new JLabel(newslugs);
		this.add(logo);
		logo.setLocation(300, -25);
		logo.setSize(200, 200);
		
		java.net.URL url1 = getClass().getResource("cyber-slugeditnotallowed.png");
		ImageIcon slugnope = new ImageIcon(url1);
		Image slugsNope = slugnope.getImage();
		Image newslugsNope = slugsNope.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		ImageIcon newslugnope = new ImageIcon(newslugsNope);

		a = new JLabel("Enter First Number: ");
		this.add(a);
		a.setLocation(20, 20);
		a.setSize(400, 20);

		b = new JLabel("Enter Second Number: ");
		this.add(b);
		b.setSize(400, 20);
		b.setLocation(20, 50);

		f1 = new JTextField(null);
		this.add(f1);
		f1.setLocation(140, 23);
		f1.setSize(100, 20);

		f2 = new JTextField(null);
		this.add(f2);
		f2.setLocation(160, 53);
		f2.setSize(100, 20);

		add = new JButton("+");
		this.add(add);
		add.setLocation(20, 300);
		add.setSize(50, 50);
		add.setBackground(new java.awt.Color(244, 106, 36));

		add.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				if (f1.getText().equals("") && f2.getText().equals("") || f1.getText().equals("")
						|| f2.getText().equals("")) {
					JOptionPane.showMessageDialog(calc, "Error 404, your values not found", "Plz give A",
							JOptionPane.ERROR_MESSAGE, newslugnope);

				} else {
					String a = f1.getText();
					String b = f2.getText();
					double x = Double.parseDouble(a);
					double y = Double.parseDouble(b);
					double solyx = x + y;
					String solxy = Double.toString(solyx);
					sol.setText(solxy);
				}

			}

		});

		subt = new JButton("-");
		this.add(subt);
		subt.setLocation(20, 360);
		subt.setSize(50, 50);
		subt.setBackground(new java.awt.Color(13, 101, 216));

		subt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (f1.getText().equals("") && f2.getText().equals("") || f1.getText().equals("")
						|| f2.getText().equals("")) {
					JOptionPane.showMessageDialog(calc, "Error 404, your values not found", "Plz give A",
							JOptionPane.ERROR_MESSAGE, newslugnope);

				} else {
					String a = f1.getText();
					String b = f2.getText();
					double x = Double.parseDouble(a);
					double y = Double.parseDouble(b);
					double solyx = x - y;
					String solxy = Double.toString(solyx);
					sol.setText(solxy);

				}

			}

		});

		divide = new JButton("÷");
		this.add(divide);
		divide.setLocation(75, 360);
		divide.setSize(50, 50);
		divide.setBackground(new java.awt.Color(247, 216, 12));

		divide.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (f1.getText().equals("") && f2.getText().equals("") || f1.getText().equals("")
						|| f2.getText().equals("")) {
					JOptionPane.showMessageDialog(calc, "Error 404, your values not found", "Plz give A",
							JOptionPane.ERROR_MESSAGE,newslugnope);

				} else {
					String a = f1.getText();
					String b = f2.getText();
					double x = Double.parseDouble(a);
					double y = Double.parseDouble(b);
					double solyx = x / y;
					String solxy = Double.toString(solyx);
					sol.setText(solxy);

				}

			}

		});

		Multip = new JButton("x");
		this.add(Multip);
		Multip.setLocation(75, 300);
		Multip.setSize(50, 50);
		Multip.setBackground(new java.awt.Color(0, 163, 19));
		Multip.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (f1.getText().equals("") && f2.getText().equals("") || f1.getText().equals("")
						|| f2.getText().equals("")) {
					JOptionPane.showMessageDialog(calc, "Error 404, your values not found", "Plz give A",
							JOptionPane.ERROR_MESSAGE,newslugnope);

				} else {
					String a = f1.getText();
					String b = f2.getText();
					double x = Double.parseDouble(a);
					double y = Double.parseDouble(b);
					double solyx = x * y;
					String solxy = Double.toString(solyx);
					sol.setText(solxy);

				}

			}

		});

		first = new JButton("Set First Number as the Calculated Solution");
		this.add(first);
		first.setLocation(20, 150);
		first.setSize(300, 50);
		first.setBackground(Color.BLUE);

		first.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (sol.getText().equals("")) {
					JOptionPane.showMessageDialog(calc, "Error 404, there's no calculated value", "Plz give A",
							JOptionPane.ERROR_MESSAGE,newslugnope);

				} else {
					String s = sol.getText();
					f1.setText(s);
//					f2.setText("");
//					sol.setText("");
				}

			}

		});

		second = new JButton("Set Second Number as the Calculated Solution");
		this.add(second);
		second.setLocation(20, 210);
		second.setSize(300, 50);
		second.setBackground(Color.YELLOW);

		second.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (sol.getText().equals("")) {
					JOptionPane.showMessageDialog(calc, "Error 404, there's no calculated value", "Plz give A",
							JOptionPane.ERROR_MESSAGE,newslugnope);

				} else {
					String s = sol.getText();
					f2.setText(s);
//					f1.setText("");
//					sol.setText("");
				}

			}

		});

		clear = new JButton("Clear");
		this.add(clear);
		clear.setLocation(370, 225);
		clear.setSize(100, 100);
		clear.setBackground(Color.BLUE);

		clear.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				f1.setText("");
				f2.setText("");
				sol.setText("");

			}

		});

		soltext = new JLabel("Solution: ");
		this.add(soltext);
		soltext.setLocation(140, 350);
		soltext.setSize(100, 20);

		sol = new JTextField(null);
		this.add(sol);
		sol.setEditable(false);
		sol.setLocation(200, 351);
		sol.setSize(125, 20);

		quit = new JButton("Quit");
		this.add(quit);
		quit.setLocation(370, 350);
		quit.setSize(100, 100);
		quit.setBackground(Color.YELLOW);

		quit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);

			}

		});

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		Calculator frame = new Calculator();

	}

}
