
public class SelectionSort extends Comparador{

	public void SelectionSort(int[] vetor) {
		
		this.contador++;
		for (int i = 0; i < vetor.length; i++) {

			int minimo = i;
			this.contador++;
			for (int j = i + 1; j < vetor.length; j++) {
				this.contador++;
				if (vetor[j] < vetor[minimo]) {
					minimo = j;
				}
				this.contador++;
			}
			int aux = vetor[i];
			vetor[i] = vetor[minimo];
			vetor[minimo] = aux;

			this.contador++;
		}

//		System.out.println("Nº de Comparações Selection Sort: " + this.contador);
//		System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
	}
}
