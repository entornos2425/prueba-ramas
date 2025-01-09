package aleatorios;

import javax.swing.JOptionPane;

public class aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elementos = Integer.parseInt(JOptionPane.showInputDialog("TECLEA UN NUMERO  + DE UNO=>"));
		int num_aleat[] = new int[elementos];
		for (int i = 0; i < num_aleat.length; i++) {
			num_aleat[i] = (int) Math.random() * 50;
		}
		for (int elem : num_aleat) {
			System.out.println(elem);
		}

	}

}
