package br.com.cursojava;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
@ViewScoped
public class LoginBean {
	
	private String email;
	private String senha;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String autenticar() {
		FacesContext ctx = FacesContext.getCurrentInstance();		
		if("b@teste.com".equals(email) && "123456".equals(senha)) {
			Usuario usuario= new Usuario("Bagrinho", email, senha);
			HttpSession session = (HttpSession)ctx.getExternalContext().getSession(true);
			session.setAttribute("usuarioLogado", usuario);
			return "index.xhtml?faces-redirect=true";		
		} else {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login Inv�lido", "Email ou senha inv�lidos");
			ctx.addMessage(null, msg);
		}		
		return null;
	}
	

}
