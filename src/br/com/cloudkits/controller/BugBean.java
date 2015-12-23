package br.com.cloudkits.controller;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedProperty;

import br.com.cloudkits.daos.BugDao;
import br.com.cloudkits.usuario.Bug;
import br.com.cloudkits.usuario.Status;
import br.com.cloudkits.util.FacesUtils;

@javax.faces.bean.ManagedBean
public class BugBean {

	private Bug bug = new Bug();

	@ManagedProperty("#{bugDao}")
	private BugDao dao;

	public Bug getBug() {
		return bug;
	}

	public void setBug(Bug bug) {
		this.bug = bug;
	}

	public BugDao getDao() {
		return dao;
	}

	public void setDao(BugDao dao) {
		this.dao = dao;
	}

	public void adiciona() {
		dao.salva(bug);
		this.bug = new Bug();
		new FacesUtils().adicionaMensagemDeSucesso("Bug adicionado com sucesso!");
	}

	public List<Status> getTodosOsStatus() {
		return Arrays.asList(Status.values());
	}

}
