public class HeapFilaPrioridade implements FilaPrioridade {

	private Heap heap;

	public HeapFilaPrioridade(int capacidade) {
		this.heap = new Heap(capacidade);
	}

	// adicionar o pair no heap
	public void add(String elemento, int prioridade) {
		Pair element = new Pair(elemento, prioridade);
		heap.add(element);
	}

	// recuperar a raiz
	public String removeNext() {
		return heap.remove();
	}

}