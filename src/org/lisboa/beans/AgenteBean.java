package org.lisboa.beans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name="agenteBean")
@RequestScoped
public class AgenteBean {

	private String primeiroNome;
	private String telefone;
	private String email1;
	private String email2;
	private String cidade;
	
	private String form;
	
	private ArrayList<String> formList= new ArrayList<>();
	
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public ArrayList<String> getFormList() {
		return formList;
	}
	public void setFormList(ArrayList<String> formList) {
		this.formList = formList;
	}
	
	
	
	
	
}
