import javax.swing.JOptionPane;

public class GUIPrac {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		// ���ڸ� �������� ���ڸ� ���� ���� parseInt, parseDouble �� ���ؼ� ���� ��ȯ�Ѵ�.
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");

	}

}
