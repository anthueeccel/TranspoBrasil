package br.com.cursojava.produtos;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.TreeNode;

public class DocumentService {

	private String name;
	private long size;
	private String type;

	public TreeNode createDocuments;
	
	
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public TreeNode getCreateDocuments() {
		return createDocuments;
	}

	public void setCreateDocuments(TreeNode createDocuments) {
		this.createDocuments = createDocuments;
	}

	public TreeNode createDocuments() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
