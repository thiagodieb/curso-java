import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		int d = Integer.parseInt(JOptionPane.showInputDialog("Dimensão"));
		int[][] matriz = new int[d][d];
		
		for (int i = 0; i < d; i++) {
			for (int j = 0; j <= i; j++)
				if ((j == 0) || j == i)
					matriz[i][j] = 1;
				else {
					matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
				}
		}

	}
}
