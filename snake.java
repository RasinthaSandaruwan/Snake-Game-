import javax.swing.*;

public class snake{

	public static void main(String[] args) throws Exception {
		int boardwidth = 600;
		int boardhight = 600;

		JFrame frame = new JFrame("Snake");
		frame.setVisible(true);
		frame.setSize(boardwidth, boardhight);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		snakeGame SnakeGame=new snakeGame(boardwidth,boardhight);
		frame.add(SnakeGame);
		frame.pack();
		SnakeGame.requestFocus();
	}
} 