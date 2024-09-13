public class InsereOrdenadoFilaPrioridade implements FilaPrioridade {

	private Pair[] fila;
	private int head;
	private int last;

	public InsereOrdenadoFilaPrioridade(int capacidade) {
		this.fila = new Pair[capacidade];
		this.last = -1;
		this.head = -1;
	}
	
	// criar um Pair e inserir de forma ordenada decrescente no array.
	public void add(String elemento, int prioridade) {
		Pair entry = new Pair(elemento, prioridade);
		if (this.head == -1 && this.last == -1)
		{
			this.head = 0;
			this.last = 0;
			fila[0] = entry;
			return;
		}
		else this.last++;

		this.fila[last] = entry;
		for (int i = last; i >= head; i++)
		{
			if (fila[i - 1].getPrioridade() < entry.getPrioridade())
			{
				break;
			}
			Pair temp = fila[i - 1];
			fila [i - 1] = fila[i];
			fila[i] = temp;
		}
	}

	// remover e retornar o primeiro elemento do array, que é o de maior prioridade. lembrar manipular head e tail
	// para ser uma fila circular. assim a remoção fica O(1)
	public String removeNext() {
		Pair toRemove = fila[head];
		head = (head + 1) % fila.length;
		return toRemove.getElemento();
	}

}
