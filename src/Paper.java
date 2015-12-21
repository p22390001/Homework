import java.util.ArrayList;

public class Paper extends Exam {

	ArrayList<Exam> PaperList;

	public Paper() {

		PaperList = new ArrayList<Exam>();

	}

	public void print() {

		int PaperSize = PaperList.size();
		for (int i = 0; i < PaperSize; i++) {

			PaperList.get(i).print();

		}
	}

	public void AddQuestion(Exam Exam) {

		PaperList.add(Exam);

	}

	public void RemoveQuestion(Exam Exam) {

		PaperList.remove(Exam);

	}

	public Exam GetQuestion(int i) {

		return PaperList.get(i - 1);

	}

}
