import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Table
{
	private JPanel poolTable=new JPanel();
	private JFrame window = new JFrame();
	private JLayeredPane layeredPane= new JLayeredPane();
	private ImageIcon table=new ImageIcon("Table.png");
	private ImageIcon poolCue=new ImageIcon("PoolCue.png");
	private ImageIcon[] balls={new ImageIcon("1ball.png"),new ImageIcon("2ball.png"),new ImageIcon("3ball.png"),new ImageIcon("4ball.png"),new ImageIcon("5ball.png"),new ImageIcon("6ball.png"),new ImageIcon("7ball.png"),new ImageIcon("8ball.png"),new ImageIcon("WhiteBall.png")};
	private JLabel lblTable = new JLabel(table);
	//private JLabel lblBall1 = new JLabel(ball1);
	public Table()
	{
		this.window=new JFrame();
		
		//poolTable.add(lblBall1);
		//poolTable.add(lblTable);
		this.layeredPane= new JLayeredPane();
		layeredPane.setPreferredSize(new Dimension(980, 590));
		layeredPane.setBorder(BorderFactory.createTitledBorder(
                                    "Test message"));
		layeredPane.add(lblTable);
		//this.poolTable=new JPanel();
		//poolTable.add(lblTable);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(2000,1000);
        window.setVisible(true);
		window.setContentPane(layeredPane);

	}
	public static void main(String[] args)
    {

    }
}