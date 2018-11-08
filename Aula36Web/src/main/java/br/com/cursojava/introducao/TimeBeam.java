package br.com.cursojava.introducao;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="timeBeam")
@SessionScoped
public class TimeBeam {
	
	
	private String nome;
	
	private String timeFutebol;
	
	private int timePosicao;
	
	public int getTimePosicao() {
		return timePosicao;
	}

	public void setTimePosicao(int timePosicao) {
		this.timePosicao = timePosicao;
	}

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTimeFutebol() {
		return timeFutebol;
	}

	public void setTimeFutebol(String timeFutebol) {
		this.timeFutebol = timeFutebol;
	}

	public String getDataHora() {
		return sdf.format(new Date());
	}

	public String enviar() {
		if(nome != null && timeFutebol != null) {
			return "resultado";
		} else {
			return null;
		}
	}

}
