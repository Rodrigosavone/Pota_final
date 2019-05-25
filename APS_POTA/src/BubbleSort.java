
public class BubbleSort extends Comparador{

	public void BubbleSort(int[] vetor) {
		
		int n = vetor.length;
		do {
			int newn = 0;
			this.contador++;
			for (int i = 1; i < n; i++) {
				this.contador++;
				if (vetor[i - 1] > vetor[i]) {
					int aux = vetor[i - 1];
					vetor[i - 1] = vetor[i];
					vetor[i] = aux;
					newn = i;
				}
				this.contador++;
			}
			n = newn;
			this.contador++;
		} while (n > 0);
	}
}
