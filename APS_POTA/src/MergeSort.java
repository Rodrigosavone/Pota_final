public class MergeSort extends Comparador {

	public void MergeSort(int[] vetor, int inicio, int fim) {
		this.contador++;
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			MergeSort(vetor, inicio, meio);
			MergeSort(vetor, meio + 1, fim);
			Intercala(vetor, inicio, meio, fim);
		}
	}

	public void Intercala(int[] vetor, int inicio, int meio, int fim) {

		// Define o tamanho dos Subvetores da esquerda e da direita
		int esq = meio - inicio + 1;
		int dir = fim - meio;

		int[] Esquerda = new int[esq];
		int[] Direita = new int[dir];

		// Cada subvetor recebe os dados do vetor em suas posicões
		this.contador++;
		for (int i = 0; i < esq; i++) {
			Esquerda[i] = vetor[inicio + i];
			this.contador++;
		}
		this.contador++;
		for (int j = 0; j < dir; j++) {
			Direita[j] = vetor[meio + 1 + j];
			this.contador++;
		}

		// indice dos subvetores
		int i = 0, j = 0;

		// Começa a intercalar
		int k = inicio;
		this.contador++;
		while (i < esq && j < dir) {
			this.contador++;
			if (Esquerda[i] <= Direita[j]) {
				vetor[k] = Esquerda[i];
				i++;
			} else {
				vetor[k] = Direita[j];
				j++;
			}
			k++;
			this.contador++;
		}

		// Copia o resto dos elementos da Esquerda no vetor
		this.contador++;
		while (i < esq) {
			vetor[k] = Esquerda[i];
			i++;
			k++;
			this.contador++;
		}

		// Copia o resto dos elementos da Direita no vetor
		this.contador++;
		while (j < dir) {
			vetor[k] = Direita[j];
			j++;
			k++;
			this.contador++;
		}
	}
}
