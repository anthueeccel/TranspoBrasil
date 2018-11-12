package br.com.cursojava;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

@ManagedBean(name ="buttonView")
public class ButtonView {
     
    private MenuModel model;
 
    @PostConstruct
    public void init() {
        model = new DefaultMenuModel();
 
        //First submenu
        DefaultSubMenu firstSubmenu = new DefaultSubMenu("Submenu Dinâmico");
 
        DefaultMenuItem item = new DefaultMenuItem("External");
        item.setUrl("http://www.primefaces.org");
        item.setIcon("ui-icon-extlink");
        firstSubmenu.addElement(item);
 
        model.addElement(firstSubmenu);
 
        //Second submenu
        DefaultSubMenu secondSubmenu = new DefaultSubMenu("Ações Dinâmicas");
 
        item = new DefaultMenuItem("Salvar");
        item.setIcon("ui-icon-disk");
        item.setCommand("#{buttonView.save}");
        item.setUpdate("messages");
        secondSubmenu.addElement(item);
 
        item = new DefaultMenuItem("Excluir");
        item.setIcon("ui-icon-closethick");
        item.setCommand("#{buttonView.delete}");
        item.setAjax(false);
        secondSubmenu.addElement(item);
 
        model.addElement(secondSubmenu);
    }
 
    public MenuModel getModel() {
        return model;
    }
 
    public void save() {
        addMessage("Dados salvos");
    }
 
    public void update() {
        addMessage("Dados atualizados");
    }
 
    public void delete() {
        addMessage("Data removidos");
    }
 
    public void buttonAction() {
        addMessage("Bem-vindo!!!");
    }
 
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
