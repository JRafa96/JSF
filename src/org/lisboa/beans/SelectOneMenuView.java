package org.lisboa.beans;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;


@ManagedBean (name="selectOneMenuView")
public class SelectOneMenuView {
     
	
    private String tipoServiço; 
    private String carateristica;
     
     
    @PostConstruct
    public void init() {
    }
 
    public String getTipoServiço() {
        return tipoServiço;
    }
    
    public void setTipoServiço(String tipoServiço) {
    	this.tipoServiço = tipoServiço;
    }

	public String getCarateristica() {
		return carateristica;
	}

	public void setCarateristica(String carateristica) {
		this.carateristica = carateristica;
	}
    
    
    
 
}