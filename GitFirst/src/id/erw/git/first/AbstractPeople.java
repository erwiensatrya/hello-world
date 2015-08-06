package id.erw.git.first;

public abstract class AbstractPeople {

	public abstract String getName();
	
	public void speak(String words) {
		System.out.println(words);
	}
}