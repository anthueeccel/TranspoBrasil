package br.com.cursojava;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AutorizacaoFilter implements Filter {
 
	public void destroy() {
	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//	 aqui roda antes do servlets
		
		HttpServletRequest req = (HttpServletRequest) request;
		String path = req.getServletPath();
		if(!"/login.xhtml".equals(path)) {
			boolean ok = validarAutorizacao(req);
			if(ok) {
				chain.doFilter(request, response);
			} else {
				HttpServletResponse resp = (HttpServletResponse) response;
				resp.sendRedirect(req.getContextPath()+"/login.xhtml");
			}
		} else {
			chain.doFilter(request, response);			
		}
		System.out.println("path ==> " + path);		
//		aqui roda depois do servlets
	}

	private boolean validarAutorizacao(HttpServletRequest req) {
		 HttpSession session = req.getSession(false);
		 if(session != null && session.getAttribute("usuarioLogado") != null) {
			 return true;
		 }
		return false;
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
