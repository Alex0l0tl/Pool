import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Table
{
	private JPanel poolTable=new JPanel();
	private JFrame window = new JFrame();
	private ImageIcon table=new ImageIcon("Table.png");
	private ImageIcon ball1=new ImageIcon("1ball.png");//Balls are set at 38x38 pixels and should probably be decalred in an array
	private JLabel lblTable = new JLabel(table);
	private JLabel lblBall1 = new JLabel(ball1);
	public Table()
	{
		this.window=new JFrame();
		this.poolTable=new JPanel();//Need to work out how to overlap different labels
		//poolTable.add(lblTable);
		poolTable.add(lblBall1);
		poolTable.add(lblTable);
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