import java.util.ArrayList;

class CareTaker {
	ArrayList<Memento> savedArticles = new ArrayList<Memento>();
	public void addMemento(Memento m) { savedArticles.add(m); }
	public Memento getMemento(int index) { return savedArticles.get(index); }
}
