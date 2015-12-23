package br.com.cloudkits.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.cloudkits.daos.UsuarioDao;
import br.com.cloudkits.usuario.Usuario;
import br.com.cloudkits.util.FacesUtils;

@ManagedBean
public class UsuarioBean {

	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	private List<Usuario> usuarios;

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void remove(Usuario usuario) {
		UsuarioDao dao = new UsuarioDao();
		dao.remove(usuario);
		this.usuarios = dao.lista();
		new FacesUtils().adicionaMensagemDeSucesso("Usuario removido com sucesso!");

	}

	public void lista() {
		UsuarioDao dao = new UsuarioDao();
		this.usuarios = dao.lista();
	}

	public void adiciona() {
		UsuarioDao dao = new UsuarioDao();
		dao.adiciona(this.usuario);
		this.usuario = new Usuario();

		new FacesUtils().adicionaMensagemDeSucesso("Usuario adicionado com sucesso!");
	}

	public void altera() {
		UsuarioDao dao = new UsuarioDao();
		dao.atualiza(usuario);

		new FacesUtils().adicionaMensagemDeSucesso("Usuario alterado com sucesso!");

	}
}
