
public class HeapSort extends Comparador{

	public void HeapSort(int[] vet) {

		int n = vet.length;

		this.contador++;
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(vet, n, i);
			this.contador++;
		}
		this.contador++;
		for (int i = n - 1; i >= 0; i--) {
			int temp = vet[0];
			vet[0] = vet[i];
			vet[i] = temp;

			heapify(vet, i, 0);
			this.contador++;
		}
		
	}

	public void heapify(int[] vet, int n, int i) {

		int maior = i;
		int esq = 2 * i + 1;
		int dir = 2 * i + 2;

		this.contador++;
		if (esq < n && vet[esq] > vet[maior]) {
			maior = esq;
		}
		this.contador++;
		if (dir < n && vet[dir] > vet[maior]) {
			maior = dir;
		}
		this.contador++;
		if (maior != i) {
			int aux = vet[i];
			vet[i] = vet[maior];
			vet[maior] = aux;

			heapify(vet, n, maior);
		}
	}
}
