package br.com.cursojava.produtos;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.TreeNode;
import org.w3c.dom.Document;

@ManagedBean(name="ttBasicView")
@ViewScoped
public class DocsViewProdutos {
		    
	
		//FALTA IMPLEMENTAR
	    private TreeNode root;
	     
	    private Document selectedDocument;
	         
	    @ManagedProperty("#{documentService}")
	    private DocumentService service;
	     
	    @PostConstruct
	    public void init() {
	        root = service.createDocuments();
	    }
	 
	    public TreeNode getRoot() {
	        return root;
	    }
	 
	    public void setService(DocumentService service) {
	        this.service = service;
	    }
	 
	    public Document getSelectedDocument() {
	        return selectedDocument;
	    }
	 
	    public void setSelectedDocument(Document selectedDocument) {
	        this.selectedDocument = selectedDocument;
	    }
	}
