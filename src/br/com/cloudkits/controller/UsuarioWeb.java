package br.com.cloudkits.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.cloudkits.usuario.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioWeb implements Serializable {

	private Usuario usuario;

	public void loga(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuarioWeb(Usuario usuario) {
		this.usuario = usuario;

	}

}
