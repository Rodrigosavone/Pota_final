
public class RadixSort extends Comparador{

	public  int[] Radixsort(int[] vetor) {
		//Chamada do metodo de Ordenação, usar o for para calcular cada casa
		        int x = vetor[0];
		        int quant = 0;
		        
		        this.contador++;
		        for (int i = 0; i < vetor.length; i++) {
		        	this.contador++;
		            if (x < vetor[i]) {
		                x = vetor[i];
		            }
		            this.contador++;
		        }
		        
		        this.contador++;
		        while (x != 0) {
		            x = x / 10;
		            quant++;
		            this.contador++;
		        }
		        this.contador++;
		        for (int i = 1; i < quant; i = i * 10) {
		            vetor = Ordenador(vetor, i);
		            this.contador++;
		        }

		        return vetor;
		    }

		    private static int digito(int value, int digitPlace) {
		        // Encontra valor do digito refente ao ciclo 
		        int ret = ((value / digitPlace) % 10);
		        return ret;

		    }

		    private int[] Ordenador(int[] vetor, int place) {
		        int[] Vetor_original = new int[vetor.length];
		        int[] Vetor_novo = new int[10];
		        
		        // atribui +1 na localização referente ao valor da casa 
		        this.contador++;
		        for (int i = 0; i < vetor.length; i++) {
		            int valor = digito(vetor[i], place);
		            Vetor_novo[valor] += 1;
		            this.contador++;
		        }
		        
		        // soma dos vetores caso a casa da esquerda for maior que da direita 
		        this.contador++;
		        for (int i = 1; i < Vetor_novo.length; i++) {
		            Vetor_novo[i] += Vetor_novo[i - 1];
		            this.contador++;
		        }
		        
		        // aloca os vetor originais a posicao correta de acordo com o valor da casa
		        this.contador++;
		        for (int i = vetor.length - 1; i >= 0; i--) {
		            int digit = digito(vetor[i], place);

		            Vetor_original[Vetor_novo[digit] - 1] = vetor[i];
		            Vetor_novo[digit]--;
		            this.contador++;
		        }

		        return Vetor_original;

		    }
		  
		}