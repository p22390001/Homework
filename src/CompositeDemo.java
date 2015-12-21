
public class CompositeDemo {

	public static void main(String[] args) {
		Paper Paper1=new Paper(),Paper2=new Paper();
		
		Paper1.AddQuestion(new Question("5X9=?"));
		Paper1.AddQuestion(new Question("9+100=?"));
		
		Paper2.AddQuestion(Paper1.GetQuestion(1));
		Paper2.AddQuestion(new Question("100X100=?"));
		Paper2.AddQuestion(new Question("50-36=?"));
		
		System.out.println("考卷1:");
		Paper1.print();
		
		System.out.println("考卷2:");
		Paper2.print();
		
		Paper2.RemoveQuestion(Paper2.GetQuestion(2));
		System.out.println("考卷2(移除第2題):");
		Paper2.print();

	}

}
