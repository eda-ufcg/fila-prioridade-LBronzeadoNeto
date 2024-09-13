import java.util.ArrayList;

public class InsereFinalFilaPrioridade implements FilaPrioridade {

	private ArrayList<Pair> fila;

	public InsereFinalFilaPrioridade(int capacidade) {
		this.fila = new ArrayList<Pair>(capacidade);
	}
	
	// criar um Pair e adicionar no fim da fila
	public void add(String elemento, int prioridade) {
		Pair input = new Pair(elemento, prioridade);
		fila.add(input);
	}


	// buscar pelo elemento de maior prioridade na fila.
	public String removeNext() {
		int maxIndex = 0;
		for (int i = 1; i < fila.size(); i++)
		{
			if (fila.get(i).getPrioridade() > fila.get(maxIndex).getPrioridade())
				maxIndex = i;
		}
		Pair out = fila.get(maxIndex);
		fila.remove(maxIndex);
		return out.getElemento();
	}

}
