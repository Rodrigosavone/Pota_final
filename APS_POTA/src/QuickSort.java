
public class QuickSort extends Comparador {

	public void QuickSort(int[] vetor, int inicio, int fim) {
		this.contador++;
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			QuickSort(vetor, inicio, posicaoPivo - 1);
			QuickSort(vetor, posicaoPivo + 1, fim);
		}
	}

	public int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1, f = fim;

		this.contador++;
		while (i <= f) {
			this.contador++;
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[f])
				f--;
			else {
				int troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				i++;
				f--;
			}
			this.contador++;
		}
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;
		return f;
	}
}
