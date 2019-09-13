package org.lisboa.actions;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.lisboa.beans.userBean;

@ManagedBean(name = "userActions")
@RequestScoped
public class UserActions {

	@ManagedProperty(value = "#{userBean}")
	private userBean userBean;

	public void submitMessage() {
		this.userBean.setMessage("Hello " + userBean.getName() + " " + userBean.getApelido());
	}

	public userBean getUserBean() {
		return userBean;
	}

	public void setUserBean(userBean userBean) {
		this.userBean = userBean;
	}

}
