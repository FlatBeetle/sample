import java.awt.*;
import javax.swing.*;

class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));
	}
}
class CenterPanel extends JPanel {
	public CenterPanel() {
		setLayout(null);
		JLabel label = new JLabel("Hello Java!");
		label.setBounds(100,50,100,20);
		add(label);
	}
}
	
	
public class OpenChallenge extends JFrame {
	public OpenChallenge() {
		setTitle("OpenChallenge 8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new NorthPanel(), BorderLayout.NORTH);
		add(new CenterPanel(), BorderLayout.CENTER);
		
		
		setSize(300,200);
		setVisible(true);
}
public static void main(String[] args) {
	new OpenChallenge();
		
	}

}
