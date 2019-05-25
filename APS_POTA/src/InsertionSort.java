
public class InsertionSort extends Comparador{

	public void InsertionSort(int[] vetor) {

		this.contador++;
		for (int j = 1; j < vetor.length; j++) {
			this.contador++;
			int aux = vetor[j];
			int i = j;
			this.contador++;
			while (i > 0 && vetor[i - 1] > aux) {
				vetor[i] = vetor[i - 1];
				i -= 1;
				this.contador++;
			}
			vetor[i] = aux;
			this.contador++;
		}
	}
}
