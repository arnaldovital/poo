package netflixproj.net;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Assinatura implements Identificavel{
	@Id                                                                                                      
	@GeneratedValue
	
	@OneToOne(mappedBy="assinatura")
	private Usuario usuario;
	private String plano;
	private String mes_gratis;
	private String forma_pagamento;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public String getMes_gratis() {
		return mes_gratis;
	}

	public void setMes_gratis(String mes_gratis) {
		this.mes_gratis = mes_gratis;
	}

	public String getForma_pagamento() {
		return forma_pagamento;
	}

	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}

	@Override
	public String toString() {
		return "Assinatura [usuario=" + usuario + ", plano=" + plano + ", mes_gratis=" + mes_gratis
				+ ", forma_pagamento=" + forma_pagamento + "]";

	}

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
}