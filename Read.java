package finalprogramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public abstract class Read {
	
	private ArrayList<ArrayList<String>> array = new ArrayList<ArrayList<String>>();

	public abstract void readFile(String path);

	public abstract void close(FileReader fr);

	public abstract void close(BufferedReader br);
	
	public ArrayList<ArrayList<String>> getArray() {
		return array;
	}

	public void setArray(ArrayList<ArrayList<String>> array) {
		this.array = array;
	}
}
