package finalprogramming;

public abstract class ListOfObjects {

	
	Read readFile;
	
	void fillList(String path) {
		readFile = new ReadTextFile(path);
	}
	
	public abstract void fillObject();
	
    public abstract Object getObjectById(String id);

}
