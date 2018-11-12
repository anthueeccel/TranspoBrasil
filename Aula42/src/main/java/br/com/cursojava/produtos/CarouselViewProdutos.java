package br.com.cursojava.produtos;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.ToggleEvent;

@ManagedBean
@ViewScoped
public class CarouselViewProdutos implements Serializable {
        
	private static final long serialVersionUID = 1L;

	private List<Produto> produtos;
     
    private Produto produtoSelecionado;
     
    @ManagedProperty("#{produtoService}")
    private ProdutoDAO service;
     
    @PostConstruct
    public void init() {
        produtos = service.adicionarProduto(null);
    }
 
    public List<Produto> getProdutos() {
        return produtos;
    }
 
    public void setService(ProdutoDAO service) {
        this.service = service;
    }
 
    public Produto getSelectedProduto() {
        return produtoSelecionado;
    }
 
    public void setSelectedProduto(Produto produtoSelecionado) {
        this.produtoSelecionado = produtoSelecionado;
    }
    
    public void handleToggle(ToggleEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Toggled", "Visibility:" + event.getVisibility());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    
}