import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Table
{
	private JPanel poolTable=new JPanel();
	private JFrame window = new JFrame();
	private ImageIcon table=new ImageIcon("Table.png");
	private JLabel label = new JLabel(table);
	public Table()
	{
		this.window=new JFrame();
		this.poolTable=new JPanel();
		poolTable.add(label);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(980,600);
        window.setVisible(true);
		window.setContentPane(poolTable);
	}
	public static void main(String[] args)
    {
        System.out.println("Program Running");
    }
}