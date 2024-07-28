package prototype;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Inode {
	private String name;
	List<Inode> childrenInodes;

	public Folder(String name) {
		super();
		this.name = name;
		this.childrenInodes = new ArrayList<>();
	}

	@Override
	public void print(String indentation) {
		System.out.println(indentation + name);
		for (Inode inode : childrenInodes) {
			inode.print(indentation + indentation);
		}
	}

	public Inode clone() {
		Folder clonFolder = new Folder(name + "_clone");
		for (Inode inode : childrenInodes) {
			clonFolder.add(inode.clone());
		}
		return clonFolder;
	}

	public void add(Inode inode) {
		this.childrenInodes.add(inode);
	}

}
