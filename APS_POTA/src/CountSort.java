
public class CountSort extends Comparador{

	public void countSort(int[] vetor) {

		int n = vetor.length;
		int saida[] = new int[n];

		// vetor auxliar para guardar o conteudo do vetor principal
		// em seu determinado indice
		int vetorAuxiliar[] = new int[n + 1];
		int x = vetorAuxiliar.length;

		// Guardar o conteudo do vetor principal
		// em seu determinado indice incrementando 1 em seu conteudo
		this.contador++;
		for (int i = 0; i < n; i++) {
			vetorAuxiliar[vetor[i]]++;
			this.contador++;
		}

		// Somar os valores do vetor com o da posição anterior
		this.contador++;
		for (int i = 1; i < x - 1; i++) {
			vetorAuxiliar[i] += vetorAuxiliar[i - 1];
			this.contador++;
		}
		this.contador++;
		for (int i = n - 1; i >= 0; i--) {
			saida[vetorAuxiliar[vetor[i]] - 1] = vetor[i];
			vetorAuxiliar[vetor[i]]--;
			this.contador++;
		}
		this.contador++;
		for (int i = 0; i < n; i++) {
			vetor[i] = saida[i];
			this.contador++;
		}
	}
}
