import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aplicacao extends Comparador {

	public static void main(String[] args) {
		int opcao;

		Scanner entrada = new Scanner(System.in);

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Digite uma opção:\n" + "1 - Vetor Tamanho 5\n" + "2 - Vetor Tamanho 10\n"
							+ "3 - Vetor Tamanho 50\n" + "4 - Vetor Tamanho 100\n" + "5 - Vetor Tamanho 1.000\n"
							+ "6 - Vetor Tamanho 10.000\n" + "7 - Sair"));
			switch (opcao) {
			case 1:

				/*
				 * CRIANDO VETORES RAMDOMICOS DE 5 POSIÇÕES
				 */
				for (int j = 0; j <= 50; j++) {

					int vetor[] = new int[5];
					int vetorInsertion[] = new int[5];
					int vetorSelection[] = new int[5];
					int vetorMerge[] = new int[5];
					int vetorQuick[] = new int[5];
					int vetorHeap[] = new int[5];
					int vetorCount[] = new int[5];
					int vetorRadix[] = new int[5];
					int vetorBucket[] = new int[5];

					Random r = new Random();
					for (int i = 0; i < vetor.length; i++) {
						vetor[i] = r.nextInt(5);
						vetorInsertion[i] = vetor[i];
						vetorSelection[i] = vetor[i];
						vetorMerge[i] = vetor[i];
						vetorQuick[i] = vetor[i];
						vetorHeap[i] = vetor[i];
						vetorCount[i] = vetor[i];
						vetorRadix[i] = vetor[i];
						vetorBucket[i] = vetor[i];
					}
					/*
					 * BubbleSort
					 */

					BubbleSort bubble = new BubbleSort();

					bubble.BubbleSort(vetor);
					System.out.println("Nº de Comparações Bubble Sort: " + bubble.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");

					/*
					 * InsertionSort
					 */

					InsertionSort insertion = new InsertionSort();

					insertion.InsertionSort(vetorInsertion);
					System.out.println("Nº de Comparações Insertion Sort: " + insertion.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");

					/*
					 * SelectionSort
					 */

					SelectionSort selection = new SelectionSort();

					selection.SelectionSort(vetorSelection);
					System.out.println("Nº de Comparações Selection Sort: " + selection.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * MergeSort
					 */

					MergeSort merge = new MergeSort();

					merge.MergeSort(vetorMerge, 0, vetorMerge.length - 1);
					System.out.println("Nº de Comparações Merge Sort: " + merge.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * HeapSort
					 */

					HeapSort heap = new HeapSort();

					heap.HeapSort(vetorHeap);
					System.out.println("Nº de Comparações Heap Sort: " + heap.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * QuickSort
					 */

					QuickSort quick = new QuickSort();

					quick.QuickSort(vetorQuick, 0, vetorQuick.length - 1);
					System.out.println("Nº de Comparações Quick Sort: " + quick.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");

					/*
					 * CountSort
					 */

					CountSort count = new CountSort();

					count.countSort(vetorCount);
					System.out.println("Nº de Comparações Count Sort: " + count.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					/*
					 * RadixSort
					 */

					RadixSort radix = new RadixSort();

					radix.Radixsort(vetorRadix);
					System.out.println("Nº de Comparações Radix Sort: " + radix.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * BucketSort
					 */

					BucketSort bucket = new BucketSort();

					bucket.BucketSort(vetorBucket, vetor.length);
					System.out.println("Nº de Comparações Bucket Sort: " + bucket.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");

					System.out.println("======================================");
				}
				break;

			case 2:

				/*
				 * CRIANDO VETORES RAMDOMICOS DE 10 POSIÇÕES
				 */
				for (int j = 0; j <= 50; j++) {

					int vetor[] = new int[10];
					int vetorInsertion[] = new int[10];
					int vetorSelection[] = new int[10];
					int vetorMerge[] = new int[10];
					int vetorQuick[] = new int[10];
					int vetorHeap[] = new int[10];
					int vetorCount[] = new int[10];
					int vetorRadix[] = new int[10];
					int vetorBucket[] = new int[10];

					Random r = new Random();
					for (int i = 0; i < vetor.length; i++) {
						vetor[i] = r.nextInt(10);
						vetorInsertion[i] = vetor[i];
						vetorSelection[i] = vetor[i];
						vetorMerge[i] = vetor[i];
						vetorQuick[i] = vetor[i];
						vetorHeap[i] = vetor[i];
						vetorCount[i] = vetor[i];
						vetorRadix[i] = vetor[i];
						vetorBucket[i] = vetor[i];
					}
					/*
					 * BubbleSort
					 */

					BubbleSort bubble = new BubbleSort();

					bubble.BubbleSort(vetor);
					System.out.println("Nº de Comparações Bubble Sort: " + bubble.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * InsertionSort
					 */

					InsertionSort insertion = new InsertionSort();

					insertion.InsertionSort(vetorInsertion);
					System.out.println("Nº de Comparações Insertion Sort: " + insertion.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * SelectionSort
					 */

					SelectionSort selection = new SelectionSort();

					selection.SelectionSort(vetorSelection);
					System.out.println("Nº de Comparações Selection Sort: " + selection.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * MergeSort
					 */

					MergeSort merge = new MergeSort();

					merge.MergeSort(vetorMerge, 0, vetorMerge.length - 1);
					System.out.println("Nº de Comparações Merge Sort: " + merge.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * HeapSort
					 */

					HeapSort heap = new HeapSort();

					heap.HeapSort(vetorHeap);
					System.out.println("Nº de Comparações Heap Sort: " + heap.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * QuickSort
					 */

					QuickSort quick = new QuickSort();

					quick.QuickSort(vetorQuick, 0, vetorQuick.length - 1);
					System.out.println("Nº de Comparações Quick Sort: " + quick.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * CountSort
					 */

					CountSort count = new CountSort();

					count.countSort(vetorCount);
					System.out.println("Nº de Comparações Count Sort: " + count.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * RadixSort
					 */

					RadixSort radix = new RadixSort();

					radix.Radixsort(vetorRadix);
					System.out.println("Nº de Comparações Radix Sort: " + radix.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * BucketSort
					 */

					BucketSort bucket = new BucketSort();

					bucket.BucketSort(vetorBucket, vetor.length);
					System.out.println("Nº de Comparações Bucket Sort: " + bucket.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					System.out.println("======================================");
				}
				break;

			case 3:

				/*
				 * CRIANDO VETORES RAMDOMICOS DE 50 POSIÇÕES
				 */
				for (int j = 0; j <= 50; j++) {

					int vetor[] = new int[50];
					int vetorInsertion[] = new int[50];
					int vetorSelection[] = new int[50];
					int vetorMerge[] = new int[50];
					int vetorQuick[] = new int[50];
					int vetorHeap[] = new int[50];
					int vetorCount[] = new int[50];
					int vetorRadix[] = new int[50];
					int vetorBucket[] = new int[50];

					Random r = new Random();
					for (int i = 0; i < vetor.length; i++) {
						vetor[i] = r.nextInt(50);
						vetorInsertion[i] = vetor[i];
						vetorSelection[i] = vetor[i];
						vetorMerge[i] = vetor[i];
						vetorQuick[i] = vetor[i];
						vetorHeap[i] = vetor[i];
						vetorCount[i] = vetor[i];
						vetorRadix[i] = vetor[i];
						vetorBucket[i] = vetor[i];
					}
					/*
					 * BubbleSort
					 */

					BubbleSort bubble = new BubbleSort();

					bubble.BubbleSort(vetor);
					System.out.println("Nº de Comparações Bubble Sort: " + bubble.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");

					/*
					 * InsertionSort
					 */

					InsertionSort insertion = new InsertionSort();

					insertion.InsertionSort(vetorInsertion);
					System.out.println("Nº de Comparações Insertion Sort: " + insertion.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * SelectionSort
					 */

					SelectionSort selection = new SelectionSort();

					selection.SelectionSort(vetorSelection);
					System.out.println("Nº de Comparações Selection Sort: " + selection.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * MergeSort
					 */

					MergeSort merge = new MergeSort();

					merge.MergeSort(vetorMerge, 0, vetorMerge.length - 1);
					System.out.println("Nº de Comparações Merge Sort: " + merge.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * HeapSort
					 */

					HeapSort heap = new HeapSort();

					heap.HeapSort(vetorHeap);
					System.out.println("Nº de Comparações Heap Sort: " + heap.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * QuickSort
					 */

					QuickSort quick = new QuickSort();

					quick.QuickSort(vetorQuick, 0, vetorQuick.length - 1);
					System.out.println("Nº de Comparações Quick Sort: " + quick.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * CountSort
					 */

					CountSort count = new CountSort();

					count.countSort(vetorCount);
					System.out.println("Nº de Comparações Count Sort: " + count.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * RadixSort
					 */

					RadixSort radix = new RadixSort();

					radix.Radixsort(vetorRadix);
					System.out.println("Nº de Comparações Radix Sort: " + radix.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * BucketSort
					 */

					BucketSort bucket = new BucketSort();

					bucket.BucketSort(vetorBucket, vetor.length);
					System.out.println("Nº de Comparações Bucket Sort: " + bucket.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					System.out.println("======================================================");
				}
				break;

			case 4:

				/*
				 * CRIANDO VETORES RAMDOMICOS DE 50 POSIÇÕES
				 */
				for (int j = 0; j <= 50; j++) {

					int vetor[] = new int[100];
					int vetorInsertion[] = new int[100];
					int vetorSelection[] = new int[100];
					int vetorMerge[] = new int[100];
					int vetorQuick[] = new int[100];
					int vetorHeap[] = new int[100];
					int vetorCount[] = new int[100];
					int vetorRadix[] = new int[100];
					int vetorBucket[] = new int[100];

					Random r = new Random();
					for (int i = 0; i < vetor.length; i++) {
						vetor[i] = r.nextInt(100);
						vetorInsertion[i] = vetor[i];
						vetorSelection[i] = vetor[i];
						vetorMerge[i] = vetor[i];
						vetorQuick[i] = vetor[i];
						vetorHeap[i] = vetor[i];
						vetorCount[i] = vetor[i];
						vetorRadix[i] = vetor[i];
						vetorBucket[i] = vetor[i];
					}
					/*
					 * BubbleSort
					 */

					BubbleSort bubble = new BubbleSort();

					bubble.BubbleSort(vetor);
					System.out.println("Nº de Comparações Bubble Sort: " + bubble.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					/*
					 * InsertionSort
					 */

					InsertionSort insertion = new InsertionSort();

					insertion.InsertionSort(vetorInsertion);
					System.out.println("Nº de Comparações Insertion Sort: " + insertion.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * SelectionSort
					 */

					SelectionSort selection = new SelectionSort();

					selection.SelectionSort(vetorSelection);
					System.out.println("Nº de Comparações Selection Sort: " + selection.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * MergeSort
					 */

					MergeSort merge = new MergeSort();

					merge.MergeSort(vetorMerge, 0, vetorMerge.length - 1);
					System.out.println("Nº de Comparações Merge Sort: " + merge.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * HeapSort
					 */

					HeapSort heap = new HeapSort();

					heap.HeapSort(vetorHeap);
					System.out.println("Nº de Comparações Heap Sort: " + heap.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * QuickSort
					 */

					QuickSort quick = new QuickSort();

					quick.QuickSort(vetorQuick, 0, vetorQuick.length - 1);
					System.out.println("Nº de Comparações Quick Sort: " + quick.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * CountSort
					 */

					CountSort count = new CountSort();

					count.countSort(vetorCount);
					System.out.println("Nº de Comparações Count Sort: " + count.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					

					/*
					 * RadixSort
					 */

					RadixSort radix = new RadixSort();

					radix.Radixsort(vetorRadix);
					System.out.println("Nº de Comparações Radix Sort: " + radix.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * BucketSort
					 */

					BucketSort bucket = new BucketSort();

					bucket.BucketSort(vetorBucket, vetor.length);
					System.out.println("Nº de Comparações Bucket Sort: " + bucket.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					System.out.println("======================================================");

				}
				break;

			case 5:

				/*
				 * CRIANDO VETORES RAMDOMICOS DE 1000 POSIÇÕES
				 */
				for (int j = 0; j <= 50; j++) {

					int vetor[] = new int[1000];
					int vetorInsertion[] = new int[1000];
					int vetorSelection[] = new int[1000];
					int vetorMerge[] = new int[1000];
					int vetorQuick[] = new int[1000];
					int vetorHeap[] = new int[1000];
					int vetorCount[] = new int[1000];
					int vetorRadix[] = new int[1000];
					int vetorBucket[] = new int[1000];

					Random r = new Random();
					for (int i = 0; i < vetor.length; i++) {
						vetor[i] = r.nextInt(1000);
						vetorInsertion[i] = vetor[i];
						vetorSelection[i] = vetor[i];
						vetorMerge[i] = vetor[i];
						vetorQuick[i] = vetor[i];
						vetorHeap[i] = vetor[i];
						vetorCount[i] = vetor[i];
						vetorRadix[i] = vetor[i];
						vetorBucket[i] = vetor[i];
					}
					/*
					 * BubbleSort
					 */

					BubbleSort bubble = new BubbleSort();

					bubble.BubbleSort(vetor);
					System.out.println("Nº de Comparações Bubble Sort: " + bubble.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					/*
					 * InsertionSort
					 */

					InsertionSort insertion = new InsertionSort();

					insertion.InsertionSort(vetorInsertion);
					System.out.println("Nº de Comparações Insertion Sort: " + insertion.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * SelectionSort
					 */

					SelectionSort selection = new SelectionSort();

					selection.SelectionSort(vetorSelection);
					System.out.println("Nº de Comparações Selection Sort: " + selection.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * MergeSort
					 */

					MergeSort merge = new MergeSort();

					merge.MergeSort(vetorMerge, 0, vetorMerge.length - 1);
					System.out.println("Nº de Comparações Merge Sort: " + merge.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * HeapSort
					 */

					HeapSort heap = new HeapSort();

					heap.HeapSort(vetorHeap);
					System.out.println("Nº de Comparações Heap Sort: " + heap.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * QuickSort
					 */

					QuickSort quick = new QuickSort();

					quick.QuickSort(vetorQuick, 0, vetorQuick.length - 1);
					System.out.println("Nº de Comparações Quick Sort: " + quick.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * CountSort
					 */

					CountSort count = new CountSort();

					count.countSort(vetorCount);
					System.out.println("Nº de Comparações Count Sort: " + count.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * RadixSort
					 */

					RadixSort radix = new RadixSort();

					radix.Radixsort(vetorRadix);
					System.out.println("Nº de Comparações Radix Sort: " + radix.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * BucketSort
					 */

					BucketSort bucket = new BucketSort();

					bucket.BucketSort(vetorBucket, vetor.length);
					System.out.println("Nº de Comparações Bucket Sort: " + bucket.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					System.out.println("======================================================");

				}
				break;

			case 6:
				/*
				 * CRIANDO VETORES RAMDOMICOS DE 10000 POSIÇÕES
				 */
				for (int j = 0; j <= 50; j++) {

					int vetor[] = new int[10000];
					int vetorInsertion[] = new int[10000];
					int vetorSelection[] = new int[10000];
					int vetorMerge[] = new int[10000];
					int vetorQuick[] = new int[10000];
					int vetorHeap[] = new int[10000];
					int vetorCount[] = new int[10000];
					int vetorRadix[] = new int[10000];
					int vetorBucket[] = new int[10000];

					Random r = new Random();
					for (int i = 0; i < vetor.length; i++) {
						vetor[i] = r.nextInt(10000);
						vetorInsertion[i] = vetor[i];
						vetorSelection[i] = vetor[i];
						vetorMerge[i] = vetor[i];
						vetorQuick[i] = vetor[i];
						vetorHeap[i] = vetor[i];
						vetorCount[i] = vetor[i];
						vetorRadix[i] = vetor[i];
						vetorBucket[i] = vetor[i];
					}
					/*
					 * BubbleSort
					 */

					BubbleSort bubble = new BubbleSort();

					bubble.BubbleSort(vetor);
					System.out.println("Nº de Comparações Bubble Sort: " + bubble.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					/*
					 * InsertionSort
					 */

					InsertionSort insertion = new InsertionSort();

					insertion.InsertionSort(vetorInsertion);
					System.out.println("Nº de Comparações Insertion Sort: " + insertion.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * SelectionSort
					 */

					SelectionSort selection = new SelectionSort();

					selection.SelectionSort(vetorSelection);
					System.out.println("Nº de Comparações Selection Sort: " + selection.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * MergeSort
					 */

					MergeSort merge = new MergeSort();

					merge.MergeSort(vetorMerge, 0, vetorMerge.length - 1);
					System.out.println("Nº de Comparações Merge Sort: " + merge.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * HeapSort
					 */

					HeapSort heap = new HeapSort();

					heap.HeapSort(vetorHeap);
					System.out.println("Nº de Comparações Heap Sort: " + heap.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * QuickSort
					 */

					QuickSort quick = new QuickSort();

					quick.QuickSort(vetorQuick, 0, vetorQuick.length - 1);
					System.out.println("Nº de Comparações Quick Sort: " + quick.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * CountSort
					 */

					CountSort count = new CountSort();

					count.countSort(vetorCount);
					System.out.println("Nº de Comparações Count Sort: " + count.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * RadixSort
					 */

					RadixSort radix = new RadixSort();

					radix.Radixsort(vetorRadix);
					System.out.println("Nº de Comparações Radix Sort: " + radix.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					/*
					 * BucketSort
					 */

					BucketSort bucket = new BucketSort();

					bucket.BucketSort(vetorBucket, vetor.length);
					System.out.println("Nº de Comparações Bucket Sort: " + bucket.contadorFinal());
					System.out.println("Vetor tamanho: " + (vetor.length) + "\n");
					
					System.out.println("======================================================");
				}
				break;

			case 7:

				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalido");
				break;
			}
		} while (opcao != 7);
	}
}
