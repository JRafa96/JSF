package org.lisboa.actions;

import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.lisboa.beans.AgenteBean;
import org.lisboa.beans.SelectOneMenuView;

@ManagedBean(name = "agenteActions")
@RequestScoped
public class AgenteActions {

	@ManagedProperty(value = "#{agenteBean}")
	private AgenteBean agenteBean;

	@ManagedProperty(value = "#{selectOneMenuView}")
	private SelectOneMenuView menu;

	public AgenteBean getAgenteBean() {
		return agenteBean;
	}

	public void setAgenteBean(AgenteBean agenteBean) {
		this.agenteBean = agenteBean;
	}

	public SelectOneMenuView getMenu() {
		return menu;
	}

	public void setMenu(SelectOneMenuView menu) {
		this.menu = menu;
	}

	public boolean validateEmail() {
		if (agenteBean.getEmail1().contentEquals(agenteBean.getEmail2())) {
			return true;
		} else
			return false;
	}

	public void submitForm() {

		this.agenteBean.setForm("Nome:" + agenteBean.getPrimeiroNome() + "\n Telefone: " + agenteBean.getTelefone()
				+ "\n Email: " + agenteBean.getEmail1() + "\n Cidade " + agenteBean.getCidade() + "\n Tipo de serviço: "
				+ menu.getTipoServiço() + "\n Carateristica " + menu.getCarateristica());
		
		//this.agenteBean.setFormList((ArrayList<String>) Arrays.asList(agenteBean.getPrimeiroNome(), agenteBean.getTelefone(), agenteBean.getEmail1() , agenteBean.getCidade(), menu.getTipoServiço(), menu.getCarateristica()));

	}
}
