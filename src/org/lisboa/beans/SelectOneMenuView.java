package org.lisboa.beans;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;


@ManagedBean (name="selectOneMenuView")
public class SelectOneMenuView {
     
	
    private String tipoServi�o; 
    private String carateristica;
     
     
    @PostConstruct
    public void init() {
    }
 
    public String getTipoServi�o() {
        return tipoServi�o;
    }
    
    public void setTipoServi�o(String tipoServi�o) {
    	this.tipoServi�o = tipoServi�o;
    }

	public String getCarateristica() {
		return carateristica;
	}

	public void setCarateristica(String carateristica) {
		this.carateristica = carateristica;
	}
    
    
    
 
}