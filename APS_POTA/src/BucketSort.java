import java.util.LinkedList;

public class BucketSort extends Comparador{

	    public  void insertionSort(int[] vetor) {
	        int aux = vetor.length;
	        
	        this.contador++;
	        
	        for (int j = 1; j<aux; j++) {
	            int newA = vetor[j];
	            int i = j-1;
	            this.contador++;
	            while ((i > -1) && (vetor[i] > newA)) {
	                vetor[i+1] = vetor[i];
	                i--;
	                this.contador++;
	            }
	            vetor[i+1] = newA;
	            this.contador++;
	        }
	        
	    }
	    public void BucketSort(int[] vetor, int maiorValor)
	{
		int qBaldes = maiorValor/5;

		LinkedList[] B = new LinkedList[qBaldes];

		this.contador++;
		for (int i = 0; i < qBaldes; i++){
			B[i] = new LinkedList<Integer>();
			this.contador++;
		}

		//Coloca os valores no balde respectivo:
		this.contador++;
		for (int i = 0; i < vetor.length; i++) {
			int j = qBaldes-1;
			this.contador++;
			while (true){
				this.contador++;
				if(j<0){
					 break;
				}
				this.contador++;
				if(vetor[i] >= (j*5)){
					 B[j].add(vetor[i]);
					 break;
				}
				j--;
				this.contador++;
			}
			this.contador++;
		}

		//Ordena e atualiza o vetor:
		int indice = 0;
		this.contador++;
		for (int i = 0; i < qBaldes; i++){

			int[] aux = new int[B[i].size()];

			//Coloca cada balde num vetor:
			this.contador++;
			for (int j = 0; j < aux.length; j++){
					aux[j] = (Integer)B[i].get(j);
					this.contador++;
			}

			insertionSort(aux); //algoritmo escolhido para ordenação.

			// Devolve os valores ao vetor de entrada:
			this.contador++;
			for (int j = 0; j < aux.length; j++, indice++){
				vetor[indice] = aux[j];
				this.contador++;
			}
			
			this.contador++;

		}
	}
}
